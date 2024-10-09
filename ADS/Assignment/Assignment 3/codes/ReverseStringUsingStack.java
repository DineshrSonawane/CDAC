import java.util.*;
class Stack
{
int size;
int top;
char[] a;
boolean isEmpty()
{
return (top < 0);
}
Stack(int n)
{
top = -1;
size = n;
a = new char[size];
}
//implementing push function
boolean push(char x)
{
if (top >= size)
{
System.out.println("Stack Overflow");
return false;
}
else
{
a[++top] = x;
return true;
}
}
//implementing pop function
char pop()
{
if (top < 0)
{
System.out.println("Stack Underflow");
return 0;
}
else
{
char x = a[top--];
return x;
}
}
}
// reversing the string ( main function )
public class ReverseStringUsingStack
{
public static String reverseString(String str)
{
String reversedString = "";
int lenghOfString = str.length();
Stack stack = new Stack(lenghOfString);
for (int i = 0; i < lenghOfString; i++) {
stack.push(str.charAt(i));
}
for (int i = 0; i < lenghOfString; i++)
{
char ch = stack.pop();
reversedString = reversedString+ ch;
}
return reversedString;
}
public static void main(String args[])
{
String s= new String("hello");
String result = reverseString(s);
System.out.println("Reversed string is " + result);
}
}