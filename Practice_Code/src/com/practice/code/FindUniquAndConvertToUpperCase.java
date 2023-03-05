package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUniquAndConvertToUpperCase {
	
	public static void main(String[] args) {
		List<String> str1 = Arrays.asList("a","b","c");
		List<String> str2 = Arrays.asList("c","d","e");
		
		List<String> list = new ArrayList<>();
		list.addAll(str1);
		list.addAll(str2);
		
		list.stream().map(i->i.toUpperCase()).forEach(System.out::print);
	}
}