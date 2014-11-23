package org.kk.jsonconversion.util;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * convert Integer object to String while serialization.
 * 
 * @author krishnakumar
 * 
 */
public class JsonIntegerStringConversion implements JsonSerializer<Integer> {

	public JsonElement serialize(Integer integer, Type type, JsonSerializationContext context) {
		return new JsonPrimitive(String.valueOf(integer));
	}

}
