package ApplicantService;

import com.company.School;

public interface ApplicantService {
    void apply(School school, String studentName, Integer age, String previousClass, String intendedClassForAdmission);
}
