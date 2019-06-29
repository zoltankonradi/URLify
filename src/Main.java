import java.util.ArrayList;
import java.util.List;

public class Main {

    /*

     Cracking the Coding Interview - Arrays and Strings

     1.3 - URLify:
     Write a method to replace all spaces in a string with '%20'. You may assume that the string
     has sufficient space at the end to hold the additional characters, and that you are given the "true"
     length of the string.
     */

    public static void main(String[] args) {
        System.out.println(URLify("Mr John Smith    "));
    }

    public static String URLify(String string) {
        String currentString = string.trim();
        char[] chars = currentString.toCharArray();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                strings.add("%20");
            } else {
                strings.add(Character.toString(chars[i]));
            }
        }
        String newString = "";
        for (String element : strings) {
            newString += element;
        }
        return newString;
    }
}
