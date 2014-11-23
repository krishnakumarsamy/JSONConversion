package org.kk.jsonconversion.util;

import java.lang.reflect.Type;

import org.kk.jsonconversion.model.FormBean;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Utility class for custom json serialization.
 * 
 * @author krishnakumar
 * 
 */
public class JsonConversionUtil {

	/**
	 * Used to convert FormBean object to custom defined JSON object.
	 * 
	 * @return
	 */
	public static JsonSerializer<FormBean> formBeanCustomSerializer() {
		return new JsonSerializer<FormBean>() {
			public JsonElement serialize(FormBean bean, Type arg1, JsonSerializationContext arg2) {
				JsonObject object = new JsonObject();
				object.addProperty("registerNumber", bean.getStudentFormBean().getRegisterNumber());
				object.addProperty("Name", bean.getStudentFormBean().getName());
				object.addProperty("address", bean.getAddress().getAddress1());
				return object;
			}
		};
	}

	/**
	 * Convert integer object to String.
	 * 
	 * @return
	 */
	public static JsonSerializer<Integer> integerToStringSerializer() {
		return new JsonSerializer<Integer>() {
			public JsonElement serialize(Integer integer, Type type,
					JsonSerializationContext context) {
				System.out.println("Custom Serialization Called : " + integer);
				return new JsonPrimitive(String.valueOf(integer));
			}
		};
	}
}
