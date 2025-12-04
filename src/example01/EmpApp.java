package example01;


public class EmpApp {

    static Employee[] employees = new Employee[10];

    static void searchNameAndPromote(String name){
        for (int i = 0; i <employees.length; i++) {
            if (employees[i].getName().equals(name)){
                employees[i].promote();
            }
        }
    }


    public static void main(String[] args) {

        int count = 0;
        int bonus = 0;

        // 1. 더미로 사원을 10명 만든다. (생성자 유형을 다 써보기)
        Employee e1 = new Employee("A", "0101111");
        Employee e2 = new Employee("B", "0102222", "개발팀");
        Employee e3 = new Employee("C", "0103333", "인사팀", 1002, 100, "1002", "사원");
        Employee e4 = new Employee("D", "0104444");
        Employee e5 = new Employee("E", "0105555", "개발팀");
        Employee e6 = new Employee("F", "0106666", "인사팀", 1003, 100, "2002", "대리");
        Employee e7 = new Employee("G", "0107777");
        Employee e8 = new Employee("H", "0108888", "홍보팀");
        Employee e9 = new Employee("I", "0109999", "마게팅", 5, 100, "3002", "과장");
        Employee e10 = new Employee("J", "01010101");

        // 2. 사원 10명을 employees에 담는다. (배열)
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;
        employees[4]=e5;
        employees[5]=e6;
        employees[6]=e7;
        employees[7]=e8;
        employees[8]=e9;
        employees[9]=e10;


        // 3. printInfo 호출 (전체사원)
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();

        }

        // 4. 전체사원의 연봉 출력
        for (int i = 0; i < employees.length; i++) {
            count += employees[i].calcYearSalary();
        }
        System.out.println("전체사원의 연봉 : "+count);

        for (int i = 0; i < employees.length; i++) {
            bonus += employees[i].calcYearSalaryWithBonus();
        }
        System.out.println("전체사원의 연봉 :"+count +" 전체사원의 보너스 : "+bonus);

        // 5. 전체사원의 연봉+보너스 출력
        for (int i = 0; i < employees.length; i++) {
            System.out.println("이름은 : "+employees[i].getName()+" 연봉은 : "+employees[i].calcYearSalary()+" 보너스는 : "+employees[i].calcYearSalaryWithBonus());

        }


        // 7. 특정 사원 승진 시키기 --------------------------
        System.out.println();
        System.out.println("== 김철수 대리 승진 처리 ==");
        System.out.println(e3.getPosition());

        searchNameAndPromote("B"); // 사원번호 1002 승진
        System.out.println(e3.getPosition());


    }

}
