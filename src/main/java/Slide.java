public interface Slide extends Comparable<Slide> {
    public int[] getIDs();

    public String[] getTags();
    public void setTags(String[] tags);

    public int compareTo(Slide slide);
}
