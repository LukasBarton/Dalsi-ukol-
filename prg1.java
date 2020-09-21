 import java.util.*;
 public class prg1 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("zadej vetu: ");
            String line = in.nextLine();
            String[] words = line.split("[ ]+");
            System.out.println("predposledni slovo je: "+words[words.length - 2]);
        }
    }

