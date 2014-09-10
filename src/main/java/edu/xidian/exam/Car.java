package edu.xidian.exam;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	private String brand;
	private int maxspeed;
	private double price;
	public Car(){
		
	}
	public static class Driver{
		private String name;
		public void setName(String name){
			this.name = name;
		}
	}
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("set brand");
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Test
	public void carbeantest(){
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"edu/xidian/exam/application-config.xml"});
		Car car = context.getBean("carbean",Car.class);
		Driver driver = context.getBean("driverbean",Driver.class);
		
		System.out.println("car driver:"+driver.name);
		System.out.println("car brand:"+car.brand);
		System.out.println("car maxspeed:"+car.maxspeed);
	}
}
