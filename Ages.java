import java.util.Scanner;

class WrongAgeException extends Exception{
public WrongAgeException(String message){
super(message);
}
}

class Father{
int age;
public Father(int age) throws WrongAgeException{
if(age<0){
throw new WrongAgeException("Father's age cannot be negative."); }
this.age = age;
}
}

class Son extends Father{
int sAge;
public Son(int fAge, int sAge) throws WrongAgeException {
super(fAge);
if(sAge<0){
throw new WrongAgeException("Son's age cannot be negative.");
}
if(sAge>=fAge){
throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age.");
}
this.sAge=sAge;
}
}

public class Ages{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);

try{
System.out.print("Enter age of Father: ");
int fAge = scanner.nextInt();
System.out.print("Enter age of Son: ");
int sAge = scanner.nextInt();
Father father = new Father(fAge);
Son son = new Son(fAge, sAge);
System.out.println("Father's age: " + father.age);
System.out.println("Son's age: " + son.sAge);
} 
catch (WrongAgeException e){
System.out.println("Exception: " + e.getMessage());
} 
catch (Exception e){
System.out.println("Invalid input. Please enter numeric values.");
} 

finally{
System.out.println("Done");
}
}
}
 