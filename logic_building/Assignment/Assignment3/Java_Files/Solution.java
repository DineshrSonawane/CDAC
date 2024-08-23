import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        float p,r,t,a,ci;
        Scanner sc=new Scanner(System.in);
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();
        
        a =p*(float)Math.pow(1+r/100,t);
        ci=a-p;
        System.out.println("Compound Interest: "+ci);
        sc.close();
    }
}