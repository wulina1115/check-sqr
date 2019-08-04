package net.antra;

public class Square extends Shape{
	private double length;

	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Square(double length) {
		// TODO Auto-generated constructor stub
		this.length = length;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length*this.length;
	}
}
