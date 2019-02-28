import java.util.ArrayList;
import java.util.List;

public interface VertPicture extends Comparable<VertPicture> {
    public int getID();

    public List<String> getTags();

    public int compareTo(VertPicture picture);
}
