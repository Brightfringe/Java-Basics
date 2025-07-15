public class FriendForStatic {
    static int numOfFriend;
    String name;
    FriendForStatic(String name){
        this.name = name;
        numOfFriend ++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriend + " total friends");
    }
}
