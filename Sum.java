import java.util.Scanner;
class Sum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int n1=sc.nextInt();
int n2=sc.nextInt();
int add=n1-(-n2);
System.out.println("Sum of two numbers:"+add);
}
}