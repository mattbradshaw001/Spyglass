package com.matthewtamlin.spyglass.library_tests.util.use_annotations;

import com.matthewtamlin.spyglass.library.use_adapters.UseNullAdapter;
import com.matthewtamlin.spyglass.library.use_annotations.UseNull;

import java.lang.annotation.Annotation;

public class TestUseNull extends BaseTest {
	@Override
	public Class<? extends Annotation> getAnnotationUnderTest() {
		return UseNull.class;
	}

	@Override
	public Class getExpectedAdapterClass() {
		return UseNullAdapter.class;
	}
}