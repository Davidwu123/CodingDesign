package com.study.design.pattern.structure.compose;

import com.study.design.common.Log;
import com.study.design.pattern.structure.compose.filesystem.Directory;
import com.study.design.pattern.structure.compose.filesystem.File;
import com.study.design.pattern.structure.compose.oa.Department;
import com.study.design.pattern.structure.compose.oa.Employee;

import java.util.List;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: 组合模式精髓：使用递归来实现部分(文件/员工)和整体(文件夹/部门)的关系/统计数据
 * @date 2020-03-06 22:03
 */
public class TestMain {
    public static void main(String[] args) {
        executeFileSystemTransaction();
        executeHumanResourceTransaction();
    }


    private static void executeHumanResourceTransaction() {
        Department rootDepartment = new Department(0);
        buildOrganization(rootDepartment);//构建部门结构逻辑
        rootDepartment.getTotalSalary();//获取业务参数
    }

    /**
     * 构建部门结构
     * @param department
     */
    private static void buildOrganization(Department department) {
        List<Integer> subDepartmentIds = null;//从组织架构中获取department对应的子部门的id
        for (Integer id : subDepartmentIds) {
            Department subDepartment = new Department(id);
            department.addHumanResource(subDepartment);
            buildOrganization(subDepartment);//构建子部门的架构
        }
        List<Integer> subEmployeeIds = null;//从组织架构中获取department对应的员工的id
        for (Integer subEmployeeId : subEmployeeIds) {
            int salary = 0;//获取该员工的薪资
            Employee employee = new Employee(subEmployeeId, salary);
            department.addHumanResource(employee);
        }
    }


    private static void executeFileSystemTransaction() {
        /**
         * 手动构建文件结构
         * /sdcard/test/
         * /sdcard/test/1.txt
         * /sdcard/test/2.txt
         * /sdcard/test/app
         * /sdcard/test/app/3.txt
         */
        Directory rootDirectory = new Directory("/sdcard/test");
        rootDirectory.addFileSystemNode(new File("/sdcard/test/1.txt"))
                .addFileSystemNode(new File("/sdcard/test/2.txt"));
        Directory testDirectory = new Directory("/sdcard/test/app");
        testDirectory.addFileSystemNode(new File("/sdcard/test/app/3.txt"));
        rootDirectory.addFileSystemNode(testDirectory);

        Log.d(TestMain.class, "总文件个数： " + rootDirectory.getFileCount());
        Log.d(TestMain.class, "总文件大小： " + rootDirectory.getFileSize());
    }
}
