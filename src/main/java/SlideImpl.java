import java.util.ArrayList;
import java.util.List;

public class SlideImpl implements Slide{

    public List<String> tags;
    private int[] IDs;

    public SlideImpl(List<String> tags, int[] IDs){
        this.IDs = IDs;
        this.tags = tags;
    }

    @Override
    public int[] getIDs() {
        return this.IDs;
    }

    @Override
    public List<String> getTags() {
        return this.tags;
    }

    @Override
    public int compareTo(Slide slide) {
        return 0;
    }
}
