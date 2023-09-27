import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something!");
        System.out.println("Entering nothing will stop the program.");
        String userInput = scanner.nextLine();

        String[] wordsArray = userInput.split(" ");

        for (String e : wordsArray) {
            System.out.println(e);
        }

    }
}
/*
You can split a string into multiple pieces with the 'split' method of the String class.
Takes a parameter of a string denoting a place around which the string should be split.

The split method RETURNS AN ARRAY of the resulting sub-parts.
Above, the parameter is " " in which to split the string.
 */