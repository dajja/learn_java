package hellopack;

public class hello {
    public int tuoi;
    public String ten;
    String address;
    int soNha;

    hello(String address, int sodiachi) {
        this.address = address;
        soNha = sodiachi;
    }

    public void tonLuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void tonLen(String ten) {
        this.ten = ten;
    }

    public void show() {
        System.out.println("ban co " + tuoi + " tuoi " + ten + address + soNha);
    }

    public static String rapchamthoi = "rapchamthoi";

    public static class ok {
        public void sayOK() {
            String a = "Noooooooooooooooooo";
            System.out.println(rapchamthoi);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ok trongok = new ok();
        trongok.sayOK();
        hello user = new hello("Vietdnam", 68);
        user.tonLuoi(200);
        user.tonLen("SvetleKit");
        user.show();
        System.out.println(rapchamthoi);
    }
}

class cc {
    // public static void main(String[] args) {
    // System.out.println("class cc");
    // }
    public void man2() {
        System.out.println("Man 2");
    }
}