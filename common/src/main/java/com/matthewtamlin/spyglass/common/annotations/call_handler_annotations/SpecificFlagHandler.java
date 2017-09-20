package com.matthewtamlin.spyglass.common.annotations.call_handler_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declares a method to be called by the Spyglass framework if a specific condition is met. The annotated method will
 * only be called if the integer value mapped to the specified attribute matches with the specified flags (using a
 * bitwise-OR operation).
 *
 * This annotation should only be applied to methods which satisfy all of the following criteria: <ul> <li>The method
 * has no other handler annotations.</li> <li>The method has no default annotation.</li> <li>Every parameter has a
 * use annotation.</li> </ul>
 * <p>
 * Is it valid for a method with this annotation to have no parameters.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface SpecificFlagHandler {
	/**
	 * @return the resource ID of the handled attribute
	 */
	int attributeId();

	/**
	 * @return the specific flags handled by the method
	 */
	int handledFlags();
}