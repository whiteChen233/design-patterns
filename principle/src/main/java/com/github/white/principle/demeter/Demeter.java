package com.github.white.principle.demeter;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.github.white.log.GlobalLogger;

/**
 * The type Demeter.
 */
public class Demeter {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SchoolMgr schoolMgr = new SchoolMgr();
        schoolMgr.print(new CollegeMgr());
    }
}

/**
 * The type Teacher.
 *
 * 学校老师
 */
class Teacher {
    /**
     * The Id.
     */
    private int id;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public Teacher setId(int id) {
        this.id = id;
        return this;
    }
}

/**
 * The type College teacher.
 *
 * 学院老师
 */
class CollegeTeacher {
    /**
     * The Id.
     */
    private int id;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public CollegeTeacher setId(int id) {
        this.id = id;
        return this;
    }
}

/**
 * The type College mgr.
 *
 * 学院
 */
class CollegeMgr {
    /**
     * Gets all college teachers.
     *
     * @return the all college teachers
     */
    public List<CollegeTeacher> getAllCollegeTeachers() {
        return new Random()
            .ints(1, 10).limit(10)
            .mapToObj(i -> new CollegeTeacher().setId(i)).collect(Collectors.toList());
    }
}

/**
 * The type School mgr.
 *
 * 学校
 *
 * 直接朋友： Teacher、CollegeMgr
 * CollegeTeacher 不是 SchoolMgr 的直接朋友，违反迪米特法则
 */
class SchoolMgr {
    /**
     * Gets all teachers.
     *
     * @return the all teachers
     */
    public List<Teacher> getAllTeachers() {
        return new Random()
            .ints(1, 10).limit(10)
            .mapToObj(i -> new Teacher().setId(i)).collect(Collectors.toList());
    }

    /**
     * Print.
     *
     * @param cm the cm
     */
    public void print(CollegeMgr cm) {
        // CollegeTeacher 以局部变量出现在 SchoolMgr 类中，违反了迪米特法则
        cm.getAllCollegeTeachers().forEach(i -> GlobalLogger.info("学院老师 id:{}", i.getId()));
        GlobalLogger.info("----------------------------");
        this.getAllTeachers().forEach(i -> GlobalLogger.info("学校老师 id:{}", i.getId()));
    }
}