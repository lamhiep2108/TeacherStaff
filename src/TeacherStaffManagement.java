import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherStaffManagement {
    Scanner scanner=new Scanner(System.in);
    List<TeacherStaff>teacherStaffs=new ArrayList<>();
    public TeacherStaff getTeacherStaff(){
        System.out.println("enter name");
        String name=scanner.nextLine();
        System.out.println("enter date of birth");
        String dateOfBirth=scanner.nextLine();
        System.out.println("enter hometown");
        String hometown=scanner.nextLine();
        Officers officers=new Officers(name,dateOfBirth,hometown);
        System.out.println("enter hard salary");
        int hardSalary=Integer.parseInt(scanner.nextLine());
        System.out.println("enter reward");
        int reward=Integer.parseInt(scanner.nextLine());
        System.out.println("enter punish");
        int punish=Integer.parseInt(scanner.nextLine());
        return new TeacherStaff(officers,hardSalary,reward,punish);
    }
    public void add(TeacherStaff teacherStaff){
        teacherStaffs.add(teacherStaff);
    }
    public void showOfficers(){
        for (TeacherStaff teacherStaff:teacherStaffs) {
            System.out.println(teacherStaff.getOfficers().toString());
        }
    }
    public void foodField(){
        System.out.println("enter name");
        String name=scanner.nextLine();
        for (TeacherStaff teacherStaff:teacherStaffs) {
            if (name.equals(teacherStaff.getOfficers().getName())){
                System.out.println("lương thực lĩnh:"+(teacherStaff.getHardSalary()+ teacherStaff.getReward()- teacherStaff.getPunish()));
            }
        }
    }
    public void FoodFieldIsOver8Million(){
        for (TeacherStaff teacherStaff:teacherStaffs) {
            if (teacherStaff.getHardSalary()+ teacherStaff.getReward()- teacherStaff.getPunish()>=8000000){
                System.out.println("SBGV có lương trên 8 trieu là: "+teacherStaff.getOfficers().getName());
            }
        }
    }
}
