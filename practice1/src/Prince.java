public class Prince extends Human {
    private int size;

    public Prince() {
    }

    public Prince(String name, int age, int size) {
        super(name, age);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "size=" + size +
                "} " + super.toString();
    }

    public String findPrincess(Princess[] princesses) {
        for (Princess princess : princesses) {
            if (princess.getShoe() == this.size){
                return princess.toString();
            }
        }
        return "";
    }
}
