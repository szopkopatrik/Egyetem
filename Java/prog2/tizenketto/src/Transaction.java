public class Transaction implements Relationship{

    private int degree;

    public Transaction(int degree){
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
        return "Transaction{" +
                "degree=" + degree +
                '}';
    }
}
