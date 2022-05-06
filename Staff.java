//Khởi tạo abstract class 
public abstract class Staff {
    // Khai báo các thuộc tính chứa thông tin nhân viên
    String id;
    String name;
    int age;
    double payRate;
    String startDate;
    String department;
    int numDayOff;

    // Constructor
    public Staff() {

    }

    public Staff(String id, String name, int age, double payRate, String startDate, String department,
            int numDayOff) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.payRate = payRate;
        this.startDate = startDate;
        this.department = department;
        this.numDayOff = numDayOff;
    }

    // Triển khai phương thức getter và setter cho từng biến cụ thể
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public double getpayRate() {
        return payRate;
    }

    public void setpayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getstartDate() {
        return startDate;
    }

    public void setstartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public int getnumDayOff() {
        return numDayOff;
    }

    public void setnumDayOff(int numDayOff) {
        this.numDayOff = numDayOff;
    }

    // Khởi tạo phương thức displayInformation hiển thị thông tin các thuộc tính
    public abstract void displayInformation();
}