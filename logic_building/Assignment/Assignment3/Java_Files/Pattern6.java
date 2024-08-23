public class Pattern6
{  
public static void main(String args[])  
{  
int row=4, i, j, s = 1;  
s = row - 1;  
for (j = 1; j<=row; j++)  
{  
for (i = 1; i<=s; i++)  
{  
System.out.print(" ");  
}  
s--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
s = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= s; i++)  
{  
System.out.print(" ");  
}  
s++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
}  