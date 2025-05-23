import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Arraylist<String> stringList = new ArrayList();
        stringList.add("String");
        stringList.add("Ali");
        System.out.println(stringList);

        HashMap<String, String> grades = new HashMap();

        grades.put("Sheima",100);
        System.out.println(grades);
        grades.put("Ali",60);
        System.out.println(grades);

    }
}