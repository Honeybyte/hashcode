import java.util.ArrayList;

public interface Slide extends Comparable<Slide> {
    public int[] getIDs();

    public ArrayList<String> getTags();

    public int compareTo(Slide slide);
}
