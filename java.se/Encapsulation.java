public class Encapsulation {
    public static void main(String[] args) {
      User user = new User();
      System.out.println("初始名：" + user.getUsername());
      user.setUsername("cmh");
      System.out.println("更新后名：" + user.getUsername());
    }
}
class User {
    private String username = "nobody";

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String newName) {
        this.username = newName;
    }
}
