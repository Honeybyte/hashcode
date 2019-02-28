import java.util.ArrayList;

public interface VertPicture extends Comparable<VertPicture> {
    public int getID();

    public ArrayList<String> getTags();

    public int compareTo(VertPicture picture);
}
