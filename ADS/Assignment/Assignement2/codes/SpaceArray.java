public class SpaceArray{
public static void main(String[] args)
{    String s="Hello World";
	char[] arr= s.toCharArray();
	String temp="";
	for(char c:arr){
		if(c!=' ')
		{
		temp +=c;
		}
	}
	s=temp;
	System.out.println(s);
}
}
