package task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] array = new Instrument[3];
        array[0] = new Guitar(5);
        array[1] = new Drum("medium");
        array[2] = new Trumpet(25);
        for (Instrument el:array){
            el.play();
        }
    }
}
