public class AnonymousClasses {
    public static void main(String[] args) {
        AnonymousDog dog = new AnonymousDog();
       // AnonymousTalkingDog talkingDog = new AnonymousTalkingDog();//rather than creating a whole new class for just this will create an anonymous class
        AnonymousDog dog2 = new AnonymousDog(){
            @Override
            void speak(){
                System.out.println("Scooby doo says ruh ruh");
            }
        };

        dog2.speak();
      //  talkingDog.speak();
    }
}
