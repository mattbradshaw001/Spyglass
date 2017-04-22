package com.matthewtamlin.spyglass.library.value_handler_annotations;

import com.matthewtamlin.java_utilities.testing.Tested;
import com.matthewtamlin.spyglass.library.meta_annotations.ValueHandler;
import com.matthewtamlin.spyglass.library.value_handler_adapters.FractionHandlerAdapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Tested(testMethod = "automated")
@ValueHandler(adapterClass = FractionHandlerAdapter.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FractionHandler {
	int attributeId();

	int baseMultiplier() default 1;

	int parentMultiplier() default 1;
}