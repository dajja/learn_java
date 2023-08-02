package hellopack;

import java.util.HashMap;
import java.util.Map;

public class hello2 {
    public void condition() {
        int number = 30;
        if (number < 15) {
            System.out.println("loli");
        } else {
            System.out.println("elder");
        }
    }

    public static String array[] = { "a", "b", "c", "d", "e", "f" };

    public static void main(String[] args) {
        hello2 cases = new hello2();
        cases.condition();
        System.out.println("Hello cai ****");
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cac");
        map.put(4, "Dick");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}