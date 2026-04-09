import java.util.*;
public class TrainConsistApp {
    public static void main(String[] args)
    {
        System.out.println("================================");
        System.out.println("=USE CASE 2 ADD BOGIES TO TRAIN==");
        System.out.println("=================================");
        List<String> trainConsist= new ArrayList<>();
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");
        System.out.println("After dding Bogies:");
        System.out.println("Passenger Bogies:"+trainConsist);
        trainConsist.remove("AC Chair");
        System.out.println("After Removing Bogies:");
        System.out.println("Passenger Bogies:"+trainConsist);
        System.out.println("Checking if \"sleeper\" exists:");
        System.out.println("Contains Sleeper?:"+trainConsist.contains("Sleeper"));
        System.out.println("Final Train Passenger Transit:");
        System.out.println("Passenger Bogies:"+trainConsist);
    }
}
