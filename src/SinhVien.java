public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private int age;

    public SinhVien(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(SinhVien o) {
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id +
                ", name='" + name +
                ", age=" + age +
                '}';
    }
}
