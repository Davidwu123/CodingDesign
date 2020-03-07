package com.study.design.pattern.structure.compose.oa;

/**
 * @author wuwei
 * @title: AbsDepartment
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-07 20:05
 */
public abstract class AbsHumanResource {
    protected int departmentId;

    public AbsHumanResource(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public abstract int getTotalSalary();
}
