//Program to perform if else ststements
import java.util.Scanner;
class IfElse
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
i=sc.nextInt();
if(i%2==0)
{
System.out.println(i + " is even number");
}
else
{
System.out.println(i + " is odd number");
}
}
}