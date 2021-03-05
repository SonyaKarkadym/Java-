public class Princess extends Human{
    public int shoe;

    public Princess() {
    }

    public Princess(String name, int age, int shoe) {
        super(name, age);
        this.shoe = shoe;
    }

    public int getShoe() {
        return shoe;
    }

    public void setShoe(int shoe) {
        this.shoe = shoe;
    }

    @Override
    public String toString() {
        return "Princess{" +
                "shoe=" + shoe +
                "} " + super.toString();
    }
}
