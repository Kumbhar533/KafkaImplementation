package com.nilesh.kafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {

//		String s = "abpple app";
//
//		List<Character> characters = new ArrayList<Character>();
//
//		char[] c = s.toCharArray();
//
//		for (char el : c) {
//			if (el != ' ') {
//				characters.add(el);
//			}
//		}
//
//		List<Character> uniqueCharacters = characters.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Step 1: Group and count
//				.entrySet().stream() 
//				.filter(entry -> entry.getValue() == 1) 
//				.map(entry -> entry.getKey()) 
//				.collect(Collectors.toList()); 
//
//		System.out.println(uniqueCharacters);

		SpringApplication.run(KafkaProducerApplication.class, args);
	}

}
