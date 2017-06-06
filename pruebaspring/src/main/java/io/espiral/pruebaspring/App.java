package io.espiral.pruebaspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.espiral.beans.Mundo;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("io/espiral/xml/beans.xml");
		
		Mundo m = (Mundo) appContext.getBean("mundo"); // También se podría poner Mundo.class
		
		System.out.println(m.getSaludo());

	}

}
