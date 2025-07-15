public class Static {
    public static void main(String[] args) {
        FriendForStatic friend1 = new FriendForStatic("shubhi");
        FriendForStatic friend2 = new FriendForStatic("tamatar");
        FriendForStatic friend3 = new FriendForStatic("tamatar");
        FriendForStatic friend4 = new FriendForStatic("tamatar");
        FriendForStatic friend5 = new FriendForStatic("tamatar");

        // System.out.println(friend1.name);
        /* System.out.println(friend1.numOfFriend);
        System.out.println(friend2.numOfFriend);
        System.out.println(friend3.numOfFriend);

         */
       // System.out.println(FriendForStatic.numOfFriend);
        FriendForStatic.showFriends();
    }
}
