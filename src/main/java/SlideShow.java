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
        List<Slide> show = new ArrayList<>();
        int bestIndex[] = new int[2];
        int bestValue[] = new int[2];

        //iterate through the slide-array and attach the two best slides to the output
        show.add(slides.get(slides.size() - 1));
        slides.remove((slides.size() - 1));
        while(slides.size() > 0){
            bestIndex[0] = -1;
            bestIndex[1] = -1;
            bestValue[0] = -1;
            bestValue[1] = -1;
            for(int i = slides.size() - 1; i >= 0; i--){

                //check if the current slide suits the left-side of the slideshow or the right-side
                int resLeft = slides.get(i).compareTo(show.get(0));
                int resRight = slides.get(i).compareTo(show.get(show.size() - 1));
                if(resLeft > resRight) {
                    if(resLeft >= bestValue[0]) {
                        bestValue[0] = resLeft;
                        bestIndex[0] = i;
                    }
                    else if(resRight >= bestValue[1]) {
                        bestValue[1] = resRight;
                        bestIndex[1] = i;
                    }
                }
                else if(resRight > resLeft) {
                    if(resRight >= bestValue[1]) {
                        bestValue[1] = resRight;
                        bestIndex[1] = i;
                    }
                    else if(resLeft >= bestValue[0]) {
                        bestValue[0] = resLeft;
                        bestIndex[0] = i;
                    }
                }
                else {
                    //both sides are equally suited
                    if(resLeft < bestValue[0]){
                        if(resLeft >= bestValue[1]){
                            bestValue[1] = resLeft;
                            bestIndex[i] = i;
                        }
                    }
                    else if(resLeft < bestValue[1]){
                        bestValue[0] = resLeft;
                        bestIndex[0] = i;
                    }
                    else {
                        if(bestValue[0] <= bestValue[1]){
                            bestValue[0] = resLeft;
                            bestIndex[0] = i;
                        }
                        else {
                            bestValue[1] = resLeft;
                            bestIndex[1] = i;
                        }
                    }
                }
            }

            //add the slides to the output and remove them from the input
            if(bestIndex[0] != -1)
                show.add(0, slides.get(bestIndex[0]));
            if(bestIndex[1] != -1)
                show.add(slides.get(bestIndex[1]));
            if(bestIndex[0] != -1 && bestIndex[1] != -1) {
                if(bestIndex[0] < bestIndex[1]) {
                    slides.remove(bestIndex[1]);
                    slides.remove(bestIndex[0]);
                }
                else {
                    slides.remove(bestIndex[0]);
                    slides.remove(bestIndex[1]);
                }
            }
            else if(bestIndex[0] != -1)
                slides.remove(bestIndex[0]);
            else if(bestIndex[1] != -1)
                slides.remove(bestIndex[1]);
            else
                throw new RuntimeException("unknown error: neither left nor right slide selected!");
        }
        return show;
    }
}



































