package StaffServices;

import com.company.Applicant;
import com.company.Departments;
import com.company.Student;
import enums.StaffRoles;

import java.util.List;

public interface PrincipalServices {
    StaffRoles role = StaffRoles.PRINCIPAL;
    void expelStudent(Departments departments,String studentID);
    void admitStudent(Applicant applicant,Departments departments) throws InterruptedException;
    void viewStudentProfile(String studentID,Departments departments);
    List<Student> viewStudentList(Departments departments);

}
