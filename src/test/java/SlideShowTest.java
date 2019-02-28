import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.assertEquals;

public class SlideShowTest {

    private Slide createSlide(String... tags){
        Arrays.parallelSort(tags);
        return new SlideImpl(Arrays.stream(tags).collect(Collectors.toList()), null);
    }

    @Test
    public void testSlideShowPerform(){

        //create the slides
        List<Slide> slides = new ArrayList<>();
        Slide s0 = createSlide("a", "e");
        Slide s1 = createSlide("f", "j", "z");                  //s0 = 0
        Slide s2 = createSlide("a", "b", "c", "d");             //s1 = 0; s0 = 1
        Slide s3 = createSlide("a", "e", "f", "h");             //s2 = 1; s1 = 1; s0 = 0
        Slide s4 = createSlide("e", "f", "j", "z");             //s3 = 2; s2 = 0; s1 = 0; s0 = 1
        Slide s5 = createSlide("b", "j", "z", "za", "zc");      //s4 = 2; s3 = 0; s2 = 1; s1 = 1; s0 = 0
        slides.add(s0);
        slides.add(s1);
        slides.add(s2);
        slides.add(s3);
        slides.add(s4);
        slides.add(s5);

        //create the new slideshow
        SlideShow show = new SlideShow(slides);

        //compute the result and compare it
        slides = show.perform();
        assertEquals(6, slides.size());

        slides.forEach(e -> { e.getTags().forEach(j -> System.out.print(j + " ")); System.out.println(""); });
    }
}
