package com.lazarescu.licenta;

public class MeniuPrincipal extends Meniu {
	public static void main(String[] args) {

		meniu();
	}

	public static void meniu() {

		FrameLogin login = new FrameLogin();
		login.setVisible(true);
	}
}
