public class Largest {
 public static void main(String[] args) 
 {
    int n=4825,r=0,max=0;
    while(n>0)
        {
            r=n%10;
            if(r>max)
            {
                max=r;
            }
            n=n/10;
        }
 System.out.println("Largest digit: "+max);
 }
}