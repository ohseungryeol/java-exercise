package week4.d1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.age = 25;

        User user2 = new User();
        user2.age = 5;

        System.out.println(user1.isAdult());
        System.out.println(user2.isAdult());


    }
}
