import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(ArrayList<Integer> items) {
        for (int i = 0; i < items.size() - 1; i++) {
            for (int j = 0; j < items.size() - 1 - i; j++) {
                if (items.get(j) > items.get(j + 1)) {
                    int swap = items.get(j);
                    items.get(j) = items.get(j + 1);
                    items.get(j + 1) = swap;
                }
            }
        }
    }
}
