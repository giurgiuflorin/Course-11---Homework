import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Domian", 7);
        map.put("Silvia", 9);
        map.put("Dana", 5);
        map.put("Marius", 5);

        //Print all students and their grades
        System.out.println(map);

        //Find the student with the highest grade
        System.out.println(highestGrade(map));

    }

    private static int highestGrade(Map<String, Integer> map) {

        int highestGrade = 0;
        Set<Map.Entry<String, Integer>> grades = map.entrySet();
        for (Map.Entry<String, Integer> m : grades) {
            if (m.getValue() > highestGrade) {
                highestGrade = m.getValue();
            }
        }
        return highestGrade;
    }



}
