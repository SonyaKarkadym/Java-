package task1;

public class Magazine implements Printable {
    public void print(){
        System.out.println("this is info about magazine");
    }

    private int id;
    private String name;

    public Magazine() {
    }

    public Magazine(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "task1.Magazine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void printMagazines(Printable[] printable){
        for (Printable el:printable){
            if(el instanceof Magazine){
                System.out.println(el.toString());
            }
        }
    }
}
