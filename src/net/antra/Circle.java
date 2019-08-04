package net.antra;

public class Circle extends Shape{
	private double radius;
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}
}