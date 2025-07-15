  class CowOverriding {
    void moves(){
        System.out.println("moving");
    }
}

 class Tamatar extends CowOverriding{
    @Override
     void moves(){
        System.out.println("walking");
    }

}

 class sigma{
    public static void main(String[] args) {
        Tamatar tamatar = new Tamatar();

        tamatar.moves();
    }
}
