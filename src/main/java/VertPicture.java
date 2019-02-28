public interface VertPicture {
    public int getID();
    public void setID();

    public int getTagCount();
    public void setTagCount();

    public String[] getTags();
    public void setTags();

    public int compareTo(VertPicture picture);
}
