public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5; 
         

        System.out.println("Fibonacci Series for n = " + n + " ");
        printFibonacci(n);

        }

    
    public static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) );
        }
    }

    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}