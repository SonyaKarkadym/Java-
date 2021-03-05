package task2;

public class Guitar implements Instrument {
    private int guitarString;

    public Guitar(int guitarString) {
        this.guitarString = guitarString;
    }

    public int getGuitarString() {
        return guitarString;
    }

    public void setGuitarString(int guitarString) {
        this.guitarString = guitarString;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "guitarString=" + guitarString +
                '}';
    }

    public void play(){
        System.out.println("Play the guitar with" + " " +  guitarString);
    }
}
