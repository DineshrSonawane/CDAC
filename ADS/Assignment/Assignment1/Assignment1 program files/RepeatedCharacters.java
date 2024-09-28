public class RepeatedCharacters{	
    public static void main(String[] args) {
        String input = "programming";

        int[] charCount = new int[26]; 

        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i) - 'a']++;
        }

        System.out.print("Repeated characters: ");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.print((char) ('a' + i) + ", ");
            }
        }
    }
}