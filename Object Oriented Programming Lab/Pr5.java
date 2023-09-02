import java.util.Scanner;

public class Pr5
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int a = input.nextInt();

System.out.println("Enter the second number");
int b = input.nextInt();

System.out.println("Enter the third number");
int c = input.nextInt();
int temp;
if(a<b)
{
temp=a;
a=b;
b=temp;
}

if(b<c)
{
if(c>a) {
temp=c;
c=b;
b=a;
a=temp;
}

else{
temp=b;
b=c;
c=temp;
}
} 
System.out.println("Decreasing order :"+a+" "+b+" "+c);
}
}


