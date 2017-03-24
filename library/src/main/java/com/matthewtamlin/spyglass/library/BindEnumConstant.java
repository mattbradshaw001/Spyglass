package com.matthewtamlin.spyglass.library;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface BindEnumConstant {
	int annotationId();

	Class<? extends Enum> enumClass();

	int ordinal();
}