//Khởi tạo Employee thừa kế abstract Staff và interface ICalculator
public class Employee extends Staff implements ICalculator {
    private double overtimeHour;
    
    //Constructor
    public Employee(String id, String name, int age, double payRate, String startDate, String department,
            int numDayOff, double overtimeHour) {
        // Kế thừa thuộc tính từ class abstract Staff
        super(id, name, age, payRate, startDate, department, numDayOff);
        this.overtimeHour = overtimeHour;
    }

    // Triển khai getter và setter cho overtimeHour
    public double getovertimeHour() {
        return overtimeHour;
    }

    public void setovertimeHour(double overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    // Ghi đè phương thức calculateSalary trong ICalculator tính lương cho nhân viên
    @Override
    public double calculateSalary() {
        double salary = payRate * 3 + overtimeHour * 0.2;
        return salary;
    }

    // Ghi đè phương thức displayInformation hiển thị thông tin nhân viên
    @Override
    public void displayInformation() {
        System.out.println();
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("He so luong: " + payRate);
        System.out.println("Ngay vao lam (dd/mm/yyyy): " + startDate);
        System.out.println("Bo phan lam viec: " + department);
        System.out.println("So ngay nghi phep: " + numDayOff);
        System.out.println("So gio lam them: " + overtimeHour);
        System.out.println("Luong nhan vien: " + calculateSalary() + "trieuVND");
        System.out.println("________________________________");
        System.out.println();
    }
}
