package de.adesso.wickedcharts.chartjs.jackson;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.*;
import de.adesso.wickedcharts.chartjs.chartoptions.label.ConstLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.DateTimeLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextListLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ConstValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DateTimeValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.FloatValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.jackson.serializer.*;
import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;
import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

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
		this.jacksonModule.addSerializer(StringValueColor.class, new StringValueColorSerializer());
		this.jacksonModule.addSerializer(CallbackFunction.class, new CallbackFunctionSerializer());
		this.jacksonModule.addSerializer(DateAndFormat.class, new DateAndFormatSerializer());
		this.jacksonModule.addSerializer(TextLabel.class, new TextLabelSerializer());
		this.jacksonModule.addSerializer(TextListLabel.class, new TextListLabelSerializer());
		this.jacksonModule.addSerializer(DateTimeLabel.class, new DateTimeLabelSerializer());
		this.jacksonModule.addSerializer(IntegerValue.class, new IntegerValueSerializer());
		this.jacksonModule.addSerializer(DoubleValue.class, new DoubleValueSerializer());
		this.jacksonModule.addSerializer(FloatValue.class, new FloatValueSerializer());
		this.jacksonModule.addSerializer(StringValue.class, new StringValueSerializer());
		this.jacksonModule.addSerializer(ConstValue.class, new ConstValueSerializer());
		this.jacksonModule.addSerializer(ConstLabel.class, new ConstLabelSerializer());
		this.jacksonModule.addSerializer(DateTimeValue.class, new DateTimeValueSerializer());

		
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