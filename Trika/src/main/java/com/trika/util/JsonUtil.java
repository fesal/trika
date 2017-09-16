package com.trika.util;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trika.exception.ExceptionType;
import com.trika.exception.JsonBaseException;

public class JsonUtil {

private static ObjectMapper mapper = new ObjectMapper();
	

	public static String getJSON(Object object){
		try { 
			   mapper.setSerializationInclusion(Include.NON_NULL);
			   return mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			JsonException je = new JsonException(ExceptionType.COULD_NOT_JSON_CREATED, e);
			try {
				return mapper.writeValueAsString(je.getError(je.getCode(), je.getMessage()));
			} catch (JsonProcessingException e1) {
				return "{"+e1.getMessage()+"}";
			}
		}
	}
	
	public static Object getObjectFromJSON(String json, Object o){
		try {
			return new ObjectMapper().readValue(json, o.getClass());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}
}
