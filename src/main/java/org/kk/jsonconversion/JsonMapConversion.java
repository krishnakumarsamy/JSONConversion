package org.kk.jsonconversion;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Convert simple map to JSON String.
 * 
 * @author krishnakumar
 * 
 */
public class JsonMapConversion {
	public static void main(String[] args) {
		final Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "KK");
		map.put("Age", "27");
		map.put("Sex", "Male");
		map.put("Address1", "India");
		map.put("Address2", null);
		final String jsonString = new Gson().toJson(map);
		final String jsonStringWithNull = new GsonBuilder().serializeNulls().create().toJson(map);
		System.out.println("JSON Serialization default behaviour:" + jsonString);
		System.out.println("JSON Serialization with null values:" + jsonStringWithNull);
	}
}
