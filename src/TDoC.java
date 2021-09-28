import java.util.*;

public class TDoC {
    public static void main(String[] args){
        List<String> days = Arrays.asList("first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth");
        List<String> gifts = Arrays.asList("And a partridge in a pear tree!", "Two turtle doves,", "Three French hens,", "Four calling birds,", "Five golden rings,", "Six geese a-laying,", "Seven swans a-swimming,", "Eight maids a-milking,", "Nine ladies dancing,", "Ten lords a-leaping,", "Eleven pipers piping,", "Twelve drummers drumming,");

        for(int i=0; i<12; i++){
            System.out.printf("On the %s day of christmas, \nmy true love sent to me\n", days.get(i));
            for(int j=i; j>=0; j--){
                System.out.printf("%s\n", gifts.get(j));
            }
            System.out.printf("\n\n");
        }
//        System.out.println();
    }
}
