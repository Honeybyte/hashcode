import java.util.ArrayList;
import java.util.List;

public class SlideShow {
    //--------------------------------------------------------
    // attributes
    //--------------------------------------------------------
    private List<Slide> slides;

    //--------------------------------------------------------
    // constructors
    //--------------------------------------------------------
    public SlideShow(List<Slide> slides) {
        this.slides = slides;
    }

    //--------------------------------------------------------
    // public functions
    //--------------------------------------------------------
    public List<Slide> perform() {
        //variables
        List<Slide> show = new ArrayList<Slide>();
        int bestIndex[] = new int[2];
        int bestValue[] = new int[2];

        //iterate through the slide-array and attach the two best slides to the output
        show.add(slides.get(slides.size() - 1));
        slides.remove((slides.size() - 1));
        while(slides.size() > 0){
            bestIndex[0] = 0;
            bestIndex[1] = 0;
            bestValue[0] = 0;
            bestValue[1] = 0;
            for(int i = 0; i < slides.size(); i++){

                //check if the current slide suits the left-side of the slideshow or the right-side
                int resLeft = slides.get(i).compareTo(show.get(0));
                int resRight = slides.get(i).compareTo(show.get(show.size() - 1));
                if(resLeft > resRight) {

                }
                else if(resRight > resLeft) {

                }
                else {

                }
            }
        }
        return show;
    }
}
