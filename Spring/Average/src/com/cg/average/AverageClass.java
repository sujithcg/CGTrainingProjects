package com.cg.average;

public class AverageClass 
{
 private static double avg,x,y,z;
 public static void average(double x,double y,double z)
 {
	 avg=((x+y+z)/3);
	 System.out.println("The average of number is"+" "+avg);
 }
public static double getAvg() {
	return avg;
}
public static void setAvg(double avg) {
	AverageClass.avg = avg;
}
public static double getX() {
	return x;
}
public static void setX(double x) {
	AverageClass.x = x;
}
public static double getY() {
	return y;
}
public static void setY(double y) {
	AverageClass.y = y;
}
public static double getZ() {
	return z;
}
public static void setZ(double z) {
	AverageClass.z = z;
}
}
