import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group21 = new Group(1, 100);
        Group group12 = new Group(2, 300);
        Group group32 = new Group(3, 400);
        Group group45 = new Group(4, 200);

        List<Group> educationalGroups = new ArrayList<>();
        educationalGroups.add(group21);
        educationalGroups.add(group12);
        educationalGroups.add(group32);
        educationalGroups.add(group45);

        Flow flow = new Flow(educationalGroups);
        FlowIterator iterator = new FlowIterator(flow);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        StreamService service = new StreamService(flow);
        for (Group group : service.getSorted()){
            System.out.println(group);
        }
    }
}

//
//
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        for (Student student : service.getStudents()){
//            System.out.println(student);
//        }