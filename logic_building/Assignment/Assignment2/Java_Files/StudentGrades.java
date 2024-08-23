import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter grades for three subjects:");
        System.out.print("Subject 1: ");
        int grade1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int grade2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int grade3 = sc.nextInt();

        int failedSubjects = 0;

        if (grade1 < 40) {
            failedSubjects++;
        }
        if (grade2 < 40) {
            failedSubjects++;
        }
        if (grade3 < 40) {
            failedSubjects++;
        }

        if (failedSubjects == 0) {
            System.out.println("Student Passed!");
        } else {
            System.out.println("Student Failed in " + failedSubjects + " subjects.");
        }
    }
}