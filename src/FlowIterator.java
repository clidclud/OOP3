import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<Group> {
    private final List<Group> groups;
    private int counter;

    public FlowIterator(Flow flow) {
        this.groups = flow.getEducationalGroups();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }

    @Override
    public Group next() {
        if (hasNext()) {
            return groups.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
