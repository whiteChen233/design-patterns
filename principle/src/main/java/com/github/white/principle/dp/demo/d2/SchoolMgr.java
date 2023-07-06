package com.github.white.principle.dp.demo.d2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.white.log.GlobalLogger;
import com.github.white.principle.dp.demo.entity.Teacher;

/**
 * @author White
 */
public class SchoolMgr {
    public List<Teacher> getAllTeachers() {
        return IntStream.range(1, 10).mapToObj(Teacher::new).collect(Collectors.toList());
    }

    public void print(CollegeMgr cm) {
        cm.print();
        GlobalLogger.info("----------------------------");
        this.getAllTeachers().forEach(i -> GlobalLogger.info("学校老师 id:{}", i.getId()));
    }
}
