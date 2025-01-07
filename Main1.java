import SEE.Externals;
import CIE.Student;
import CIE.Internals;
import java.util.Scanner;

class Main1{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter number of students: ");
int n = s.nextInt();

Externals[] students = new Externals[n];

for (int i=0; i<n; i++){
System.out.println("\nEnter details for student " + (i+1) + ":");
students[i] = new Externals();
students[i].StudentDet();
students[i].internals.CIEmarks();
students[i].SEEmarks();
students[i].calcFinalM();
}

System.out.println("\nFinal Marks of Students:");
for (int i=0; i<n; i++){
System.out.println("\nStudent " + (i+1) + ":");
students[i].displayFinalM();
}
System.out.println("\n");
}
}

