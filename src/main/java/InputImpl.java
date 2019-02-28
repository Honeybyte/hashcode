import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputImpl implements Input {
    private VertPicture[] verts;
    private Slide[] slides;

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
        while (null != (line = br.readLine())) {

        }
        br.close();
    }

    @Override
    public Slide[] getSlide() {
        return this.slides;
    }

    @Override
    public VertPicture[] getPictures() {
        return this.verts;
    }
}