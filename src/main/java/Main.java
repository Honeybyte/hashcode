import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputImpl input = new InputImpl(args[0]);
        List<Slide> slides = new VertToSlides(input.getPictures()).perform();
        slides.addAll(input.getSlide());
        Collections.sort(slides);
        slides = new SlideShow(slides).perform();
        Output.perform("tmp/output.txt", slides);
    }
}