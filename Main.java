import java.util.Scanner;

class Book {
String name;
String author;
double price;
int num_pages;

public Book(String name, String author, double price, int num_pages) {
this.name = name;
this.author = author;
this.price = price;
this.num_pages = num_pages; }

public void setDet(String name, String author, double price, int num_pages ) {
this.name = name;
this.author = author;
this.price = price;
this.num_pages = num_pages;}



public String getDet() {
return (name, author, price, num_pages); }


public String toString() {
return  "\nBook name: " + name + "\n" + "Author: " + author + "\n" + "Price: $" + price + "\n" + "Number of pages: " + num_pages ; }
}

public class Main {
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.print("\nEnter number of books:");
int n = ob.nextInt();
ob.nextLine();
Book[] books = new Book[n];
for (int i = 0; i < n; i++) {
System.out.print("\nEnter name of the book " + (i + 1) + ":");
String name = ob.nextLine();          
System.out.print("Enter name of the author:");
String author = ob.nextLine(); 
System.out.print("Enter price of the book:");
double price = ob.nextDouble();  
System.out.print("Enter number of pages:");
int num_pages = ob.nextInt();
ob.nextLine();
books[i] = new Book(name, author, price, num_pages);
}
System.out.print("\nBOOKS--------------\n");
for (int i = 0; i < n; i++) {
System.out.println(books[i].toString()); }
}
}
