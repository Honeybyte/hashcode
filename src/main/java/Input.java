import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Input {
    public Slide[] getSlide();
    public void setSlides();

    public VertPicture[] getPictures();
    public void setPictures();
}