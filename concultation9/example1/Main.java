package MyNewHomeworkUsingGit.concultation9.example1;

public class Main {
    public static void main(String[] args) {
        Cup cup1 = new Cup(400, "White", 5);
        Cup cup2 = new Cup(300, "Blue", 10);

        int volumeC = cup1.compareTo(cup2);

        if (volumeC > 0){
            System.out.println("Cup one is larger");
        } else if (volumeC < 0) {
            System.out.println("Cup two is larger");
        } else {
            System.out.println("Cups are equals");
        }

        int priceC = new CupPriceComparator().compare(cup1, cup2);
        if (priceC > 0){
            System.out.println("Cup one is more expensive");
        } else if (priceC < 0) {
            System.out.println("Cup two is more expensive");
        } else {
            System.out.println("Cups are equals");
        }
    }
}
