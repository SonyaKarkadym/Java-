package lesson1;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[]{
            new User(1,13,"karina","kross",52.3,160.3),
                new User(2,14,"alina","lion",54.2,82.4)
        };

        int resAge = 0;
        double resWeight = 0;
        double resHeight = 0;
        for (User user : users) {
            resAge += user.age;
        }

        for (User user : users) {
            resWeight += user.weight;
        }

        for (User user : users) {
            resHeight += user.height;
        }

        System.out.println(resAge);
        System.out.println(resWeight);
        System.out.println(resHeight);
    }
}
