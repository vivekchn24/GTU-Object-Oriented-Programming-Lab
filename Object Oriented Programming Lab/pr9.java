import java.util.Scanner;
class pr8
{

public static int gcd(int num1,int num2)
{

while(num1!=num2)
{

if(num1>num2)
{
num1=num1-num2;
}

else
{ 
num2=num2-num1;
}
}
return num1;
}
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the first value:");
int num1=input.nextInt();
int num2=input.nextInt();
System.out.println("gcd=" + gcd(num1,num2));
}
}

