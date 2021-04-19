import java.util.ArrayList;
import java.util.Scanner;

public class ManagerSV {
    private ArrayList<SinhVien> sinhViens;

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public ManagerSV(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
    public void deleteSinhvien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách muốn xoá: ");
        String name = scanner.nextLine();
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getName().equals(name)) {
                sinhViens.remove(sinhViens.get(i));
            }
        }
    }
}
