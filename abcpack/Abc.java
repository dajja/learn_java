package abcpack;

class Bike {
    final void run() {
        System.out.println("running...");
    }
}

public class Abc extends Bike {
    void display() {
        System.out.println("fk");
    }

    public static void main(String args[]) {
        new Abc().run();
        new Abc().display();
    }
}
