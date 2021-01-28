package com.cg.array;

public class Array {

	public static void main(String[] args) {
		int integer[]=new int[]{2,4,5};
		float Float[]=new float[]{2.0f,5f,7.0f};
		short Short[]=new short[]{2,5,7};
		double Double[]=new double[]{20,75,101};
		byte Byte[]=new byte[]{127,126,-127};
		for(int i:integer) {
			System.out.println(i);
		}
		System.out.println("\n");
		for(float j:Float) {
			System.out.println(j);
		}
		System.out.println("\n");
		for(short k:Short) {
			System.out.println(k);
		}
		System.out.println("\n");
		for(double n:Double) {
			System.out.println(n);
		}
		System.out.println("\n");
		for(byte b:Byte) {
			System.out.println( b);
		}
	}

}
