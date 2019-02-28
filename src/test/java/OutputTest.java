import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class OutputTest {

    @Test
    public void perform() throws IOException {
        List<Slide> slides = new ArrayList<>();
        slides.add(new SlidesImpl(4, 0));
        slides.add(new SlidesImpl(2));
        slides.add(new SlidesImpl(8));
        slides.add(new SlidesImpl(12, 21));
        slides.add(new SlidesImpl(12, 14));
        Output.perform("output.txt", slides);
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String actual = reader.lines().collect(Collectors.joining("\n"));
        String expected = "5\n" +
                "4 0\n" +
                "2\n" +
                "8\n" +
                "12 21\n" +
                "12 14";
        assertEquals(expected, actual);
    }

    private class SlidesImpl implements Slide {

        private int[] ids;

        SlidesImpl(int id1) {
            this.ids = new int[1];
            ids[0] = id1;
        }

        SlidesImpl(int id1, int id2) {
            this.ids = new int[2];
            ids[0] = id1;
            ids[1] = id2;
        }

        @Override
        public int[] getIDs() {
            return ids;
        }

        @Override
        public List<String> getTags() {
            throw new UnsupportedOperationException();
        }


        @Override
        public int compareTo(Slide slide) {
            throw new UnsupportedOperationException();
        }
    }

}