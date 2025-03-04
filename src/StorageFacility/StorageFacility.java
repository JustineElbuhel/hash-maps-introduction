package StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageInfo;

    public StorageFacility(){
        this.storageInfo = new HashMap<>();
    }

    public void add(String unit, String content){
        this.storageInfo.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> storageContent = this.storageInfo.get(unit);
        storageContent.add(content);
    }

    public ArrayList<String> contents(String unit){
        return this.storageInfo.get(unit);
    }

    public void remove(String unit, String item){
        this.storageInfo.get(unit).remove(item);
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();

        for(String unit : storageInfo.keySet()){
           if(!storageInfo.get(unit).isEmpty()){
               units.add(unit);
           }
        }
        return units;
    }

    public static void main(String[] args){
        StorageFacility facility = new StorageFacility();
        facility.add("a001", "cabinet");
        facility.add("a001", "table");
        facility.add("a001", "chair");

        facility.add("b011", "skates");
        facility.add("b011", "skates");

        facility.add("k120", "cello");
        facility.add("k120", "violin");

        System.out.println(facility.contents("k120"));
        System.out.println(facility.contents("a001"));

        facility.remove("b011", "skates");
        facility.remove("b011", "skates");
        System.out.println(facility.contents("b011"));

        System.out.println(facility.storageUnits());
    }
}
