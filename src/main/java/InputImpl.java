import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputImpl implements Input {
    private ArrayList<VertPictureImpl> verts = new ArrayList<>();
    private ArrayList<SlideImpl> slides = new ArrayList<>();

    public InputImpl(String path) {
        try {
            parse(path);
        }catch (IOException e){
            System.out.println("Error while parsing!");
        }
    }

    public void parse(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        line = br.readLine();
        int count = Integer.parseInt(line);
        for (int x = 0; x < count; x++){
            line = br.readLine();
            String[] parted = line.split(" ");
            if (parted[0] == "H"){
                ArrayList<String> tags = new ArrayList<>();
                for (int y = 2; y < parted.length; y++){
                    tags.add(parted[y]);
                }
                SlideImpl toAdd = new SlideImpl(tags, new int[]{x});
                this.slides.add(toAdd);
            }else {
                VertPictureImpl pic = new VertPictureImpl(x);
                for (int y = 2; y < parted.length; y++) {
                    pic.getTags().add(parted[y]);
                }
                this.verts.add(pic);
            }
        }
        br.close();
    }

    @Override
    public ArrayList<SlideImpl> getSlide() {
        return this.slides;
    }

    @Override
    public ArrayList<VertPictureImpl> getPictures() {
        return this.verts;
    }
}