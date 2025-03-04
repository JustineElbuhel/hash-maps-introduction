package PhoneNumbers;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Peppa", "123-1234");

        System.out.println("Peppa's number: " + phoneNumbers.get("Peppa"));


        HashMap<String, ArrayList<String>> phoneNumbers2 = new HashMap<>();
        phoneNumbers2.put("Tokki", new ArrayList<>());

        phoneNumbers2.get("Tokki").add("123-1234");
        phoneNumbers2.get("Tokki").add("987-9876");

        System.out.println("Tokki's numbers: " + phoneNumbers2.get("Tokki"));
    }
}
