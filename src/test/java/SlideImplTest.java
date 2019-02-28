import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SlideImplTest {

    @Test
    public void compareToSame() {
        Slide slideA = createSlide("abc", "b", "ok", "what", "nice");
        Slide slideB = createSlide("abc", "b", "ok", "what", "nice");
        assertEquals(0, slideA.compareTo(slideB));

        slideA = createSlide("abc", "b", "ok", "what", "nice");
        slideB = createSlide("not", "one", "even", "same");
        assertEquals(0, slideA.compareTo(slideB));

        slideA = createSlide("abc", "efg", "hij");
        slideB = createSlide("abc", "and", "then");
        assertEquals(1, slideA.compareTo(slideB));

        slideA = createSlide("abc", "and", "hij", "whatever");
        slideB = createSlide("abc", "and", "then", "okay");
        assertEquals(2, slideA.compareTo(slideB));

        slideA = createSlide("abc", "and", "hij", "whatever");
        slideB = createSlide("abc", "and", "then", "okay", "wuhu");
        assertEquals(2, slideA.compareTo(slideB));

        slideA = createSlide("abc", "and", "hij", "whatever", "wuhu");
        slideB = createSlide("abc", "and", "then", "okay");
        assertEquals(2, slideA.compareTo(slideB));
    }

    private Slide createSlide(String... tags) {
        Arrays.parallelSort(tags);
        return new SlideImpl(Arrays.stream(tags).collect(Collectors.toList()), null);
    }
}