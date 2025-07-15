public class UserOverloadConstructor {
    String username;
    String email;
    int age;

    UserOverloadConstructor(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    UserOverloadConstructor(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    UserOverloadConstructor(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    UserOverloadConstructor(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
