package lab_20_06_24;

import java.util.*;

/**
 * Write a program to

     i.       input a sentence and replace vowel with its next letter.

     ii.     input a sentence replace vowel with its next vowel.

Eg: Computer::: Cpmpvtfr

Eg: Computer :::Cumpatir
 */
public class VowelReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String resultNextLetter = replaceWithNextLetter(input);
        String resultNextVowel = replaceWithNextVowel(input);

        System.out.println("Modified sentence (next letter): " + resultNextLetter);
        System.out.println("Modified sentence (next vowel): " + resultNextVowel);
    }

    private static String replaceWithNextLetter(String sentence) {
        StringBuilder modified = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (isVowel(c)) {
                modified.append((char) (c + 1));
            } else {
                modified.append(c);
            }
        }
        return modified.toString();
    }

    private static String replaceWithNextVowel(String sentence) {
        StringBuilder modified = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (isVowel(c)) {
                modified.append(getNextVowel(c));
            } else {
                modified.append(c);
            }
        }
        return modified.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".contains(String.valueOf(c));
    }

    private static char getNextVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': return 'e';
            case 'e': return 'i';
            case 'i': return 'o';
            case 'o': return 'u';
            case 'u': return 'a';
            default: return c;
        }
    }
}
