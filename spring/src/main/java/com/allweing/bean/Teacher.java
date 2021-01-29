package com.allweing.bean;

/**
 * @auther: zzzgyu
 */

public class Teacher {
    private String className;
    private Integer teacherId;
    private Student student;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "className='" + className + '\'' +
                ", teacherId=" + teacherId +
                ", student=" + student +
                '}';
    }
}
