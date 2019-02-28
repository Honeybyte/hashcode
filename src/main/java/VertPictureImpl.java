import java.util.ArrayList;

public class VertPictureImpl implements VertPicture {
    private ArrayList<String> tags = new ArrayList<>();
    private int ID;

    public VertPictureImpl (int ID){
        this.ID = ID;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public ArrayList<String> getTags() {
        return this.tags;
    }

    @Override
    public int compareTo(VertPicture picture) {
        return 0;
    }
}
