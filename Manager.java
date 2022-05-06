//Khởi tạo Manager thừa kế abstract Staff và interface ICalculator
public class Manager extends Staff implements ICalculator {
    // Khai báo thuộc tính
    private String position;
    private int responSalary; // Lương trách nhiệm của quản lý

    // Constructor
    public Manager(String id, String name, int age, double payRate, String startDate, String department, int numDayOff,
            String position) {
        super(id, name, age, payRate, startDate, department, numDayOff);
        this.position = position;
    }

    // Triển khai getter và setter cho từng biến dữ liệu
    public String getposition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }

    public int getresponSalary() {
        return responSalary;
    }

    public void setresponSalary(int position) {
        this.responSalary = responSalary;
    }

    // Ghi đè phương thức calculateSalary trả về giá trị lương quản lý
    @Override
    public double calculateSalary() {
        // Chia ra các trường hợp tùy theo chức danh quản lý người dùng nhập
        if (position.equalsIgnoreCase("BusinessLeader")) {
            responSalary = 8;
        } else if (position.equalsIgnoreCase("ProjectLeader")) {
            responSalary = 5;
        } else {
            responSalary = 6;
        }
        double salary = payRate * 5 + responSalary;
        return salary;
    }

    // Ghi đè phương thức displayInformation hiển thị thông tin quản lý
    @Override
    public void displayInformation() {
        System.out.println();
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chuc danh: " + position);
        System.out.println("He so luong: " + payRate);
        System.out.println("Ngay vao lam (dd/mm/yyyy): " + startDate);
        System.out.println("Bo phan lam viec: " + department);
        System.out.println("So ngay nghi phep: " + numDayOff);
        System.out.println("Luong nhan vien: " + calculateSalary() + "trieuVND");
        System.out.println("________________________________");
        System.out.println();
    }
}
