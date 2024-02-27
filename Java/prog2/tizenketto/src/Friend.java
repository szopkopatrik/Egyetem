public class Friend implements Relationship{

    private int degree;

    public Friend(int degree) {
        this.degree = degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public int getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "degree=" + degree +
                '}';
    }
}
