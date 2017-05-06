package com.it.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test_9_21 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "zhangsan");
		map.put("age", "19");
		map.put("sex", "man");
		Set<Map.Entry<String, String>> entry = map.entrySet();
		for (Entry<String, String> e : entry) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}
		Iterator<Entry<String, String>> iter = entry.iterator();
		while (iter.hasNext()) {
			Entry<String, String> entry2 = iter.next();
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}
		Set<String> set = map.keySet();
		System.out.println(set);
		Collection<String> col = map.values();
		System.out.println(col);
		

	}
}
