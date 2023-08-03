package ls_accessmodifer.accessmodifer;

class Test {
    // private Test() {
    // neu viet constructor la private thi khong the tao duoc bien o class Access
    // duoc nua
    // }
    private String name = "A ko an mung"; // chi goi duoc private trong class cua chinh no ( o day la class Test )
    public String name2 = "A Ngoc";
    protected String name3 = "A Nguoc";

    private void print() {
        System.out.println("Het cuu");
    }
}

public class Access {
    protected void Sucking() {
        System.out.println("Hellottttt");
    }

    void Sucking2() {
        System.out.println("Hellodadadattttt");
    }

    public static void main(String[] args) {
        // System.out.println(new Test().name); // bao loi do o tren khai bao la private
        System.out.println(new Test().name2); // A Ngoc
        System.out.println(new Test().name3); // A Nguoc

        // new Test().print(); // tuong tu nhu name
    }
}
