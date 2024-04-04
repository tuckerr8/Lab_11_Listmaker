import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    public static void main(String[] args) {
        //Initialize scanner and the array list
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArrayList = new ArrayList<>();

        //Items to add to the array list
        myArrayList.add("SamFisher");
        myArrayList.add("SolidSnake");
        myArrayList.add("AgentFortySeven");

        //Menu displayed in the prompt
        String prompt = "Choose an operation: A - Add, D - Delete, P - Print, Q - Quit";

        //Get user input
        String userInput = SafeInput.getRegExString(in, prompt, "[AaDdPpQq]");
        userInput = userInput.toUpperCase();

        //Respond to user input accordingly
        switch (userInput) {
            case "A" -> add(myArrayList);
            case "D" -> delete(myArrayList);
            case "P" -> print(myArrayList);
            case "Q" -> System.out.println("Quitting...");
        }
        
    }

    private static void add(ArrayList<String> list){
        //Initialize scanner and string
        Scanner in = new Scanner(System.in);
        String added;

        //Print out the list, then prompt user to add a name, then store it
        System.out.println(list);
        System.out.println("Please enter a name to add: ");
        added = in.nextLine();
        list.add(added);
        System.out.println(list);

    }


    private static void delete(ArrayList<String> list){
        //Initialize scanner and string
        Scanner in = new Scanner(System.in);
        String deleted;

        //Print out list, then prompt to delete a name, then deletes it from array
        System.out.println(list);
        System.out.println("Enter name to delete: ");
        deleted = in.nextLine();
        list.remove(deleted);
    }

    private static void print(ArrayList<String> list) {
        //Print all items that are in the array.
        for (String value : list) {
            System.out.printf("%s ", value);
        }
    }

}
