package ls_accessmodifer.accessmodifer2;

import ls_accessmodifer.accessmodifer.Access;

public class Access2 extends Access {
    public static void main(String args[]) {
        Access2 obj = new Access2();
        obj.Sucking(); // method Sucking duoc khai bao voi protected nen phai ke thua (extends) thi moi dung duoc o day (do khac package)
        // obj.Sucking2(); // default va private khong duoc truy cap tu package khac
    }
}
