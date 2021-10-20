import java.util.Collection;
import java.util.Set;

public class Employee extends UniversityMember {

    private int acctNo;
    private Collection<CourseExecution> courseExecution;

    public Employee() {
    }

    public int getAcctNo() {
        return acctNo;
    }
}
