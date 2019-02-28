import java.util.ArrayList;

public class SlideImpl implements Slide{

    public ArrayList<String> tags;
    private int[] IDs;

    public SlideImpl(ArrayList<String> tags, int[] IDs){
        this.IDs = IDs;
        this.tags = tags;
    }

    @Override
    public int[] getIDs() {
        return this.IDs;
    }

    @Override
    public ArrayList<String> getTags() {
        return this.tags;
    }

    @Override
    public int compareTo(Slide slide) {
        return 0;
    }
}
