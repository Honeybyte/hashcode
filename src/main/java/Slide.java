public interface Slide extends Comparable<Slide> {
    public int[] getIDs();

    public int getTagCount();
    public void setTagCount(int tagCount);

    public String[] getTags();
    public void setTags(String[] tags);

    public int compareTo(Slide slide);
}
