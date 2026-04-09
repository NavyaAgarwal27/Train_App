import java.util.*;
public class TrainConsistApp {
    public static void main(String[] args) {
                LinkedList<String> train = new LinkedList<>();

                // Step 2: Add initial bogies
                train.add("Engine");
                train.add("Sleeper");
                train.add("AC");
                train.add("Cargo");
                train.add("Guard");

                System.out.println("Initial Train Consist:");
                System.out.println(train);

                // Step 3: Insert Pantry Car at position 2
                train.add(2, "Pantry Car");

                System.out.println("\nAfter adding Pantry Car at position 2:");
                System.out.println(train);

                // Step 4: Remove first and last bogie
                train.removeFirst();
                train.removeLast();

                System.out.println("\nAfter removing first and last bogie:");
                System.out.println(train);

                // Step 5: Display final train consist
                System.out.println("\nFinal Ordered Train Consist:");
                for (String bogie : train) {
                    System.out.println(bogie);
                }
            }
        }
