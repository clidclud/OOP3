import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Flow educationalGroups;

    public StreamService(Flow educationalGroups) {
        this.educationalGroups = educationalGroups;
    }

    public Flow getEducationalGroups() {
        return educationalGroups;
    }
    public void removeStudent(Group group) {
        for (Group groupItem : educationalGroups){
            if(group.equals(groupItem)){
                educationalGroups.remove(group);
            }
        }
    }
    public List<Group> getSorted(){
        List<Group> studentList = new ArrayList<>(educationalGroups.getEducationalGroups());
        studentList.sort(new StreamComparator());
        return studentList;
    }
}
