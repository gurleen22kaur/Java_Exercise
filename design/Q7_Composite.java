package com.bootcamp.design_patterns;
import java.util.*;

interface DirectoryEmployees{
    void showDirectoryDetails();
}

class FinanceDepartment implements DirectoryEmployees
{
    private String employeeName;
    private int employeeId;

    public FinanceDepartment(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Finance Department{" +
                "name='" + employeeName + '\'' +
                ", id='" + employeeId + '\'' +
                '}');

    }

    @Override
    public String toString() {
        return "FinanceDepartment{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}

class InformationTechnology implements DirectoryEmployees
{
    private String employeeName;
    private int employeeId;

    public InformationTechnology(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Information Technology Department{" +
                "name='" + employeeName + '\'' +
                ", id='" + employeeId + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "InformationTechnology{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}

class FinanceDirectory implements DirectoryEmployees
{
    List<DirectoryEmployees> financeDirectories=new ArrayList<DirectoryEmployees>();
    @Override
    public void showDirectoryDetails() {
        System.out.println("Finance Department Directory");
        financeDirectories.forEach(e->e.showDirectoryDetails());

    }
}

class ITDirectory implements DirectoryEmployees
{
    List<DirectoryEmployees> itDirectories=new ArrayList<DirectoryEmployees>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("IT Department Directory");
        itDirectories.forEach(e->e.showDirectoryDetails());
    }
}
class CompanyDirectories implements DirectoryEmployees{

    List<DirectoryEmployees> companyDirectories = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectories.forEach(e->e.showDirectoryDetails());
    }
}
public class Q7_Composite {

    public static void main(String[] args) {
        FinanceDepartment f1=new FinanceDepartment("John",101);
        FinanceDepartment f2=new FinanceDepartment("Sam",102);

        InformationTechnology i1=new InformationTechnology("Tim",1001);
        InformationTechnology i2=new InformationTechnology("Dev",1002);

        FinanceDirectory financeDirectory=new FinanceDirectory();
        financeDirectory.financeDirectories.add(f1);
        financeDirectory.financeDirectories.add(f2);

        ITDirectory itDirectory=new ITDirectory();
        itDirectory.itDirectories.add(i1);
        itDirectory.itDirectories.add(i2);

        CompanyDirectories companyDirectories=new CompanyDirectories();
        companyDirectories.companyDirectories.add(financeDirectory);
        companyDirectories.companyDirectories.add(itDirectory);

        companyDirectories.showDirectoryDetails();
    }
}
