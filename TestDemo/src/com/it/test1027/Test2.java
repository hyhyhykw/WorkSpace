package com.it.test1027;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Test2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person per = new Person("zhangsan", 23);
		FileOutputStream fos = new FileOutputStream("E:/Java/name.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(per);
		oos.close();
		FileInputStream fis = new FileInputStream("E:/Java/name.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person obj = (Person) ois.readObject();
		ois.close();
		System.out.println(per + "   " + obj);
	}
}
