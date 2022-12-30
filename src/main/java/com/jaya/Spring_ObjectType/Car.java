package com.jaya.Spring_ObjectType;

public class Car {

public Car()
{
	System.out.println("Car class constructor");
}
private String carname;
private Engine engine;


public String getCarname() {
	return carname;
}
public Engine getEngine() {
	return engine;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}

public void printData()
{
	System.out.println("Carname="+carname);
	System.out.println("ModelName="+engine.getModelname());
}

}
