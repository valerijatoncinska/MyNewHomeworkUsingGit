package MyNewHomeworkUsingGit.concultation9.example1;

import java.util.Comparator;

public class CupPriceComparator implements Comparator<Cup> {

    @Override
    public int compare(Cup o1, Cup o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
