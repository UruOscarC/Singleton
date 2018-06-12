package com.ogcg.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		sing1.readNum();
		sing2.readNum();
	}

}
