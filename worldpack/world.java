package worldpack;

import hellopack.hello;
import abcpack.*;

public class world {
    public static int count = 0; // static chi lay 1 lan ( khong thi moi lan dung se tao 1 lan rieng )
    static {
        System.out.println("Khoi static duoc thuc thi truoc ca phuog thuc main tai luc tai lop");
    }

    world() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        hello.ok obj = new hello.ok();
        obj.sayOK();
        // hello.ok.sayOK()
        world dt1 = new world(); // 1
        world dt2 = new world(); // 2
        world dt3 = new world(); // 3 ( neu khong phai bien static thi ca 3 deu la 1 )
    }
}
// public class world {
// public static void main(String args[]) {
// Abc obj = new Abc();
// obj.man3();
// }
// }

// class cc khong public nen khong dung duoc o day