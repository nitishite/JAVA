import java.util.*;

public class StringMethodsExample {
    public static void main(String[] args) {

        String text = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative. The alternative mentioned here is the Tata Nano, which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";

        // charAt()
        char firstChar = text.charAt(0);
        System.out.println("First character: " + firstChar + "\n");

        // compareTo()
        String otherText = "We realized that while our workers were thriving, the surrounding villages were still suffering.";
        int compareResult = text.compareTo(otherText);
        System.out.println("Compare result: " + compareResult + "\n");

        // concat()
        String concatText = text.concat(" This is the additional text.");
        System.out.println("Concatenated text: " + concatText + "\n");

        // contains()
        boolean containsResult = text.contains("villages");
        System.out.println("Contains 'villages': " + containsResult + "\n");

        // endsWith()
        boolean endsWithResult = text.endsWith("alternative");
        System.out.println("Ends with 'alternative': " + endsWithResult + "\n");

        // equals()
        boolean equalsResult = text.equals(otherText);
        System.out.println("Equals other text: " + equalsResult + "\n");

        // equalsIgnoreCase()
        boolean equalsIgnoreCaseResult = text.equalsIgnoreCase(otherText);
        System.out.println("Equals ignore case other text: " + equalsIgnoreCaseResult + "\n");

        // format()
        String formattedText = String.format("The text starts with '%s' and ends with '%s'", text.charAt(0),
                text.charAt(text.length() - 1));
        System.out.println("Formatted text: " + formattedText + "\n");

        // getBytes()
        byte[] bytes = text.getBytes();
        System.out.println("Bytes: " + bytes + "\n");

        // getChars()
        char[] chars = new char[10];
        text.getChars(0, 10, chars, 0);
        System.out.println("Chars: " + new String(chars) + "\n");

        // indexOf()
        int indexOfResult = text.indexOf("our");
        System.out.println("Index of 'our': " + indexOfResult + "\n");

        // intern()
        String internedText = text.intern();
        System.out.println("Interned text: " + internedText + "\n");

        // isEmpty()
        boolean isEmptyResult = text.isEmpty();
        System.out.println("Is empty: " + isEmptyResult + "\n");

        // join()
        String joinedText = String.join(" ", "We", "realizes", "that");
        System.out.println("Joined text: " + joinedText + "\n");

        // lastIndexOf()
        int lastIndexOfResult = text.lastIndexOf("our");
        System.out.println("Last index of 'our': " + lastIndexOfResult + "\n");

        // length()
        int length = text.length();
        System.out.println("Length: " + length + "\n");

        // replace()
        String replacedText = text.replace("workers", "employees");
        System.out.println("Replaced text: " + replacedText + "\n");

        // replaceAll()
        String replacedAllText = text.replaceAll("our", "their");
        System.out.println("Replaced all text: " + replacedAllText + "\n");

        // split()
        String[] splitText = text.split(" ");
        System.out.println("Split text: " + Arrays.toString(splitText) + "\n");

        // startsWith()
        boolean startsWithResult = text.startsWith("We");
        System.out.println("Starts with 'We': " + startsWithResult + "\n");

        // substring()
        String substringText = text.substring(10, 20);
        System.out.println("Substring: " + substringText + "\n");

        // toCharArray()
        char[] charArray = text.toCharArray();
        System.out.println("Char array: " + Arrays.toString(charArray) + "\n");

        // toLowerCase()
        String lowercaseText = text.toLowerCase();
        System.out.println("Lowercase text: " + lowercaseText + "\n");

        // toUpperCase()
        String uppercaseText = text.toUpperCase();
        System.out.println("Uppercase text: " + uppercaseText + "\n");

        // trim()
        String tex = "Goodmorning ";
        String trimmedText = text.trim();
        System.out.println("Trimmed text: \n" + tex.trim() + trimmedText + "\n");

        // valueOf()
        String valueOfString = String.valueOf(123);
        System.out.println("Value of string: " + valueOfString + "\n");
    }
}