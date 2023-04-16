import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

       Map<DaysOfTheWeek, String[]> planOfDays = new HashMap<>();
       planOfDays.put(DaysOfTheWeek.LUNI, activities("mancare", "plimbare"));
       planOfDays.put(DaysOfTheWeek.MARTI, activities("munca", "somn"));
       planOfDays.put(DaysOfTheWeek.VINERI, activities("cumparaturi", "munca"));

       printActivities(planOfDays);

    }

    public static String[] activities(String... activities) {
        //mi-am amintit de acel tip de parametru indefinit din punctul de vedere al numarului de parametrii
        // folosind "..." si m-am gandit ca aici ar fi de folos

        String[] arrayOfActivities = activities;

        return arrayOfActivities;
    }

    public static void printActivities(Map<DaysOfTheWeek, String[]> map) {

        Set<Map.Entry<DaysOfTheWeek, String[]>> activities = map.entrySet();
        for (Map.Entry<DaysOfTheWeek, String[]> act : activities) {
            System.out.println(act.getKey() + " " + Arrays.toString(act.getValue()));
        }

    }
}