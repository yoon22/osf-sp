package com.osf.sp.ioc2;

public class Hyundai implements CarMaker{
	private Car c;
	public Hyundai(Car c) {
		this.c = c;
	}
	public void sellCar() {
		System.out.println("현대자동차 : " + c + "");
	}
}
