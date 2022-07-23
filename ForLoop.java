//Program to perform looping statements(for loop)
import java.util.Scanner;
public class ForLoop
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value : ");
int n = sc.nextInt();
int f=1;
for(int i=1;i<=n;i++)
{
	f=f*i;
}
System.out.println("Factorial of " + n + " is : " +f);
}
}