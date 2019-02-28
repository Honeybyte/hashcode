import java.util.ArrayList;

public class SlideImpl implements Slide{

    public ArrayList<String> tags = new ArrayList<>();

    @Override
    public int[] getIDs() {
        return new int[0];
    }

    @Override
    public String[] getTags() {
        return new String[0];
    }

    @Override
    public void setTags(String[] tags) {

    }

    @Override
    public int compareTo(Slide slide) {
        return 0;
    }
}
