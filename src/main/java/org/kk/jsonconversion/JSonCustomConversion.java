package org.kk.jsonconversion;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kk.jsonconversion.model.Address;
import org.kk.jsonconversion.model.FormBean;
import org.kk.jsonconversion.model.StudentFormBean;
import org.kk.jsonconversion.util.JsonConversionUtil;
import org.kk.jsonconversion.util.JsonIntegerStringConversion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Custom JSON converter.
 * 
 * @author krishnakumar
 * 
 */
public class JSonCustomConversion {
	public static void main(String[] args) {

		final StudentFormBean studentBean = new StudentFormBean("100", "KK", 27);
		final Address addressBean = new Address("India", "27-New Street", "TamilNadu", "638056");
		final FormBean bean = new FormBean(studentBean, addressBean);
		// Serialization of custom java object using default serialization.
		System.out.println("Default Serialization : "
				+ new GsonBuilder().serializeNulls().create().toJson(bean));

		// Serialization of custom java object using default custom
		// serialization logic.
		System.out.println("Serialization of custom java object with custom logic :"
				+ new GsonBuilder()
						.serializeNulls()
						.registerTypeAdapter(FormBean.class,
								JsonConversionUtil.formBeanCustomSerializer()).create()
						.toJson(bean));

		final Map<String, Object> map = new HashMap<String, Object>();
		map.put("Name", "KK");
		map.put("Age", new Integer(27));
		map.put("Sex", "Male");
		map.put("Address1", "India");
		map.put("Address2", null);

		// Default conversion
		System.out.println(new Gson().toJson(map));

		// Custom conversion logic implemented in separate class.
		final String jsonString = new GsonBuilder().serializeNulls()
				.registerTypeAdapter(Integer.class, new JsonIntegerStringConversion()).create()
				.toJson(map);
		System.out.println("Integer to String conversion using separate class : " + jsonString);

		// Utility class related to JSON conversion.
		System.out.println("Integer to String conversion using common utility class :"
				+ new GsonBuilder()
						.registerTypeAdapter(Integer.class,
								JsonConversionUtil.integerToStringSerializer()).create()
						.toJson(map));

		// Inline implementation.
		System.out.println("Custom serialization logic using inline implementation :"
				+ new GsonBuilder()
						.registerTypeAdapter(Integer.class, new JsonSerializer<Integer>() {
							public JsonElement serialize(Integer integer, Type type,
									JsonSerializationContext context) {
								System.out.println("Custom Serialization Called : " + integer);
								return new JsonPrimitive(String.valueOf(integer));
							}
						}).create().toJson(map));

	}
}
