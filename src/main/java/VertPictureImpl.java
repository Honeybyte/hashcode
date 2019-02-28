import java.util.ArrayList;

public class VertPictureImpl implements VertPicture {
    public ArrayList<String> tags = new ArrayList<>();

    @Override
    public int getID() {
        return 0;
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
