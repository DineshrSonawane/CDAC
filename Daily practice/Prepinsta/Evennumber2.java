import java.util.Scanner;
 
 
public class Evennumber2{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number :   ");
int a=sc.nextInt();

if(isEven (a))
System.out.println("odd");
else
System.out.println("Even");
}
static bool isEven (int a)
{
return (!(a &1));
}
}
