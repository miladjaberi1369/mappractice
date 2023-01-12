import java.time.LocalDate;
import java.util.*;
import java.time.LocalDate;
public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);


        System.out.println(person2.get("name"));
        System.out.println(person2.get("job_title"));


        List<Map <String , Object>> listOfmaps = new ArrayList<>();
        listOfmaps.add(person1);
        listOfmaps.add(person2);
        listOfmaps.addAll(Arrays.asList(person3,person4,person5));

        System.out.println(listOfmaps);

      //  listOfmaps.addAll(Arrays.asList(person3,person4));
        for(Map<String,Object> eachmap: listOfmaps)
        {
            System.out.println(eachmap);
            for (Map.Entry<String , Object> eachEntery: eachmap.entrySet())
            {
                System.out.println(eachEntery);



            }
        }

        System.out.println("----------------------------");

        for (Map<String , Object> eachmap : listOfmaps)
        {
            for(Map.Entry<String,Object> eachEntry  : eachmap.entrySet())
            {
                if(eachEntry.getKey().equals("hired_date"))
                {
                    if (((LocalDate)eachEntry.getValue()).getYear() == 2022)
                    {
                        System.out.println(eachmap.get("name"));
                    }
                }
            }


        }
        System.out.println("----------------");

        listOfmaps.get(0).replace("name", "Vasyl");
        listOfmaps.get(listOfmaps.size()-1).replace("salary",
                (Integer)listOfmaps.get(listOfmaps.size()-1).get("salary") + 50000);

        System.out.println(listOfmaps);

        System.out.println("------------------");

        listOfmaps.get(1).replace("age" , (Integer)listOfmaps.get(1).get("age") + 2);
        System.out.println(listOfmaps.get(1));



    }

}
