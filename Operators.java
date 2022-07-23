//operators in java
import java .util.Scanner;
class Operators
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a and b values : ");
int a = sc.nextInt();
int b = sc.nextInt();
//Arthemetic operators
System.out.println("Addition operation is : " + (a+b));
System.out.println("Difference operation is : " +(a-b));
System.out.println("Multiplication operation is : " + (a*b));
System.out.println("Division operation is : " + (a/b));
//Relational operators
if(a>=b) //Comparision operators
{
System.out.println("Print a is greater than b");
}
if(a==b) //Equality operator
{
System.out.println("a and b are equal");
}
else
{
System.out.println("a and b are not equal");
}
}
}
