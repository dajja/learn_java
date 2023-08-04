package thamchieu;

public class Thamchieu {
    int data = 50;

    void change(int data) { // phai dat la this.data thi bien data moi thay doi du lieu = 600
        this.data = data + 100; 
    }

    // void change(Thamchieu op) {
    // this.data = data + 100; // data se la 150
    // }

    public static void main(String args[]) {
        Thamchieu op = new Thamchieu();
        System.out.println("Trước khi thay đổi: " + op.data);
        op.change(500);
        // op.change(op);
        System.out.println("Sau khi thay đổi: " + op.data);
    }
}
