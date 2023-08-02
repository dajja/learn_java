class Empire {
    public void name() {
        System.out.println("Empire");
    }
}

class Noble extends Empire {
    Noble() {
        System.out.println("Noble main");
    }

    public void name() {
        System.out.println("Noble");
    }
}

public class readname extends Noble {
    void display() {
        name();
    }

    public static void main(String[] args) {
        student st = new student();
        readname hetcuu = new readname();
        hetcuu.name(); // Noble nhung doi voi du lieu (int , string ...) thi se lay o thang cha
        hetcuu.display();
        st.readName("thomastuchel");
        System.out.println(st.getName());
    }
}
