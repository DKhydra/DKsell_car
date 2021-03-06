package com.fnzb.utils;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import java.text.SimpleDateFormat;

public class JsonObjectMapper extends ObjectMapper {
	
	public JsonObjectMapper(Inclusion inclusion) {
		super();
		this.setSerializationInclusion(inclusion); // Inclusion.ALWAYS
		this.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		this.getSerializationConfig().withDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		this.getDeserializationConfig().withDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}

}
