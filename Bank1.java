import java.util.Scanner;

class Acc{
private String cname;
private int acc_no;
protected double bal;

public Acc(String cname, int acc_no, double bal){
this.cname = cname;
this.acc_no = acc_no;
this.bal = bal;
}

public double getBal(){
return bal;
}

public void dep(double amt){
if (amt > 0){
bal+= amt;
System.out.println("Deposited: " + amt); }
else{
System.out.println("Deposit amount must be positive.");
}
}
public void wd(double amt)
{
if(amt<=getBal()){
bal-=amt;
System.out.println("withdrew:"+amt + " balance is:"+ bal); }
else
System.out.println("Insufficient funds!!");
}
public void displayBal(){
System.out.println("Current Balance: " + bal); }
}

class SavAcc extends Acc{
private double interestRate;
public SavAcc(String cName, int accNum, double initialBal, double interestRate){
super(cName, accNum, initialBal);
this.interestRate = interestRate;
}

public void computeAndDepositInterest(){
double interest = getBal() * interestRate / 100;
dep(interest);
}
}
class CurAcc extends Acc{
private double minBal;
private double serviceCharge;
public CurAcc(String cName, int accNum, double initialBal, double minBal, double serviceCharge) {
super(cName, accNum, initialBal);
this.minBal = minBal;
this.serviceCharge = serviceCharge;
}
public void checkMinBal(){
if (getBal() < minBal) {
System.out.println("Balance is below minimum");
bal-=serviceCharge;
System.out.println("Deducted service charge:" +serviceCharge);
System.out.println("Balance after deduction is:"+bal);
}
}
}

public class Bank1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter customer name:");
String name=sc.nextLine();
System.out.println("enter account number:");
int acc_no=sc.nextInt();
System.out.println("enter initial balance:");
double bal=sc.nextDouble();
System.out.println("enter minimum balance:");
double min_bal=sc.nextDouble();
System.out.println("enter interest rate:");
double interest_rate=sc.nextDouble();
System.out.println("enter service charge:");
double service_charge=sc.nextDouble();
System.out.println("Enter choice:\n 1.Current acc\n 2.Savings acc");
int ch=sc.nextInt();
System.out.println("Customer name is:"+ name+"\nAccount number:"+acc_no+"\nVaraha V G-1WA23CS034");

switch(ch){
case(1):
System.out.println("account is current type");
CurAcc ca = new CurAcc(name,acc_no,bal,min_bal,service_charge);
do{ System.out.println("enter choice:\n 1.deposit\n 2.withdraw\n 3.display balance");
int c=sc.nextInt();
ca.checkMinBal();
if(c==1){
System.out.println("enter amount to be deposited:");
double amt=sc.nextDouble();
ca.dep(amt); }
else if(c==2){
System.out.println("enter amount to withdraw:");
double amt=sc.nextDouble();
ca.wd(amt); }
else if(c==3){
ca.displayBal(); }
else
System.exit(0);
}while(true);

case(2):
System.out.println("account is savings type");
SavAcc sa=new SavAcc(name,acc_no,bal,interest_rate);
do{ System.out.println("enter choice:\n 1.deposit\n 2.withdraw\n 3.display balance");
int c1=sc.nextInt();
if(c1==1){
System.out.println("enter amount to be deposited:");
double amt=sc.nextDouble();
sa.dep(amt); }
else if(c1==2){
System.out.println("enter amount to withdraw:");
double amt=sc.nextDouble();
sa.wd(amt); }
else if(c1==3){
sa.computeAndDepositInterest();
sa.displayBal(); }
else{
System.exit(0);
}
}while(true);
}
}
}
