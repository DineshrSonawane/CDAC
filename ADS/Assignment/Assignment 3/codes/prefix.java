
public class prefix {

     static int MAX_SIZE = 100;
     int[] stack;
     int top;

    public postfix() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

     boolean isEmpty() {
        return top == -1;
    }

     void push(int value) {
        if (top < MAX_SIZE - 1) {
            stack[++top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public int evaluatePostfix(String expression) {
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                push(Integer.parseInt(token));
            } else {
                int b = pop();
                int a = pop();
                int result = performOperation(token,a, b );
                push(result);
            }
        }
        return pop();
    }

    boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    int performOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
              return 0;
				}
    }

    public static void main(String[] args) {
        postfix p = new postfix();
        String testCase1 = "5 3 + 2 *";
        int result1 = p.evaluatePostfix(testCase1);
        System.out.println("Output for Test Case 1: " + result1);
        String testCase2 = "4 5 * 6 /";
        int result2 = p.evaluatePostfix(testCase2);
        System.out.println("Output for Test Case 2: " + result2);
    }
}
	
	