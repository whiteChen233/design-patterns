package com.github.white.principle.dp.demo.d1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.white.principle.dp.demo.entity.Teacher;

import lombok.extern.slf4j.Slf4j;

/**
 * 直接朋友： [Teacher、CollegeMgr], CollegeTeacher 不是 SchoolMgr 的直接朋友，违反迪米特法则
 *
 * @author White
 */
@Slf4j
public class OldSchoolMgr {

    public List<Teacher> getAllTeachers() {
        return IntStream.range(1, 10).mapToObj(Teacher::new).collect(Collectors.toList());
    }

    public void print(OldCollegeMgr cm) {
        // CollegeTeacher 以局部变量出现在 SchoolMgr 类中，违反了迪米特法则
        cm.getAllCollegeTeachers().forEach(i -> log.info("学院老师 id:{}", i.getId()));
        log.info("----------------------------");
        this.getAllTeachers().forEach(i -> log.info("学校老师 id:{}", i.getId()));
    }
}
