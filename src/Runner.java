import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        ManagerSV managerSV = new ManagerSV(sinhViens);
        SinhVien sinhVien1 = new SinhVien("01","Híu",20);
        SinhVien sinhVien2 = new SinhVien("02","Híu",23);
        SinhVien sinhVien3 = new SinhVien("03","Hà",22);
        SinhVien sinhVien4 = new SinhVien("04","Hoàng",29);
        sinhViens.add(sinhVien1);
        sinhViens.add(sinhVien3);
        sinhViens.add(sinhVien4);
        sinhViens.add(sinhVien2);
        Collections.sort(sinhViens);
        for (SinhVien o: sinhViens) {
            System.out.println(o);
        }
        System.out.println("------------dùng comparator-------------");
        Collections.sort(sinhViens, new Mycomparator());
        for (SinhVien o: sinhViens) {
            System.out.println(o);
        }


    }
}

