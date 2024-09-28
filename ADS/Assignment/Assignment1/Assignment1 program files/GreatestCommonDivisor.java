public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 54; 
        int b=24;

        int gcd = findGCD(a, b);
        
        System.out.println("GCD of " + a + " and " + b + ": " + gcd);
        
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
