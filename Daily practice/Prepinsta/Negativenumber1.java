import java.util.Scanner;
 
 
public class Negativenumber1{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the number :   ");
int a=sc.nextInt();
if(a==0)
{
	System.out.println("Zero");

}else{
String b= a<0 ? "Negative" : "Positive";
System.out.println(b);
}
}
}