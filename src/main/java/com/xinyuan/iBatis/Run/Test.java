package com.xinyuan.iBatis.Run;

import com.xinyuan.iBatis.dao.StudentDao;
import com.xinyuan.iBatis.pojo.Student;
import com.xinyuan.iBatis.pojo.StudentFull;
import com.xinyuan.iBatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        test8();
    }



    static void test1(){
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取 Mapper
        try {
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> studentList = mapper.getStudentListMAX5();
            for (Student student : studentList) {
                System.out.println(student);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();

        }
    }
    static void test2(){
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取 Mapper
        try {
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            Student student = mapper.getStudentById(1);
            System.out.println(student);

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();

        }
    }
    static void test3(){
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取 Mapper
        try {

            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            mapper.insertStudent(new Student(-1, "admin", -2));
            sqlSession.commit();
            System.out.println("success");

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();

        }
    }
    static void test8(){
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取 Mapper
        try {

            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            StudentFull student = mapper.getStudentByIdWithScore(20);
            System.out.println(student);

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();

        }
    }
}
