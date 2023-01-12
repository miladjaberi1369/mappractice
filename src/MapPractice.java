import java.util.LinkedHashMap;
import java.util.Map;
public class MapPractice {
    public static void main(String[] args) {
        Map<String ,Integer> map = new LinkedHashMap<>();
        map.put("Daniel" ,95000);
        map.put("Emily" , 100000);
        map.put("Bella" , 85000);
        map.put("Arron", 78000);
        map.put ("Jimmy", 78000);
        map.put ("Breanna", 98000);

        //iterrting map  by enteries

        for (Map.Entry< String , Integer> eachEntry: map.entrySet()) {
            System.out.println(eachEntry.getKey());
        }


    }
}

//update