package com.xinyuan.iBatis.dao;


import com.xinyuan.iBatis.pojo.Student;
import com.xinyuan.iBatis.pojo.StudentFull;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    List<Student> getStudentList();

    //select 5 student
    List<Student> getStudentListMAX5();

    //select  student by id and name
    List<Student> getStudentListByIdAndName(Student student);

    //search student by ID
    Student getStudentById(int ID);

    //insert a student
    void insertStudent(Student student);

    //update student
    void updateStudentById(Student student);

    //delete student
    void deleteStudent(int ID);

    //search by name and number
    List<Student> getStudentByNaneAndNumber(Map<String, Object> map);

    //search like
    List<Student> getStudentByLike(String value);

    StudentFull getStudentByIdWithScore(int id);


}
