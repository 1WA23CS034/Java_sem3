import java.util.*;
abstract class Shape{
double x,y;
Shape(double x, double y){
this.x=x;
this.y=y;
}
abstract void printArea();
}
class Rectangle extends Shape{
Rectangle(double l, double b){
super(l,b);
}
void printArea(){
double a=x*y;
System.out.println("Area of rectangle is: "+ a+ " square units.");
}
}
class Triangle extends Shape{
Triangle(double b,double h){
super(b,h);
}
void printArea(){
double at=0.5*x*y;
System.out.println("Area of triangle is: "+ at+ " square units.");
}
}
class Circle extends Shape{
Circle(double r,double e){
super(r,0);
}
void printArea(){
double ac=3.14*x*x;
System.out.println("Area of circle is: "+ ac+ " square units");

}
}
public class AREAS{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter sides of rectangle:\nlength:");
int l=sc.nextInt();
System.out.print("breadth:");
int b=sc.nextInt();
Rectangle rec=new Rectangle(l,b);
rec.printArea();
System.out.print("\nEnter sides of triangle:\nbase:");
double B=sc.nextDouble();
System.out.print("height:");
double h=sc.nextDouble();
Triangle tri=new Triangle(B,h);
tri.printArea();
System.out.print("\nEnter radius of circle:");
double r=sc.nextDouble();
Circle c=new Circle(r,0);
c.printArea();
}
}