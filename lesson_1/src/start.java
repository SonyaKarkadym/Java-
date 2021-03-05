public class start {
    public static void main(String[] args) {
        User user = new User();
        user.setId(-100);
        int userId = user.getId("1111");
        System.out.println(userId);
        String[] skills = new String[2];
        skills[0] = "java";
        skills[1] = "js";

        System.out.println(user);
        Wallet wallet = new Wallet("leather",10000);
        User userWithWallet = new User(3,"max",skills,wallet);
        System.out.println(userWithWallet);

        User userWithWallet2 = new User(4,"olya",new String[]{"html","css"},"wood",500);
        System.out.println(userWithWallet2);

    }
}
