import java.util.HashMap;

public class DebugDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Jack");
        hm.put(2, "Hery");
        hm.put(3, "Mary");
        hm.put(3, "Bob");
        String name = hm.get(1);
        System.out.println("name" + name);
        hm.remove(4);
        System.out.println(hm.size());
    }
}
