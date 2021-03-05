import java.util.Arrays;

public class User {

    private int id;
    private String name;
    private String[] skills;
    private Wallet wallet;

    public User() {
    }

    public User(int id, String name, String[] skills,Wallet wallet){
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = wallet;
    }

    public User(int id, String name, String[] skills,String type,int sum){
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = new Wallet(type,sum);
    }

    public User(int id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public int getId(String pass){
        if(pass.equals("1111")){
            return this.id;
        } else{
            return 0;
        }
    }

    public void setId(int id){
        if(id < 0){
            System.out.println("azazaza");
        }
        else {
            this.id = id;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", wallet=" + wallet +
                '}';
    }
}
