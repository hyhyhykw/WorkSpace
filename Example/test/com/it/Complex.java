package com.it;

public class Complex {// 复数类

	private double realPart;// 代表复数的实数部分
	private double imaginPart;// 代表复数的虚数部分

	public Complex() {

	}

	public Complex(double realPart, double imaginPart) {
		this.realPart = realPart;
		this.imaginPart = imaginPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginPart() {
		return imaginPart;
	}

	public void setImaginPart(double imaginPart) {
		this.imaginPart = imaginPart;
	}

	public Complex add(Complex com) {
		return new Complex(this.realPart + com.realPart, this.imaginPart + com.imaginPart);
	}

	public Complex subtraction(Complex com) {
		return new Complex(this.realPart - com.realPart, this.imaginPart - com.imaginPart);
	}

	public Complex multiply(Complex com) {
		return new Complex(this.realPart * com.realPart - this.imaginPart * com.imaginPart,
				this.realPart * com.imaginPart + this.imaginPart * com.realPart);
	}

	public Complex divide(Complex com) {
		double num = com.realPart * com.realPart + com.imaginPart * com.imaginPart;
		return new Complex(this.multiply(com).realPart / num, this.multiply(com).imaginPart / num);
	}

	@Override
	public String toString() {
		if (this.imaginPart == 0) {
			return String.valueOf(this.realPart);
		} else if (this.realPart == 0) {
			return imaginPart + "i";
		} else {
			return realPart + "+" + imaginPart + "i";
		}
	}

}
