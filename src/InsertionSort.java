import java.util.ArrayList;

public class InsertionSort implements  SortStrategy {
    @Override
    public void sort(ArrayList<Integer> items) {
//        for (int i=1;i<items.size();i++){
//            int keyValue=items[i];
//            int j=i-1;
//            while (j>=0 && items[j]>keyValue){
//                items[j+1]=items[j];
//                j=j-1;
//            }
//            items[j+1]=keyValue;
//        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(0));
    }
}
