package abstracts;

abstract class Shape {
    abstract void draw();
}
// abstract class dung de tap trung vao doi tuong thay vi vao cach trien khai, khai bao o lop cha va cach trien khai se duoc thuc hien o cac lop con 
class Rectangle extends Shape {
    void draw() {
        System.out.println("Ve hinh chu nhat");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Ve hinh tron");
    }
}

public class Abstract extends Shape {
    void draw() {
        System.out.println("Ve hinh cak");
    }

    public static void main(String args[]) {
        Shape s = new Abstract(); // khong bi loi compilation error vi abstract la lop con cua shape
        s.draw();
    }
}