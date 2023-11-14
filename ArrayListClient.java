import java.util.ArrayList;
import java.util.Collection;

public class ArrayListClient {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        Object e = new int[]{1, 2, 3, 5};
        list.add(e);
        Object ved = "hello";
        list.add(ved);
        if(list.contains(ved)) {
            System.out.println("list contains" + " " + ved);
        }
        list.remove(1);
        list.remove(0);
        System.out.println(list);
    }
}
