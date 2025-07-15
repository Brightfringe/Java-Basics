public class Interfaces {
    public static void main(String[] args) {
        RabbitInterface rabbit = new RabbitInterface();
        HawkInterface hawk = new HawkInterface();
        FishInterface fish = new FishInterface();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
