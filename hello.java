package hellopack;
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ok trongok = new ok();
        trongok.sayOK();
    }
    public static class ok {
        public static void sayOK() {
            System.out.println("OK Em");
        }
    }
}
class cc {
    // public static void main(String[] args) {
    //     System.out.println("class cc");
    // }
    public void man2() {
        System.out.println("Man 2");
    }
}