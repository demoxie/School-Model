package StaffServices;

import com.company.Applicant;
import com.company.Subject;
import enums.TypeOfStaff;

import java.util.TreeMap;

public interface PrincipalServices {
    TypeOfStaff role = TypeOfStaff.PRINCIPAL;
    void expelStudent(String studentID);
    void admitStudent(Applicant applicant);
    void viewStudentProfile(String studentID);
    void viewStudentList();

}
