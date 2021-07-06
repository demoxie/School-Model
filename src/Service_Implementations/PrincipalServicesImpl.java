package Service_Implementations;

import EmailSenderServices.EmailSender;
import Exceptions.BelowTheRequiredException;
import StaffServices.PrincipalServices;
import com.company.Applicant;
import com.company.Departments;
import com.company.Principal;
import com.company.Student;

import java.util.List;

public class PrincipalServicesImpl extends Departments implements PrincipalServices {
    private EmailSender emailSender;
    private Principal principal;

    @Override
    public void expelStudent(Departments departments, String studentID) {

    }

    @Override
    public void admitStudent(Applicant applicant,Departments departments) throws BelowTheRequiredException, InterruptedException {
        if(applicant.getAge()>=15){
            Student newStudent = new Student(departments.getDepartmentName(),applicant.getApplicantName(),applicant.getAge(),applicant.getGender(),applicant.getIntendedClassForAdmission(),applicant.getParentEmail());
            List<Student> list = departments.getListOfStudents();
            list.add(newStudent);
            departments.setListOfStudents(list);
            emailSender.sendEmail(principal.getPrincipalEmailAddress(),applicant.getParentEmail(),"OFFER OF ADMISSION INTO "+applicant.getIntendedClassForAdmission(),"You have been admitted into "+applicant.getIntendedClassForAdmission());
        }else{
            throw new BelowTheRequiredException("You can't be admitted because your age is below our requirement");
        }

    }

    @Override
    public void viewStudentProfile(String studentName,Departments departments) {
        for(Student studentObject:departments.getListOfStudents()){
            if(studentObject.getName().equals(studentName)){
                System.out.println(studentObject);
            }
        }
    }

    @Override
    public List<Student> viewStudentList(Departments departments) {
        //Departments departments = Departments;
        return departments.getListOfStudents();
    }
}
