package com.study.design.pattern.structure.compose.oa;

/**
 * @author wuwei
 * @title: Employee
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-07 20:05
 */
public class Employee extends AbsHumanResource {
    private int salary;

    public Employee(int departmentId, int salary) {
        super(departmentId);
        this.salary = salary;
    }

    @Override
    public int getTotalSalary() {
        return salary;
    }
}
