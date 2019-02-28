import java.util.List;

public class SlideImpl implements Slide{

    private List<String> tags;
    private int[] IDs;

    SlideImpl(List<String> tags, int[] IDs){
        this.IDs = IDs;
        this.tags = tags;
    }

    @Override
    public int[] getIDs() {
        return this.IDs;
    }

    @Override
    public List<String> getTags() {
        return this.tags;
    }

    @Override
    public int compareTo(Slide slide) {
        int same = 0;
        int setThis = 0;
        int setOther = 0;

        while(same + setThis < this.tags.size() || same + setOther < slide.getTags().size()){

            if(same + setThis >= this.tags.size())
                setOther++;
            else if(same + setOther >= slide.getTags().size())
                setThis++;
            else{
                int result = this.tags.get(same + setThis).compareTo(slide.getTags().get(same + setOther));
                if(result == 0)
                    same++;
                else if(result < 0)
                    setThis++;
                else
                    setOther++;
            }
        }
        return Math.min(Math.min(same, setThis), setOther);
    }
}
