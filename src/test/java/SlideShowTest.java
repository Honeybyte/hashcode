import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlideShowTest {

    private Slide createSlide(String... tags){
        Arrays.parallelSort(tags);
        return new SlideImpl(Arrays.stream(tags).collect(Collectors.toList()), null);
    }

    @Test
    void testSlideShowPerform(){

        //create the slides
        List<Slide> slides = new ArrayList<>();
        slides.add(createSlide("a", "b", "c", "d"));
        slides.add(createSlide("a", "e", "f", "h"));
        slides.add(createSlide("e", "f", "j", "z"));
        slides.add(createSlide("b", "j", "z", "za", "zc"));
        slides.add(createSlide("f", "j", "z"));
        slides.add(createSlide("a", "e"));

        //create the new slideshow
        SlideShow show = new SlideShow(slides);

        //compute the result and compare it
        slides = show.perform();

    }
}
