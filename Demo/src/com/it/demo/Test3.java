package com.it.demo;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	String name;
	Integer age;

	public Person() {

	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age.compareTo(o2.age);
	}

}

public class Test3 {
	public static void main(String[] args) {
		Person[] pers = new Person[3];
		pers[0] = new Person("zhangsan", 20);
		pers[1] = new Person("lisi", 15);
		pers[2] = new Person("wangwu", 30);
		// Arrays.sort(pers);
		Arrays.sort(pers, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age.compareTo(o2.age);
			}
		});
		for (Person person : pers) {
			System.out.println(person);
		}

	}
}
