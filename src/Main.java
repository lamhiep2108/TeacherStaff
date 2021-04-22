import java.util.Scanner;

public class Main {
  static Scanner scanner=new Scanner(System.in);
  static TeacherStaffManagement tm=new TeacherStaffManagement();

    public static void main(String[] args) {
        do {
            System.out.println("-------------");
            System.out.println("1.thêm");
            System.out.println("2. hiển thị các thông tin cá nhân của mỗi cán bộ giáo viên");
            System.out.println("3.lương thực lĩnh");
            System.out.println("4.danh sách những cán bộ có lương thực lĩnh lớn hơn bằng 8 triệu");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    TeacherStaff teacherStaff= tm.getTeacherStaff();
                    tm.add(teacherStaff);
                    break;
                case 2:
                    tm.showOfficers();
                    break;
                case 3:
                    tm.foodField();
                    break;
                case 4:
                    tm.FoodFieldIsOver8Million();
                    break;
            }
        }while (true);
    }
}
