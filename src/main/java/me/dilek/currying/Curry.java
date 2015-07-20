package me.dilek.currying;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Curry {

	public static <V1, V2, V3> Function<V1, Function<V2, V3>> curry(final BiFunction<V1, V2, V3> f) {
		return (V1 v1) -> (V2 v2) -> f.apply(v1, v2);
	}

	public static <V1, V2, V3> BiFunction<V1, V2, V3> uncurry(Function<V1, Function<V2, V3>> f) {
		return (V1 v1, V2 v2) -> f.apply(v1).apply(v2);
	}
	
}
