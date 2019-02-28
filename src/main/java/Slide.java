import java.util.ArrayList;
import java.util.List;

public interface Slide extends Comparable<Slide> {
    public int[] getIDs();

    public List<String> getTags();

    public int compareTo(Slide slide);
}
