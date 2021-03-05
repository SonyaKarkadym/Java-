public class Main {
    public static void main(String[] args) {
        Princess[] princesses = new Princess[]{
                new Princess("Kira", 14, 56),
                new Princess("Olha", 14, 38),
                new Princess("Sonya", 14, 36),
                new Princess("Karina", 14, 42),
                new Princess("Luba", 14, 35),
                new Princess("Polina", 14, 39),
                new Princess("Marina", 14, 100),
        };
        Prince vasia = new Prince("Vasia", 89, 38);
        System.out.println(vasia.findPrincess(princesses));
    }
}
