//Khởi tạo class Department lưu trữ thông tin các bộ phận
public class Department {
    //Khai báo các thuộc tính
    private String idDepart;
    private String nameDepart;
    private int numOfEmployee;
    
    //Constructor
    public Department(){

    }
    public Department(String idDepart, String nameDepart, int numOfEmployee){
        this.idDepart = idDepart;
        this.nameDepart = nameDepart;
        this.numOfEmployee = numOfEmployee;
    }

    //Triển khai getter và setter cho từng thuộc tính
    public String getidDepart(){
        return idDepart;
    }
    public void setidDepart(String idDepart){
        this.idDepart = idDepart;
    }
    public String getnameDepart(){
        return nameDepart;
    }
    public void setnameDepart(String nameDepart){
        this.nameDepart = nameDepart;
    }
    public int getnumOfEmployee(){
        return numOfEmployee;
    }
    public void setnumOfEmployee(int employee){
        this.numOfEmployee = employee;
    }
    
    //Dùng String toString trả về thông tin của các bộ phận
    @Override
    public String toString() {
        return "Ma bo phan: " + idDepart + " _____ " +
                "Ten bo phan: " + nameDepart + " _____ " +  
                "So luong nhan vien hien tai: " + numOfEmployee + " ";
    }
}
