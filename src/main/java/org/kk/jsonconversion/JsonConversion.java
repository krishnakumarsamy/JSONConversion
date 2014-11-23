package org.jsonconversion;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.jsonconversion.model.StudentFormBean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @author krishnakumar
 * 
 */
public class JsonConversion {

	public static void main(String[] args) {

		final Map<String, StudentFormBean> map = new HashMap<String, StudentFormBean>();
		map.put("Student1", new StudentFormBean("ECE2014001", "Jon", 24));
		map.put("Student2", new StudentFormBean("ECE2014002", "James", 23));
		map.put("Student3", new StudentFormBean("ECE2014003", "Hari", 24));
		map.put("Student4", new StudentFormBean("ECE2014004", "Sam", 23));

		final String json = new Gson().toJson(map);
		System.out.println(json);

		Type listType = new TypeToken<HashMap<String, StudentFormBean>>() {
		}.getType();

		final Map<String, StudentFormBean> convertedMap = new Gson().fromJson(json, listType);
		for (Entry<String, StudentFormBean> studentEntry : convertedMap.entrySet()) {
			StudentFormBean bean = studentEntry.getValue();
			System.out.println(bean);
		}
	}
}
