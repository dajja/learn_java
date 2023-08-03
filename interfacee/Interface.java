package interfacee;

interface Kaipang {
    public void caygay();

    abstract void thanthe();
}

// tạo abstract class cung cấp cài đặt cho một phương thức của interface Kaipang
abstract class Kaibang implements Kaipang {
    public void caygay() {
        System.out.println("Da cau bong");
    }
}

class Vcd extends Kaibang {
    public void thanthe() {
        System.out.println("Minh dong da sat");
    }
}

public class Interface {
    public static void main(String[] args) {
        Kaipang obj = new Vcd(); // hoac Vcd cung hoat dong: Vcd obj = new Vcd() (uu tien cai 1 vi la interface)
        obj.caygay();
        obj.thanthe();
    }
}

// Kaipang obj = new Vcd() (Kaipang o day la cai minh can de render ra duoc, con Vcd() la cai chua cai minh muon render ra ( cang rong cang tot )) 