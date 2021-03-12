import java.util.LinkedList;

public class DemoImpl {
    public static void main(String[] args) {
        LinkedList<Demo> li = new LinkedList<Demo>();

        Demo d1 = new Demo(1,"alice",10);
        Demo d2 = new Demo(2, "bob",90);
        Demo d3 = new Demo(3, "joe", 70);

        li.add(d1);
        li.add(d2);
        li.add(d3);

        for(Demo d: li)
        {
            System.out.println(d.id + " " + d.name + " " + d.num);
        }
    }
}
