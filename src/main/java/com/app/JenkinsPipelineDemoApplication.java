package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPipelineDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hola desde Jenkins CI Pipeline!");
	}

	public static int sumar(int a, int b) {
		return a + b;
	}
}
