import java.util.HashMap;
import  java.util.Map;
public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");
        
        //howmany female and male ?
        int countFemaleEmployee = 0 ;
        int countMaleEmployee = 0 ;
/*  Since we are using the key only once it's not the best practice
        for(String name: employeeMap.keySet())
        {
            String gender = employeeMap.get(name);
            if (gender.equalsIgnoreCase("M"))
                countMaleEmployee++ ;
            else
                countFemaleEmployee++;
        }*/

        for (String value : employeeMap.values())
        {
            if (value.equalsIgnoreCase("m"))
                countMaleEmployee++ ;
            else
                countFemaleEmployee++ ;
        }

        System.out.println(countFemaleEmployee);
        System.out.println(countMaleEmployee);
        System.out.println("-------------------------------------------");

        //Second soloution with entry

        for(Map.Entry<String , String> eachEntry: employeeMap.entrySet())
        {
            if (eachEntry.getValue().equalsIgnoreCase("f")) {

                System.out.println(eachEntry.getKey());

            }

        }
        System.out.println("----------------------------------");
        //updating all the values of M to Male and F to Female

        for (Map.Entry<String,String> eachentery: employeeMap.entrySet()
             ) {
            if (eachentery.getValue().equalsIgnoreCase("M"))
                eachentery.setValue("Male");
            else
                eachentery.setValue("Female");

        }
        System.out.println(employeeMap);
                
    }
}
