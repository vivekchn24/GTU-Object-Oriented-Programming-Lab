import java.util.Scanner;

public class Pr6
{
 public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);
System.out.println("Enter the letters which you want to enter");
 char A = input.next().charAt(0);
 if(A=='a'|| A=='e'|| A=='i'|| A=='o'|| A=='u')
{
System.out.println(A + "Enter the letters are vowels");
}
 else if (A=='A'|| A=='E' || A=='I' || A=='O' || A=='U')
{
System.out.println(A + "Enter the letters are consonant");
}
{
System.out.println("Enter the letters are not found");
}
}
}

