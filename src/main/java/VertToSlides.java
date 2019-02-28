import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VertToSlides {
    private static List<Slide> slides = new ArrayList<>();
    private static List<VertPicture> pictures = new ArrayList<>();

    public static List<Slide> perform(List<VertPicture> ps) {
        pictures = ps;

        while (pictures.size() > 1)
            createSlide();

        Collections.sort(slides);
        return slides;
    }

    private static void createSlide() {
        int[] cs = slideCandidates();

        slides.add(new Slide(mergeTags(pictures.get(cs[0]), pictures.get(cs[1])), mergeIDs(pictures.get(cs[0]), pictures.get(cs[1]))));

        pictures.remove(cs[0]);
        pictures.remove(cs[1]);
    }

    private static int[] slideCandidates() {
        int[] result = new int[2];

        result[0] = pictures.size() - 1;
        int index = pictures.size() - 2;
        int currentMax = 0;
        result[1] = -1;
        while (result[1] < 0 || pictures.get(result[0]).getTags().size() + pictures.get(index).getTags().size() > currentMax) {
            if (pictures.get(result[0]).compareTo(pictures.get(index)) > currentMax)
                result[1] = index;
            index++;
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

    private static List<String> mergeIDs(VertPicture p1, VertPicture p2) {
        ArrayList<String> IDs = new ArrayList<>();

        for (String ID : p1.getTags())
            IDs.add(ID);
        for (String ID : p2.getTags())
            if (!IDs.contains(ID))
                IDs.add(ID);

        return IDs;
    }
}
