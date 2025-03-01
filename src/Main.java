import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("Mathew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");

        String michaelShort = nicknames.get("Michael");
        System.out.println(michaelShort);
    }
}