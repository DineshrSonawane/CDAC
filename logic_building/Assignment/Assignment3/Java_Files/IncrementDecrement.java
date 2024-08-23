
-----------------------------------------------------------------------------------------------------------------------------------
Snippet 1:
public class InfiniteForLoop {
public static void main(String[] args) {
for (int i = 0; i < 10; i--) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?
Error: As i is starting from zero and decrementing ,the condition i<=10 never becomes true and loop will execute countinously

correct snippet:
public class InfiniteForLoop {
public static void main(String[] args) {
for (int i = 0; i < 10; i++) 
{
System.out.println(i);
}
}
}

---------------------------------------------------------------------------

Snippet 2:
public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count = 0) {
System.out.println(count);
count--;
}
}
}
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
`while` loop?
Error:int cannot be converted to boolean

public class IncorrectWhileCondition {
public static void main(String[] args) {
int count=0;
while (count>=5) 
{
System.out.println(count);
count--;
}
}
}
-------------------------------------------------------------------------------------------------------------------------
Snippet 3:
public class DoWhileIncorrectCondition {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num > 0);
}
}
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile`
loop

The loop starts from 0 until condition num>0 until the condition satisfies
so in this case the condition satisfies as num start as 0 print 0 and then increment to 1 which satisfies the condition num>0

public class DoWhileIncorrectCondition {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num > 5);
}
}

------------------------------------------------------------------------------------------------------------------------------------

Snippet 4:

public class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
System.out.println(i);
}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
}
}
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the
expected output?

in for loop the condition is i<=10 which means loop until i values less or equal to 10 so it will print until 10
if we remove the equal to '=' sign the loop will excecute until i value less than 10 

Correct snippet:
public class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i < 10; i++) {
System.out.println(i);
}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
}
}

----------------------------------------------------------------------------------------------------------------------------------------
Snippet 5:
public class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 10; i >= 0; i++) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the
initialization and update statements in the `for` loop?

Error: her i initialvalue is 10 and condition is i greater then equal to zero
due to increment of i thecondition never satisfies and the loop will excecute infinite time, we need to decrement the value of i to satiesfy the condition.
correct code:
public class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 10; i>= 0; i--) {
System.out.println(i);
}
}
}
------------------------------------------------------------------------------------
Snippet 6:
public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
System.out.println(i);
System.out.println("Done");
}
}
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
include all statements within the loop?

Error:
For loop scope not define, we need to close the for loop body in curly braces.

correct snippet;
public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
{
System.out.println(i);
System.out.println("Done");
}
}
}
------------------------------------------------------------------------------------
Snippet 7:
public class UninitializedWhileLoop {
public static void main(String[] args) {
int count;
while (count < 10) {
System.out.println(count);
count++;
}
}
}
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop
variable properly?

error: variable count might not have been initialized
while (count < 10) {
       ^
1 error

correct snippet:
public class UninitializedWhileLoop {
public static void main(String[] args) {
int count=0;
while (count < 10) {
System.out.println(count);
count++;
}
}
}
-----------------------------------------------------------------------------------

Snippet 8:
public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num--;
} while (num > 0);
}
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
numbers from 1 to 5?

Error: here the condition is satiesfied in loop only as num >0 we need to change the condition and increment the loop.

correct snippet:
public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num++;
} while (num <= 5);
}
}
------------------------------------------------------------------------------

Snippet 9:
public class InfiniteForLoopUpdate {
public static void main(String[] args) {
for (int i = 0; i < 5; i += 2) {
System.out.println(i);
}
}
}
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update
expression be corrected?

public class InfiniteForLoopUpdate {
public static void main(String[] args) {
for (int i = 0; i < 5; i ++) {
System.out.println(i);
}
}
}
-------------------------------------------------------------------------------
Snippet 10:
public class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num = 10) {
System.out.println(num);
num--;
}
}
}
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?

error: incompatible types: int cannot be converted to boolean
while (num = 10) {
           ^
= is assignment operator we need to use a conditional operator here
and the loop start with value 10 and decrement which do not satiesfy the condition
		   
correct snippet:
public class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num >0) {
System.out.println(num);
num--;
}
}
}

---------------------------------------------------------------------------------

Snippet 11:
public class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i +=2; // Error: This may cause unexpected results in output
}
}
}
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the
desired result?

Output is:
0
2
4
in this case the i value increment by 2 in every loop due to i +=2;

correct snippet:
public class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i ++; // Error: This may cause unexpected results in output
}
}
}

-------------------------------------------------------------------------------------

Snippet 12:
public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
}
System.out.println(x); // Error: 'x' is not accessible here
}
}
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

Error: output of x is declared out of the scope of loop

public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
System.out.println(x); // Error: 'x' is not accessible here
}
}
}
---------------------------------------------------------------------------------------------------------


SECTION 2: Guess the Output
------------------------------------------------------------------------------------------------------
Snippet 1:
public class NestedLoopOutput {
public static void main(String[] args) {
for (int i = 1; i <= 3; i++) {
for (int j = 1; j <= 2; j++) {
System.out.print(i + " " + j + " ");
}
System.out.println();


Dry run:
i   J   Output
1   1    1 1
    2    1 2
2   1    2 1
    2    2 2
3   1	 3 1
    2    3 2
	
---------------------------------------------------------------------------	
	
Snippet 2:
public class DecrementingLoop {
public static void main(String[] args) {
int total = 0;
for (int i = 5; i > 0; i--) {
total += i;
if (i == 3) continue;
total -= 1;
}
System.out.println(total);
}
}
// Guess the output of this loop.

Dry run:
i  Total  Output
5  5
4  9 
3  12     11
2  14
1  15

---------------------------------------------------------------------------

Snippet 3:
public class WhileLoopBreak {
public static void main(String[] args) {
int count = 0;
while (count < 5) {
System.out.print(count + " ");
count++;
if (count == 3) break;
}
System.out.println(count);
}
}
// Guess the output of this while loop.

Dry run:

count  print  i++ if( Count==3)   print
0        0     1     No
1        1     2     No
2        2     3     yes            3

Output is 0 1 2 3

------------------------------------------------------------------------

Snippet 4:
public class DoWhileLoop {
public static void main(String[] args) {
int i = 1;
do {
System.out.print(i + " ");
i++;
} while (i < 5);
System.out.println(i);
}
}
// Guess the output of this do-while loop.

Dry run:
i  print i++ print
1   1     2
2   2     3
3   3     4
4   4     5    5

Output: 1 2 3 4 5
---------------------------------------------------------------------------

Snippet 5:
public class ConditionalLoopOutput {
public static void main(String[] args) {
int num = 1;
for (int i = 1; i <= 4; i++) {
if (i % 2 == 0) {
num += i;
} else {
num -= i;
}
}
System.out.println(num);
}
}
// Guess the output of this loop.

Dry run:
i    if     Num  print
1    False   0    
2    True    3     3
3    False   2
4    False   4    

Output: 3

-----------------------------------------------------------------------------

Snippet 6:
public class IncrementDecrement {
public static void main(String[] args) {
int x = 5;
int y = ++x - x-- + --x + x++;
System.out.println(y);
}
}
// Guess the output of this code snippet.

