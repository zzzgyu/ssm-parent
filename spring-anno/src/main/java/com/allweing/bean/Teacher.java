package com.allweing.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther: zzzgyu
 */
@Component
public class Teacher {
    @Value("Math")
    private String className;
    @Value("002")
    private Integer teacherId;
    @Autowired
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
