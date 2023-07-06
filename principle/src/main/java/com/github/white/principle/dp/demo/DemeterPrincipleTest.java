package com.github.white.principle.dp.demo;

import com.github.white.principle.dp.demo.d1.OldCollegeMgr;
import com.github.white.principle.dp.demo.d1.OldSchoolMgr;
import com.github.white.principle.dp.demo.d2.CollegeMgr;
import com.github.white.principle.dp.demo.d2.SchoolMgr;

/**
 * @author White
 */
public class DemeterPrincipleTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        OldSchoolMgr schoolMgr = new OldSchoolMgr();
        schoolMgr.print(new OldCollegeMgr());
    }

    private static void test2() {
        SchoolMgr schoolMgr = new SchoolMgr();
        schoolMgr.print(new CollegeMgr());
    }
}

