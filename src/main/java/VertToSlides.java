import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VertToSlides {
    private List<Slide> slides = new ArrayList<>();
    private List<VertPicture> pictures;

    public VertToSlides(List<VertPicture> pictures) {
        this.pictures = pictures;
    }

    public List<Slide> perform() {
        while (pictures.size() > 1)
            createSlide();

        Collections.sort(slides);
        return slides;
    }

    private void createSlide() {
        int[] cs = slideCandidates();

        slides.add(new SlideImpl(
                mergeTags(pictures.get(cs[0]), pictures.get(cs[1])),
                mergeIDs(pictures.get(cs[0]), pictures.get(cs[1])))
        );

        pictures.remove(cs[0]);
        pictures.remove(cs[1]);
    }

    private int[] slideCandidates() {
        int[] result = new int[2];

        if (pictures.size() < 2)
            return result;
        else if (pictures.size() == 2) {
            result[0] = 1;
            result[1] = 0;
            return result;
        }


        result[0] = pictures.size() - 1;
        int index = pictures.size() - 2;
        int currentMax = 0;
        result[1] = -1;
        while (result[1] < 0 || pictures.get(result[0]).getTags().size() + pictures.get(index).getTags().size() > currentMax) {
            List<String> tempTags = mergeTags(pictures.get(result[0]), pictures.get(index));
            if (tempTags.size() > currentMax) {
                result[1] = index;
                currentMax = tempTags.size();
            }
            index--;
        }

        return result;
    }

    private static List<String> mergeTags(VertPicture p1, VertPicture p2) {
        ArrayList<String> tags = new ArrayList<>();

        for (String tag : p1.getTags())
            tags.add(tag);
        for (String tag : p2.getTags())
            if (!tags.contains(tag))
                tags.add(tag);

        return tags;
    }

    private static int[] mergeIDs(VertPicture p1, VertPicture p2) {
        int[] IDs = new int[2];

        IDs[0] = p1.getID();
        IDs[1] = p2.getID();

        return IDs;
    }
}
