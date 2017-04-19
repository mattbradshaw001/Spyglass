package com.matthewtamlin.spyglass.library_tests.value_handler_adapters;

import android.content.res.TypedArray;
import android.support.test.runner.AndroidJUnit4;

import com.matthewtamlin.spyglass.library.value_handler_adapters.StringHandlerAdapter;
import com.matthewtamlin.spyglass.library.value_handler_annotations.StringHandler;

import org.junit.Before;
import org.junit.runner.RunWith;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SuppressWarnings("ResourceType")
@RunWith(AndroidJUnit4.class)
public class TestStringHandlerAdapter extends TestValueHandlerAdapter<
		String,
		StringHandler,
		StringHandlerAdapter> {

	private static final int ATTRIBUTE_ID = 2389;

	private String expectedValue;

	private TypedArray containingAttribute;

	private TypedArray missingAttribute;

	private StringHandler annotations;

	private StringHandlerAdapter adapter;

	@Before
	public void setup() {
		expectedValue = "Some String";

		containingAttribute = mock(TypedArray.class);
		when(containingAttribute.hasValue(ATTRIBUTE_ID)).thenReturn(true);
		when(containingAttribute.getString(eq(ATTRIBUTE_ID))).thenReturn(expectedValue);

		missingAttribute = mock(TypedArray.class);
		when(missingAttribute.hasValue(ATTRIBUTE_ID)).thenReturn(false);
		when(missingAttribute.getString(eq(ATTRIBUTE_ID))).thenReturn(null);

		annotations = mock(StringHandler.class);
		when(annotations.attributeId()).thenReturn(ATTRIBUTE_ID);

		adapter = new StringHandlerAdapter();
	}

	@Override
	public String getExpectedValue() {
		return expectedValue;
	}

	@Override
	public TypedArray getTypedArrayContainingAttribute() {
		return containingAttribute;
	}

	@Override
	public TypedArray getTypedArrayMissingAttribute() {
		return missingAttribute;
	}

	@Override
	public StringHandler getAnnotation() {
		return annotations;
	}

	@Override
	public StringHandlerAdapter getAdapter() {
		return adapter;
	}

	@Override
	public int getAttributeId() {
		return ATTRIBUTE_ID;
	}
}