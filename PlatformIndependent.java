import java.util.Scanner;
class PlatformIndependent 
{
//Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age : ");
int age = sc.nextInt();
if(age>18)
{
System.out.println("Eligible");
}
else
{
System.out.println("Not Eligible");
}
}
}
//If we run this program on any system like windows, mac and Linux the program will excecute same in all the machines.Hence it is Platform Independent.

