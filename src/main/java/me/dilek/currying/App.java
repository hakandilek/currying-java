package me.dilek.currying;

import static me.dilek.currying.Curry.*;

import java.util.function.BiFunction;

public class App {
	
	static BiFunction<Integer, Integer, Integer > volume = (w, h) -> 1 * w * h;
	
	public static void main(String[] args) {
		int val = volume.apply(3, 5);
		System.out.println(val);
		
		val = curry(volume).apply(3).apply(5);
		System.out.println(val);
	}

}
