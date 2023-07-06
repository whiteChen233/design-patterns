package com.github.white.principle.dp.demo.d1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.white.principle.dp.demo.entity.CollegeTeacher;

/**
 * @author White
 */
public class OldCollegeMgr {

    public List<CollegeTeacher> getAllCollegeTeachers() {
        return IntStream.range(1, 10).mapToObj(CollegeTeacher::new).collect(Collectors.toList());
    }
}
