public class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i ++; // Error: This may cause unexpected results in output
}
}
}