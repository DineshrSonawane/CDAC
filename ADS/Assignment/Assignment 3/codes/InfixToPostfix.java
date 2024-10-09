class Stack {
    int max = 100;
    char[] array = new char[max];
    int top = -1;

    void push(char c) {
        if (top < max - 1) {
            array[++top] = c;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    char pop() {
        if (top >= 0) {
            return array[top--];
        } else {
            System.out.println("Stack Underflow");
            return '\0';
        }
    }

    char peek() {
        if (top >= 0) {
            return array[top];
        } else {
            return '\0';
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class InfixToPostfix {
    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static String convert(String infix) {
        Stack stack = new Stack();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetter(c)) {
                postfix.append(c).append(" ");
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop(); 
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') { 
                stack.pop();
            } else {
                postfix.append(stack.pop()).append(" ");
            }
        }

        return postfix.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(convert("A + B * C")); 
    }
}