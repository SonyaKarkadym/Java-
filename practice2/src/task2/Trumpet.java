package task2;

public class Trumpet implements Instrument{
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }

    public void play(){
        System.out.println("This is trumpet with diameter:"+" "+diameter);
    }
}
