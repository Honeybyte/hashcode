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
        // create slides as long as there are at least two vertical pictures left to pair
        while (pictures.size() > 1)
            createSlide();

        Collections.sort(slides);
        return slides;
    }

    private void createSlide() {
        // fix the picture with the most tags
        VertPicture picture = pictures.remove(pictures.size() - 1);
        // find the best matching picture
        VertPicture match = pictures.remove(findMatchFor(picture));

        Slide slide = new SlideImpl(
                mergeTags(picture, match),
                mergeIDs(picture, match)
        );
        Collections.sort(slide.getTags());
        slides.add(slide);
    }

    private int findMatchFor(VertPicture picture) {
        int match = -1;
        int tagsOfPair = 0;

        for (int i = pictures.size() - 1; i >= 0; i--) {
            // exit if a match has been found and all other possible matches have less tags combined
            if (match >= 0 && sumTags(picture, pictures.get(i)) <= tagsOfPair)
                break;

            List<String> tempTags = mergeTags(picture, pictures.get(i));
            if (match < 0 || tempTags.size() > tagsOfPair) {
                match = i;
                tagsOfPair = tempTags.size();
            }
        }

        return match;
    }

    private static int sumTags(VertPicture p1, VertPicture p2) {
        return p1.getTags().size() + p2.getTags().size();
    }

    private static List<String> mergeTags(VertPicture p1, VertPicture p2) {
        ArrayList<String> tags = new ArrayList<>(p1.getTags());

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
