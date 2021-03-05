package task1;

public class Book implements Printable {
    public void print(){
        System.out.println("this is info about book");
    }
    private int id;
    private String name;

    public Book() {
    }

    public Book(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "task1.Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void printBooks(Printable[] printable){
        for (Printable el:printable){
            if(el instanceof Book){
                System.out.println(el.toString());
            }
        }
    }
}
