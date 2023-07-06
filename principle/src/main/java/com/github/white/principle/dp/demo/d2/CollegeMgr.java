package com.github.white.principle.dp.demo.d2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.white.log.GlobalLogger;
import com.github.white.principle.dp.demo.entity.CollegeTeacher;

/**
 * @author White
 */
public class CollegeMgr {
    public List<CollegeTeacher> getAllCollegeTeachers() {
        return IntStream.range(1, 10).mapToObj(CollegeTeacher::new).collect(Collectors.toList());
    }

    public void print() {
        // 提取一个 print 方法用来执行与 CollegeTeacher 有关的逻辑，暴露 print 这个方法给外部使用就好
        this.getAllCollegeTeachers().forEach(i -> GlobalLogger.info("学院老师 id:{}", i.getId()));
    }
}
