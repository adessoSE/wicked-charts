package com.googlecode.wickedcharts.chartjs.jackson;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.googlecode.wickedcharts.chartjs.chartoptions.colors.*;
import com.googlecode.wickedcharts.chartjs.jackson.serializer.*;
import com.googlecode.wickedcharts.chartjs.json.JsonValueEnum;
import com.googlecode.wickedcharts.chartjs.json.LowercaseEnum;

public class JsonRenderer {
	private final ObjectMapper jacksonMapper;

	private final WickedChartsJacksonModule jacksonModule;

	public final static ObjectMapper DEFAULT_MAPPER = createDefaultObjectMapper();

	public JsonRenderer() {
		this.jacksonModule = new WickedChartsJacksonModule();
		this.jacksonMapper = createJacksonMapper();
	}

	/**
	 * This method gives the opportunity to add a custom serializer to serializer
	 * one of the highchart option classes. It may be neccessary to serialize
	 * certain option classes differently for different web frameworks.
	 *
	 * @param clazz
	 *            the option class
	 * @param serializer
	 *            the serializer responsible for serializing objects of the option
	 *            class.
	 */
	public <T> void addSerializer(final Class<T> clazz, final JsonSerializer<T> serializer) {
		this.jacksonModule.addSerializer(clazz, serializer);
	}

	private ObjectMapper createJacksonMapper() {
		this.jacksonModule.addSerializer(SimpleColor.class, new SimpleColorSerializer());
		this.jacksonModule.addSerializer(RgbColor.class, new RgbColorSerializer());
		this.jacksonModule.addSerializer(RgbaColor.class, new RgbaColorSerializer());
		this.jacksonModule.addSerializer(JsonValueEnum.class, new JsonValueEnumSerializer());
		this.jacksonModule.addSerializer(LowercaseEnum.class, new LowercaseEnumSerializer());

		ObjectMapper mapper = createDefaultObjectMapper();
		SingleElementListObjectMapper.getInstance().registerModule(jacksonModule);
		mapper.setLocale(Locale.ENGLISH);
		mapper.registerModule(this.jacksonModule);
		return mapper;
	}

	private static ObjectMapper createDefaultObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
		mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		mapper.setSerializationInclusion(Include.NON_NULL);
		return mapper;
	}
	
	public String toJson(final Object object) {
		try {
			return this.jacksonMapper.writeValueAsString(object);
		} catch (Exception e) {
			throw new RuntimeException(
					"Error trying to serialize object of type " + object.getClass().getName() + " into JSON!", e);
		}
	}

	public <T> T fromJson(final String json, final Class<T> targetClazz) {
		try {
			return this.jacksonMapper.readValue(json, targetClazz);
		} catch (Exception e) {
			throw new RuntimeException(
					"Error trying to deserialize object of type " + targetClazz.getName() + " into JSON!", e);
		}
	}
}