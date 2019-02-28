public interface VertPicture extends Comparable<VertPicture> {
    public int getID();

    public String[] getTags();
    public void setTags(String[] tags);

    public int compareTo(VertPicture picture);
}
