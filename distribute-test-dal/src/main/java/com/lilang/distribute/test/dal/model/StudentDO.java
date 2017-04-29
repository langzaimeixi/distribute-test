package com.lilang.distribute.test.dal.model;

import java.util.Date;

public class StudentDO {
    private String studentId;

    private String studentName;

    private String studentSex;

    private Date studentBirthday;

    public StudentDO(String studentId, String studentName, String studentSex, Date studentBirthday) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentBirthday = studentBirthday;
    }

    public StudentDO() {
        super();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }
}