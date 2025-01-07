class CollegeThread extends Thread{
public void run(){
try{
while(true){
System.out.println("BMS College of Engineering");
Thread.sleep(10000); 
}
} 
catch(InterruptedException e){
System.out.println("CollegeThread interrupted."); }
}
}
class CSEThread extends Thread{
public void run(){
try{
while(true){
System.out.println("CSE");
Thread.sleep(2000); 
}
}
catch (InterruptedException e){
System.out.println("CSEThread interrupted."); }
}
}

public class Threads{
public static void main(String[] args){
CollegeThread collegeThread = new CollegeThread();
CSEThread cseThread = new CSEThread();
collegeThread.start();
cseThread.start();
}
}









