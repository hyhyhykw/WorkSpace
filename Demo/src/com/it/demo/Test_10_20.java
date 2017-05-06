package com.it.demo;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
	String name;

	public Student(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return "name=" + name;
	}

}

class MComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class Test_10_20 {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>(new MComparator());
		set.add(new Student("hepingan"));
		set.add(new Student("gaochunbo"));
		set.add(new Student("guojiahui"));
		set.add(new Student("lituo"));
		System.out.println(set);
		TreeSet<Student> set2 = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return -o1.name.compareTo(o2.name);
			}
		});
		set2.addAll(set);
		System.out.println(set2);
	}
}
