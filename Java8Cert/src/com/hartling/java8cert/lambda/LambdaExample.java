package com.hartling.java8cert.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
	public int x = 0;

	public static void printPersons(
			List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	public static void main(String... args) {
		Arrays.asList(new Person());
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 10; ++i) {
			Person p = new Person();
			p.setAge(i);
			p.setName("p" + i);
			persons.add(p);
		}

		printPersons(persons, (Person p) -> p.getAge() > 5);
		printPersons(persons, p -> p.getAge() > 5);
	}

}

class Person {
	private String name;
	private int age;

	public void printPerson() {
		System.out.println("name = " + name + ", age = " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
