import java.util.*;
public class TrainConsistApp {
    public static void main(String[] args)
    {
        System.out.println("================================");
        System.out.println("=USE CASE 3 track unique bogie ids==");
        System.out.println("=================================");
        Set<String> bogies=new HashSet<>();
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");
        System.out.println("bogie ids after insertion:");
        System.out.println(bogies);
        System.out.println("Note");
        System.out.println("Duplicates are automatically ignored by HashSet");

    }
}
