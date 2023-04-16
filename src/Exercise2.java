import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        //Exercise2

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Flavius", 22, "brown"));
        persons.add(new Person("Flavius", 22, "red"));
        persons.add(new Person("Marius", 22, "red"));
        persons.add(new Person("Darius", 54, "brown"));
        persons.add(new Person("Ana", 19, "blonde"));
        persons.add(new Person("Silvia", 19, "white"));
        persons.add(new Person("Mihaela", 33, "black"));

        //2.1 extract the list of person names
        personsNames(persons);

        //2.2 create a map from person's name to their age
        mapNameToAge(persons);

        //2.3 extract the persons that are older than a given age
        olderThan(persons, 30);

        //2.4 extract a map from person's hair colour to their name
        hairColourToName(persons, "brown");
        hairColourToName(persons, "red");

        //2.5 create a map from age to list of persons
        ageToList(persons, 22);

    }

    public static ArrayList<String> personsNames(ArrayList<Person> array) {

        ArrayList<String> personsName = new ArrayList<>();

        for (Person p : array) {
            personsName.add(p.getName());
        }
        System.out.println(personsName);
        return personsName;
    }

    public static Map<String, Integer> mapNameToAge(ArrayList<Person> array) {

        Map<String, Integer> mapNameToAge = new HashMap<>();
        for (Person p : array) {
            mapNameToAge.put(p.getName(), p.getAge());
        }

        System.out.println(mapNameToAge);
        return mapNameToAge;
    }

    public static ArrayList<String> olderThan(ArrayList<Person> array, int age) {

        ArrayList<String> olderThan = new ArrayList<>();
        for (Person p : array) {
            if (p.getAge() > age) {
                olderThan.add(p.getName());
            }
        }

        System.out.println(olderThan);
        return olderThan;
    }

    public static Map<String, ArrayList<String>> hairColourToName(ArrayList<Person> array, String colour) {

        Map<String, ArrayList<String>> hairColourToName = new HashMap<>();
        ArrayList<String> nameArrays = new ArrayList<>();

        for (Person p : array) {
            if (p.getHairColour() == colour) {
                nameArrays.add(p.getName());
                hairColourToName.put(p.getHairColour(), nameArrays);
            }
        }

        System.out.println(hairColourToName);
        return hairColourToName;
    }

    private static Map<Integer, ArrayList> ageToList(ArrayList<Person> array, int age) {

        Map<Integer, ArrayList> ageToList = new HashMap<>();
        ArrayList<String> persons = new ArrayList<>();
        for (Person p : array) {
            if (p.getAge() == age) {
                persons.add(p.getName());
                ageToList.put(p.getAge(), persons);
            }
        }

        System.out.println(ageToList);
        return ageToList;
    }
}


