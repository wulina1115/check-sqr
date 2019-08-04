package net.antra;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public Rectangle(double width, double length) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width*this.length;
	}
}