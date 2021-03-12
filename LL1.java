import java.util.Iterator;
import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.addFirst("n");
        list.addLast("o");
        list.remove("b");

        Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        Iterator i = list.descendingIterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
