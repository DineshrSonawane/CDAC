public class IncrementDecrement1 {
public static void main(String[] args) {
int x = 5;
int y = ++x - x-- + --x + x++;
System.out.println(y);
}
}