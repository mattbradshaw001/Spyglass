package com.matthewtamlin.spyglass.library.handler_annotations;

import com.matthewtamlin.spyglass.library.handler_processors.EnumHandlerAdapter;
import com.matthewtamlin.spyglass.library.meta_annotations.Handler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Handler(processorClass = EnumHandlerAdapter.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface EnumHandler {
	int attributeId();

	Class<? extends Enum> enumClass();

	boolean mandatory() default false;
}