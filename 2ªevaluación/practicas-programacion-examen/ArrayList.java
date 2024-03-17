import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();

        list.add(1);
        list.add(20);
        list.add(30);
        list.add(50);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
