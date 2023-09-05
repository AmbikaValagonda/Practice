package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Person> people = Arrays.asList(
				new Person("Ambika",5), 
				new Person("Venky",10),
				new Person("Honey",15),
				new Person("Honey",20),
				new Person("Honey",25),
				new Person("Honey",30)
		);
		

		
		List <Person> aboveFive = people.stream().filter(p -> p.getAge() >= 10).collect(Collectors.toList());
		
		aboveFive.forEach(person -> System.out.println(person.getName()));
		

		
		
	}

}
