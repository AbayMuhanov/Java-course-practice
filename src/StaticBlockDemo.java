import java.util.ArrayList;

public class StaticBlockDemo {
    public static ArrayList<String> ranks = new ArrayList<>();

    static {
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Major");

    }
}
