package com.matthewtamlin.spyglass.integration_tests.annotation_combination_tests.use_annotation_combinations;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;

import com.matthewtamlin.spyglass.markers.annotations.default_annotations.DefaultToString;
import com.matthewtamlin.spyglass.markers.annotations.use_annotations.UseChar;
import com.matthewtamlin.spyglass.markers.annotations.value_handler_annotations.StringHandler;
import com.matthewtamlin.spyglass.consumer.Spyglass;
import com.matthewtamlin.spyglass.integration_tests.R;
import com.matthewtamlin.spyglass.integration_tests.framework.ReceivedValue;

import java.util.ArrayList;
import java.util.List;

public class WithUseChar extends UseAnnotationsTestTargetBase {
	public WithUseChar(final Context context) {
		super(context);
		init(null, 0, 0);
	}

	public WithUseChar(final Context context, final AttributeSet attrs) {
		super(context, attrs);
		init(attrs, 0, 0);
	}

	public WithUseChar(final Context context, final AttributeSet attrs, final int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(attrs, defStyleAttr, 0);
	}

	@RequiresApi(21)
	@TargetApi(21)
	public WithUseChar(
			final Context context,
			final AttributeSet attrs,
			final int defStyleAttr,
			final int defStyleRes) {

		super(context, attrs, defStyleAttr, defStyleRes);
		init(attrs, defStyleAttr, defStyleRes);
	}

	@StringHandler(attributeId = R.styleable.UseAnnotationsTestTargetBase_useAnnotationsAttr)
	@DefaultToString("default value")
	public void handlerMethod(
			final String arg0,
			@UseChar('a') final Object arg1,
			@UseChar('b') final Character arg2,
			@UseChar('c') final char arg3) {

		final List<Object> invocationArgs = new ArrayList<>();

		invocationArgs.add(arg0);
		invocationArgs.add(arg1);
		invocationArgs.add(arg2);
		invocationArgs.add(arg3);

		setReceivedValue(ReceivedValue.of(invocationArgs));
	}

	@Override
	public ReceivedValue<List<Object>> getExpectedReceivedValues() {
		final List<Object> expectedArgs = new ArrayList<>();

		expectedArgs.add("default value");
		expectedArgs.add('a');
		expectedArgs.add('b');
		expectedArgs.add('c');

		return ReceivedValue.of(expectedArgs);
	}

	private void init(final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
		Spyglass.builder()
				.withTarget(this)
				.withAnnotationSource(WithUseChar.class)
				.withStyleableResource(R.styleable.UseAnnotationsTestTargetBase)
				.withContext(getContext())
				.withAttributeSet(attrs)
				.withDefStyleAttr(defStyleAttr)
				.withDefStyleRes(defStyleRes)
				.build()
				.passDataToMethods();
	}
}