package com.study.design.pattern.structure.compose.oa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: Department
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-07 20:08
 */
public class Department extends AbsHumanResource {
    private List<AbsHumanResource> list = new ArrayList<>();


    public Department(int departmentId) {
        super(departmentId);
    }

    @Override
    public int getTotalSalary() {
        int totalSalary = 0;
        for (AbsHumanResource department : list) {
            totalSalary += department.getTotalSalary();
        }
        return totalSalary;
    }

    public void addHumanResource(AbsHumanResource humanResource) {
        list.add(humanResource);
    }
}
