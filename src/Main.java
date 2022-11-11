import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            mass[i] = rd.nextInt(0, 2);
            arrayList.add(i, rd.nextInt(0, 2));
            linkedList.add(i, rd.nextInt(0, 2));
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(arrayList);
        System.out.println(linkedList);
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        System.out.println(arrayList);
        System.out.println(linkedList);
        //не смог и не хватило времени отсортировать по overload
    }
}
