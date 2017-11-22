/*
 * Copyright 2017 Matthew David Tamlin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.matthewtamlin.spyglass.processor.code_generation.specific_value_is_available_method_generator;

import com.matthewtamlin.avatar.rules.ElementId;
import com.matthewtamlin.spyglass.markers.annotations.call_handler_annotations.SpecificBooleanHandler;
import com.matthewtamlin.spyglass.markers.annotations.call_handler_annotations.SpecificEnumHandler;
import com.matthewtamlin.spyglass.markers.annotations.call_handler_annotations.SpecificFlagHandler;

public class Data {
	@ElementId("specific boolean")
	@SpecificBooleanHandler(attributeId = 1, handledBoolean = true)
	public void withSpecificBoolean() {}

	@ElementId("specific enum")
	@SpecificEnumHandler(attributeId = 1, handledOrdinal = 0)
	public void withSpecificEnum() {}

	@ElementId("specific flag")
	@SpecificFlagHandler(attributeId = 1, handledFlags = 1)
	public void withSpecificFlag() {}
}