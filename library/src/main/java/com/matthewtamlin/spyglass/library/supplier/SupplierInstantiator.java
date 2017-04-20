package com.matthewtamlin.spyglass.library.supplier;

@SuppressWarnings("TryWithIdenticalCatches") // Can't be collapsed before API 19
public class SupplierInstantiator {
	public static <T> Supplier<T> instantiateSupplier(final Class<? extends Supplier<T>> clazz) {
		try {
			return clazz.newInstance();

		} catch (final InstantiationException e) {
			final String message = "Unable to instantiate supplier of type %1$s. Is it a concrete" +
					" class with a public no-arg constructor?";

			throw new SupplierInstantiationException(String.format(message, clazz), e);

		} catch (final IllegalAccessException e) {
			final String message = "Unable to instantiate supplier of type %1$s. Is it a concrete" +
					" class with a public no-arg constructor?";

			throw new SupplierInstantiationException(String.format(message, clazz), e);
		}
	}

	public static Supplier<?> instantiateWildcardSupplier(
			final Class<? extends Supplier<?>> clazz) {

		try {
			return clazz.newInstance();

		} catch (final InstantiationException e) {
			final String message = "Unable to instantiate supplier of type %1$s. Is it a concrete" +
					" class with a public no-arg constructor?";

			throw new SupplierInstantiationException(String.format(message, clazz), e);

		} catch (final IllegalAccessException e) {
			final String message = "Unable to instantiate supplier of type %1$s. Is it a concrete" +
					" class with a public no-arg constructor?";

			throw new SupplierInstantiationException(String.format(message, clazz), e);
		}
	}
}