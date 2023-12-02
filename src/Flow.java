import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<Group> {
    private List<Group> educationalGroups;

    public Flow(List<Group> educationalGroups) {
        this.educationalGroups = educationalGroups;
    }

    public List<Group> getEducationalGroups() {
        return educationalGroups;
    }
    public void addEducationalGroups(Group group) {educationalGroups.add(group);}

    @Override
    public Iterator<Group> iterator() {
        return new FlowIterator(this);
    }
    public void remove(Group group) {educationalGroups.remove(educationalGroups);}
}
