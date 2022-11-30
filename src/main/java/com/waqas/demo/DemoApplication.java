package com.waqas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public DemoApplication(){
		System.out.println("waqas");

		//Int
		int i = 1_000_000_000;
		System.out.println(i);
		int x = 0765; // Octa
		int y = 0b101; // Binary
		int z = 0xAAA; // Hexa
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		//Long
		long j1 = 1897;
		long j2 = 1897L;
		long j3 = 1897l;
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);

		show(5);
		show(5L);

		//Float
		float f = 0.5F;
		System.out.println(f);

		//Boolean
		boolean b = true;
		boolean b2 = false;

		//Double Quotes and Single Quotes
		//Single quotes for Character
		// Double quotes for String
		String str = "waqas";
		char str2 = 'a';
		System.out.println(str);
		System.out.println(str2);

		char str3 = 65;
		System.out.println(str3);
	}

	public void show(int a){
		System.out.println("Int");
		System.out.println(a);
	}

	public void show(long a){
		System.out.println("Long");
		System.out.println(a);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
