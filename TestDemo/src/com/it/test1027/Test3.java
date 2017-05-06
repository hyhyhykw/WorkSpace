package com.it.test1027;

import java.io.IOException;
import java.io.PrintStream;

public class Test3 {
	public static void main(String[] args) throws IOException {
		PrintStream out = new PrintStream("E:/Java/out.bat");
		System.setOut(out);
//		 FileInputStream in = new FileInputStream("E:/Java/in.txt");
//		 System.setIn(in);
//		 InputStream ins = System.in;
//		 byte bs[] = new byte[1024];
//		 int count = 0;
//		 while ((count = ins.read(bs)) != -1) {
//		 System.out.println(new String(bs, 0, count));
//		 }
		for (int i = 0; i <= 0xffff; i++) {
			System.out.print((char) i);
			if (i % 30 == 0) {
				System.out.println();
			}
		}

	}
}
