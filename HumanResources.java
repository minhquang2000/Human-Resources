import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HumanResources {
    // Khai báo phương thức main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai báo ArrayList staffs và departments
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(new Department("hanhchinh", "Hanh chinh", 0));
        departments.add(new Department("ketoan", "Ke toan", 0));
        departments.add(new Department("nhansu", "Nhan su", 0));
        departments.add(new Department("marketing", "Marketing", 0));
        departments.add(new Department("taichinh", "Tai chinh", 0));
        // Vòng lặp do-while mỗi khi người dùng kết thúc tính năng ứng dụng
        do {
            // Hiển thị thông báo của ứng dụng
            System.out.println();
            System.out.println("HUMAN RESOURCES");
            System.out.println("1. Hien thi danh sach nhan vien hien co trong cong ty");
            System.out.println("2. Hien thi cac bo phan trong cong ty");
            System.out.println("3. Hien thi cac nhan vien theo tung bo phan");
            System.out.println("4. Them nhan vien moi vao cong ty");
            System.out.println("5. Tim kiem thong tin nhan vien theo ten hoac ma so nhan vien");
            System.out.println("6. Hien thi bang luong cua nhan vien theo thu tu tang dan");
            System.out.println("7. Hien thi bang luong cua nhan vien theo thu tu giam dan");
            System.out.println("8. Thoat");
            System.out.println();
            System.out.print("Nhap phim so (1-8) de chay ung dung: ");
            int inputNumb = sc.nextInt();

            // Cho người dùng lựa chọn các tính năng của ứng dụng
            switch (inputNumb) {
                case 1:
                    // Vòng lặp for each gọi đến hàm displayInformation cho từng đối tượng
                    for (Staff s : staffs)
                        s.displayInformation();
                    break;
                case 2:
                    // Vòng lặp for each duyệt qua arraylist departents
                    for (Department n : departments) {
                        int count = 0; // Khởi tạo biến đếm số lượng nhân viên trong bộ phận
                        for (Staff s : staffs)
                            // So sánh thuộc tính nameDepart trong Department và department trong Staff
                            if (n.getnameDepart().equals(s.department)) {
                                count++;
                            }
                        n.setnumOfEmployee(count);
                        System.out.println(n.toString());
                    }
                    break;
                case 3:
                    // Dùng vòng lặp so sánh nameDepart - department và in ra thông tin nhân viên
                    for (Department n : departments)
                        for (Staff s : staffs)
                            if (n.getnameDepart().equals(s.department)) {
                                s.displayInformation();
                            }
                    break;
                case 4:
                    // Hiển thị từng mục thông tin cho người dùng nhập
                    sc.nextLine();
                    System.out.println("Them nhan vien moi");
                    System.out.println("Dien thong tin theo tung muc duoi day");
                    System.out.print("Ma nhan vien: ");
                    String id = sc.nextLine();
                    System.out.print("Ho ten: ");
                    String name = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int age = sc.nextInt();
                    System.out.print("He so luong: ");
                    double payRate = sc.nextDouble();
                    System.out.print("Ngay vao lam (dd/mm/yyyy): ");
                    String startDate = sc.next();
                    System.out.println("Bo phan lam viec: ");
                    String department;
                    String idDepart;
                    System.out.println("1. Hanh chinh");
                    System.out.println("2. Ke toan");
                    System.out.println("3. Nhan su");
                    System.out.println("4. Marketing");
                    System.out.println("5. Tai chinh");
                    System.out.print("Nhan phim (1-5) nhap ten bo phan lam viec: ");
                    String depart = sc.next();
                    // Đưa ra các trường hợp nhân viên thuộc bộ phận làm việc
                        switch (depart) {
                            case "1":
                                department = "Hanh chinh";
                                idDepart = "hanhchinh";
                                break;
                            case "2":
                                department = "Ke toan";
                                idDepart = "ketoan";
                                break;
                            case "3":
                                department = "Nhan su";
                                idDepart = "nhansu";
                                break;
                            case "4":
                                department = "Marketing";
                                idDepart = "marketing";
                                break;
                            case "5":
                                department = "Tai chinh";
                                idDepart = "taichinh";
                                break;
                            default:
                                System.out.println("Nhap khong dung phim so");
                                System.out.println("Xin vui long nhap lai (1-5)");
                                continue;
                        }
                    System.out.print("So ngay nghi phep: ");
                    int numDayOff = sc.nextInt();
                    System.out.print("Nhan vien moi co chuc danh hay khong? (1-co, 2-khong): ");
                    String type = sc.next();
                    // Đưa ra 2 trường hợp phân loại nhân viên và quản lý
                    switch (type) {
                        case "1":
                            System.out.print("Chuc danh: ");
                            String position = sc.next();
                            Manager manager = new Manager(id, name, age, payRate, startDate, department, numDayOff,
                                    position);
                            staffs.add(manager);
                            break;
                        case "2":
                            System.out.print("So gio lam them: ");
                            double overtimeHour = sc.nextDouble();
                            Employee employee = new Employee(id, name, age, payRate, startDate, department, numDayOff,
                                    overtimeHour);
                            staffs.add(employee);
                            break;
                        default:
                            System.out.println("Nhap khong dung phim so");
                            System.out.println("Xin vui long nhap lai (1-5)");
                            continue;
                    }
                    break;
                case 5:
                    // Người dùng nhập tên hoặc mã nhân viên cần tìm
                    sc.nextLine();
                    System.out.print("Nhap ten hoac ma nhan vien can tim: ");
                    String findInfo = sc.nextLine();
                    // Dùng vòng lặp so sánh findInfo với thuộc tính name hoặc id trong Staff
                    for (Staff s : staffs) {
                        if (s.getname().equalsIgnoreCase(findInfo) || s.getid().equalsIgnoreCase(findInfo)) {
                            // In thông tin
                            s.displayInformation();
                        }
                    }
                    break;
                case 6:
                    // Hiển thị thông tin nhân viên theo thứ tự lương tăng dần
                    Collections.sort(staffs, new Comparator<Staff>() {
                        @Override
                        public int compare(Staff o1, Staff o2) {
                            return ((ICalculator) o1).calculateSalary() > ((ICalculator) o2).calculateSalary() ? 1 : -1;
                        }
                    });
                    for (Staff s : staffs)
                        s.displayInformation();
                    break;
                case 7:
                    // Hiển thị thông tin nhân viên theo lương giảm dần
                    Collections.sort(staffs, new Comparator<Staff>() {
                        @Override
                        public int compare(Staff o1, Staff o2) {
                            return ((ICalculator) o1).calculateSalary() < ((ICalculator) o2).calculateSalary() ? 1 : -1;
                        }
                    });
                    for (Staff s : staffs)
                        s.displayInformation();
                    break;
                case 8:
                    System.out.println("Ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("Nhap khong dung phim so");
                    continue;
            }
        } while (true);
    }
}
