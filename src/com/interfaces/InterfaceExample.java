package com.interfaces;

interface laptop {
	void camera();

}

interface phone extends laptop {
	void music();

}
class Tv{}

public class InterfaceExample implements  laptop {

	@Override
	public void camera() {

	}

	@Override
	public void music() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		InterfaceExample e = new InterfaceExample();
		e.music();
		e.camera();
	}

}
