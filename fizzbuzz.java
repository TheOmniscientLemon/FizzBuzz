import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 255; i++) {

            // String words = "";
            List<String> words = new ArrayList<String>();

            if (i % 11 ==0) {
                if (i % 13 == 0) {
                    System.out.println("FezzBong");
                } else {
                    System.out.println("Bong");
                }
            } else {
                if (i % 3 == 0) {
                    words.add("Fizz");
                } 
                if (i % 13 == 0) {
                    words.add("Fezz");
                }
                if (i % 5 == 0) {
                    words.add("Buzz");
                } 
                if (i % 7 == 0) {
                    words.add("Bang");
                }
                if (i % 17 == 0) {
                    Collections.reverse(words);
                }
                if (words.isEmpty()) {
                    System.out.println(Integer.toString(i));
                } else {
                    String output = "";

                    for (String word : words) {
                        output += word;
                    }
                    
                    System.out.println(output);
                }
            }
        }
    }
}