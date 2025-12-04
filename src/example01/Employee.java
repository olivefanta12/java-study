package example01;

public class Employee {


    //1. 필드 생성 (상태만들기 = getter, setter)
    //2. 생성자 만들기 (오버로딩)
    private String name;
    private String phone;
    private String dept;
    private int empNo;
    private int salary;
    private String account;
    private String position;

    public Employee(String name, String phone) {
        this.dept = "미정";
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
        this.name = name;
        this.phone = phone;
    }


    public Employee(String name, String phone, String dept) {
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
        this.name = name;
        this.phone = phone;
        this.dept = dept;
    }


    public Employee(String name, String phone, String dept, int empNo, int salary, String account, String position) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }

    void printInfo() {
        System.out.println("이름 : " + name + " / " +
                "전화번호 : " + phone + " / " +
                "부서 : " + dept + " / " +
                "사원번호 : " + empNo + " / " +
                "직급 : " + position + " / " +
                "월급 : " + salary + " / " +
                "계좌 :" + account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public int calcYearSalary() {
        return salary * 12;
    }

    public int calcYearSalaryWithBonus() {
        int calcYearSalaryWithBonus = 0;
        if (position.equals("사원")) {
            calcYearSalaryWithBonus = (int) (calcYearSalary() * 0.1);
        } else if (position.equals("대리")) {
            calcYearSalaryWithBonus = (int) (calcYearSalary() * 0.2);
        } else if (position.equals("과장")) {
            calcYearSalaryWithBonus = (int) (calcYearSalary() * 0.3);
        } else if (position.equals("부장")) {
            calcYearSalaryWithBonus = (int) (calcYearSalary() * 0.4);
        }
        return calcYearSalaryWithBonus;
    }

    public void promote() {
        if (position.equals("사원")) {
            this.position = "대리";
        } else if (position.equals("대리")) {
            this.position = "과장";
        } else if (position.equals("과장")) {
            this.position = "부장";
        } else {
            this.position = "부장";
        }

    }
}







