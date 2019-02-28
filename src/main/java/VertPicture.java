public interface VertPicture extends Comparable<VertPicture> {
    public int getID();

    public int getTagCount();
    public void setTagCount(int tagCount);

    public String[] getTags();
    public void setTags(String[] tags);

    public int compareTo(VertPicture picture);
}
