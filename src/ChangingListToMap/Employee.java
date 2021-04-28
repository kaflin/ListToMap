package ChangingListToMap;

public class Employee {
    private long empId;
    private String empName;
    private String cmpName;

    public Employee(long empId, String empName, String cmpName) {
        this.empId = empId;
        this.empName = empName;
        this.cmpName = cmpName;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCmpName() {
        return cmpName;
    }

    public void setCmpName(String cmpName) {
        this.cmpName = cmpName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", cmpName='" + cmpName + '\'' +
                '}';
    }
}
