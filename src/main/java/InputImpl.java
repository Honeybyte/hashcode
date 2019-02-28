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

    public static void parse(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        line = br.readLine();
        int count = Integer.parseInt(line);
        for (int x = 0; x < count; x++){
            line = br.readLine();
            String[] parted = line.split(" ");
            if (parted[0] == "H"){
                Slide toAdd = new Sli
            }else {

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