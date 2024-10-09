class ArrayStack{
static final int max=100;
int top;
int a[] = new int[max];

boolean isEmpty()
{
return(top<0);
}
ArrayStack()
{
top=-1;
}

boolean push(int x)
{
	if(top>=(max-1)){
	System.out.println("Stack Overflow");
	return false;
	}
	else{
	a[++top]=x;
	return true;
	}
}
	int pop()
	{
	if(top<0)
	{
	System.out.println("Stack Underflow");
	return 0;
	}
	return a[top--];
	
	}
	void display(){ 
    for(int i = top;i>-1;i--){ 
    System.out.print(" "+ a[i]); 
    } 
} 
}
	
	class Main { 
    public static void main(String args[]) 
    { 
        ArrayStack s = new ArrayStack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        
        System.out.print("Elements present in stack :"); 
        s.display(); 
    } 
} 
	