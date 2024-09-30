public class ArrayDuplicate{
public int RemoveDup(int arr[])
{
int index=1;
	for(int i=0; i < arr.length-1 ;i++)
	{
		if (arr[i]!=arr[i+1])
	{
		arr[index]=arr[i+1];
		index++;
	}
		else{
		continue;
	}
	}
		return index;
}
public static void main(String[] args)
{
	ArrayDuplicate a= new ArrayDuplicate();
	int[] arr={0, 0, 1, 1, 2, 2, 3, 3};
	System.out.println(a.RemoveDup(arr));

}
}

