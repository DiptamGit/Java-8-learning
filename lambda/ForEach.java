package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("A",1);
        items.put("B",2);
        items.put("C",3);
        items.put("D",4);

        List<String> itemList = new ArrayList<>();
        itemList.add("A");
        itemList.add("B");
        itemList.add("C");
        itemList.add("D");

        System.out.println("With legacy for");
        for(Map.Entry<String,Integer> entry : items.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

        System.out.println("With new foreach & lambda");
        items.forEach((k,v) -> System.out.println(k+" : "+v));

        //Oracle doc :  https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
        System.out.println("With method reference");
        itemList.forEach(System.out::println);
    }
}
