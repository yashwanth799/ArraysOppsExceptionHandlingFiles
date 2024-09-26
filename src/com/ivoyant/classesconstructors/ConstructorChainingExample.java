package com.ivoyant.classesconstructors;

class Company
{
    int employeeCount;
    String companyName;

    Company()
    {
        this(100,"XYZ");
    }
    Company(int employeeCount, String companyName)
    {
        this.employeeCount = employeeCount;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employeeCount=" + employeeCount +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println(company);
    }
}