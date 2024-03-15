package com.github.white.principle.dp.demo.d2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.white.principle.dp.demo.entity.Teacher;

import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class SchoolMgr {
    public List<Teacher> getAllTeachers() {
        return IntStream.range(1, 10).mapToObj(Teacher::new).collect(Collectors.toList());
    }

    public void print(CollegeMgr cm) {
        cm.print();
        log.info("----------------------------");
        this.getAllTeachers().forEach(i -> log.info("学校老师 id:{}", i.getId()));
    }
}
