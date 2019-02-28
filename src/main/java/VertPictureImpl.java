import java.util.ArrayList;
import java.util.List;

public class VertPictureImpl implements VertPicture {
    private List<String> tags = new ArrayList<>();
    private int ID;

    public VertPictureImpl (int ID){
        this.ID = ID;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public List<String> getTags() {
        return this.tags;
    }

    @Override
    public int compareTo(VertPicture picture) {
        return this.getTags().size() - picture.getTags().size();
    }
}
