public class OverloadedConstructors {
    public static void main(String[] args) {
        UserOverloadConstructor user1 = new UserOverloadConstructor("tamatar");
        UserOverloadConstructor user2 = new UserOverloadConstructor("nonu","nonu@nonu.com");
        UserOverloadConstructor user3 = new UserOverloadConstructor("guddu", "guddu@guddu.com", 34);
        UserOverloadConstructor user4 = new UserOverloadConstructor();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
