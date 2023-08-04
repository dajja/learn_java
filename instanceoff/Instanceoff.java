package instanceoff;

class A {

}

public class Instanceoff extends A {
    public Object[] obj;

    public void objectF() {
        obj = new Object[3];
        obj[0] = 1;
        obj[1] = "ahssssss chetic";
        obj[2] = 50000;
    }

    public static void main(String[] args) {
        Instanceoff a = new Instanceoff();
        a.objectF();
        System.out.println(a instanceof A);// true
        for (int i = 0; i < a.obj.length; i++) {
            if (a.obj[i] instanceof Number) {
                System.out.println("kieu so : " + a.obj[i]);
            } else if (a.obj[i] instanceof String) {
                System.out.println("kieu chuoi : " + a.obj[i]);
            } else {
                System.out.println("con lai");
            }
        }
    }
}
