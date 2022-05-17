public abstract class StudentTemplate {
    protected final static int MAX_MARKS = 4;

    protected String name;
    protected float []marks;

    public abstract float calculateAverage();
    public abstract int getNotPassed();
    public abstract void showMarks();

}
