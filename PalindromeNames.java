public class PalindromeNames {
    public static void main(String[] args) {
        // Array of students' names
        String[] names = {"Anna", "Bob", "Civic", "David", "Eve", "Eva", "lal"};

        // List to store the names of students with palindrome names
        String[] palindromeNames = new String[names.length];

        // Variables to keep track of the number of students with palindrome names
        int count = 0;
        int index = 0;

        // Loop through the names array
        for (int i = 0; i < names.length; i++) {
            // Check if the current name is a palindrome
            boolean isPalindrome = true;
            int length = names[i].length();
            for (int j = 0; j < length / 2; j++) {
                if (names[i].charAt(j) != names[i].charAt(length - j - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            // If it is a palindrome, add it to the list and increment the count
            if (isPalindrome) {
                palindromeNames[index++] = names[i];
                count++;
            }
        }

        // Print the number of students with palindrome names
        System.out.println("Number of students with palindrome names: " + count);

        // Print the names of students with palindrome names
        System.out.print("Names of students with palindrome names: ");
        for (int i = 0; i < count; i++) {
            System.out.print(palindromeNames[i] + " ");
        }
        System.out.println();
    }
}
