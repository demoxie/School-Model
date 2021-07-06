package StaffServices;

import Exceptions.TryingToTeachTheWrongSubject;
import com.company.Departments;
import com.company.Subject;
import com.company.Teacher;

public interface TeacherService {
    void teachACourse(Subject subject, String subjectName) throws TryingToTeachTheWrongSubject;
}
