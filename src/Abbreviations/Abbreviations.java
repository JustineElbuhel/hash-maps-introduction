package Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }

    public static void printKey(HashMap<String, String> hashMap){
        for(String key : hashMap.keySet()){
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text){
        for(String key : hashMap.keySet()){
            if(key.contains(text))
            System.out.println(key);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text){
        for(String key : hashMap.keySet()){
            if(key.contains(text)){
                System.out.println(hashMap.get(key));
            }
        }
    }

    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e.", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e", "more precisely");

        printKey(hashMap);
        System.out.println("---");
        printKeysWhere(hashMap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashMap, ".e");

    }
}
