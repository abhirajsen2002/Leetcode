import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static void main(String[] args){

        String[] words = {"flower","flow","flight"};

        Arrays.sort(words, Comparator.comparing(String::length));

        String prefix = words[0];
        for(int index=1;index<words.length;index++){
            while(words[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

        // return prefix;

        System.out.println("Prefix: " + prefix);
    }
}
