import java.io.*;
import java.util.List;

class Output {

    static void perform(String path, List<Slide> slides) throws IOException {
        try (PrintWriter writer = new PrintWriter(path)) {
            char NL = '\n';
            writer.print(slides.size());
            writer.print(NL);
            for (Slide slide : slides) {
                int[] ids = slide.getIDs();
                writer.print(ids[0]);
                if (ids.length == 2) {
                    writer.print(" " + ids[1]);
                }
                writer.print(NL);
            }
        }
    }
}