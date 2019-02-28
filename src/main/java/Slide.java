public interface Slide {
    public int[] getIDs();
    public void setIDs();

    public int getTagCount();
    public void setTagCount();

    public String[] getTags();
    public void setTags();

    public int compareTo(Slide slide);
}
