package javaAssignm;

class Calcus {
private double length;
private double width;
private double height;
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}

private double faceArea()
{
	double faceA;
	faceA = length*height;
	return faceA;
}

private double topArea()
{
	double topA;
	topA = length*width;
	return topA;
}
private double sideArea(){
	double sideA;
	sideA = width*height;
	return sideA;
}
 public double volume(){
	 double vol;
	 vol = height*length*width;
	 return vol;
 }
 
 public double area(){
	 double area;
	 //area= 2*(length*width+width*height+height*length);
	 area = 2*(faceArea()*sideArea()*topArea());
	 return area;
 }
 }
public class Carton {
	
	 public static void main(String[] args) {
		Calcus obj = new Calcus();
		obj.setHeight(11.8);
		obj.setLength(12.6);
		obj.setWidth(15.6);
		
		System.out.println("Volume:"+obj.volume());
		System.out.println("Area:"+obj.area());
		
	}

}
