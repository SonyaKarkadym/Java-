package task2;

public class Drum implements Instrument{
    private String size;

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size='" + size + '\'' +
                '}';
    }

    public void play(){
        System.out.println("This is drum " + size +" "+"size");
    }
}
