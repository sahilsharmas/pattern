import java.util.Scanner;

 class sumtwonumber
{
public static void main(String [] args)
{
int x,y,sum;
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number");
x = sc.nextInt();
System.out.print("Enter the secound number");
y = sc.nextInt();
sum = sum(x,y);
System.out.println(" the sum of two number x and y is :"+ sum);
}
public static int sum (int a,int b)
{
int sum = a+b;
return sum;
}

} 
