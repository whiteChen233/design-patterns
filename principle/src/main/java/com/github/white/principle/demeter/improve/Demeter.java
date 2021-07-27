package com.github.white.principle.demeter.improve;

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
 * <p>
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
 * <p>
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
 * <p>
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

    /**
     * Print.
     */
    public void print() {
        // 提取一个 print 方法用来执行与 CollegeTeacher 有关的逻辑，暴露 print 这个方法给外部使用就好
        this.getAllCollegeTeachers().forEach(i -> GlobalLogger.info("学院老师 id:{}", i.getId()));
    }
}

/**
 * The type School mgr.
 * <p>
 * 学校
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
        cm.print();
        GlobalLogger.info("----------------------------");
        this.getAllTeachers().forEach(i -> GlobalLogger.info("学校老师 id:{}", i.getId()));
    }
}