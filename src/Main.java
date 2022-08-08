import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Students students1 = new Students("Nam",20,"HN");
        Students students2 = new Students("Hung",21,"Hn");
        Students students3 = new Students("Ha",22,"Hn");
        Map<Integer,Students> studentsMap = new HashMap<Integer,Students>();
        studentsMap.put(1,students1);
        studentsMap.put(2,students2);
        studentsMap.put(3,students3);
        studentsMap.put(4,students1);
        for (Map.Entry<Integer,Students> student : studentsMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Students> students = new HashSet<Students>();
        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students1);
        for (Students student : students){
            System.out.println(student.toString());
        }

    }
}
