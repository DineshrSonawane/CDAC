public class ArmstrongNumber{
public static void main (String[] args){
int n1=153;
int result=0,rem;
int num2=n1;

while(n1>0)
{
rem=n1%10;
result=result+(rem*rem*rem);
n1=n1/10;
}
if(num2==result)
{
System.out.println(result+" Is Armstrong Number");
}
else
 System.out.println(result+" Is not Armstrong Number");
}
}
