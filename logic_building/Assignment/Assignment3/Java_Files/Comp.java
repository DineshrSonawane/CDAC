import java.io.*;
import java.util.*;

public class Comp
{
   public static void main(String[] args)
   {
      float p, r, t, n, ci;
      Scanner s = new Scanner(System.in);
      
      //System.out.print("Enter the Value of p (Principal Amount): ");
      p = s.nextFloat();
      //System.out.print("Enter the Value of r (Annual Rate of Interest): ");
      r = s.nextFloat();
      //System.out.print("Enter the Value of t (Time Period): ");
      t = s.nextFloat();
      //System.out.print("Enter the Value of n (Number of Times, Interest is Compounded): ");
      n = s.nextFloat();
      
      ci = p * (float)Math.pow(1 +r/100,t);
      
      System.out.println("\nCompound Interest = " +ci);
   }
}