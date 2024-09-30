import java.util.Scanner;
 
 
public class Evennumber1{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the number :   ");
int a=sc.nextInt();
String r = a%2==0 ? "Even number" : "Odd number";
System.out.println(r);
}
}
