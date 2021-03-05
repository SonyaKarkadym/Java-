package task1;

import task1.Printable;

public class Main {
    public static void main(String[] args) {
        Printable array[] = new Printable[3];
        array[0] = new Book(1,"Wind");
        array[1] = new Magazine(1,"Vogue");
        array[2] = new Book(2,"Hello World");

        for(Printable el:array) {
            el.print();
        }

        Magazine.printMagazines(array);
        Book.printBooks(array);
    }


}
