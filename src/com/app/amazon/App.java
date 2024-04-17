package com.app.amazon;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Loading Beans classes
		BeanFactory bf = new FileSystemXmlApplicationContext("config.xml");

		// Casting to products data
		Products p = (Products) bf.getBean("Phones");

		// Printing Information
		System.out.println("Product Name: " + p.getProductName());
		System.out.println("Total Items: " + p.getCount());
		System.out.println("Stock: " + p.getIsAvailable());
		System.out.println("Serial Number: " + p.getSerialNo());
	}
}
