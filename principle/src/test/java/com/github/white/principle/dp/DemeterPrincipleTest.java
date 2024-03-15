package com.github.white.principle.dp;

import org.junit.jupiter.api.Test;

import com.github.white.principle.BasePrincipleTest;
import com.github.white.principle.dp.demo.d1.OldCollegeMgr;
import com.github.white.principle.dp.demo.d1.OldSchoolMgr;
import com.github.white.principle.dp.demo.d2.CollegeMgr;
import com.github.white.principle.dp.demo.d2.SchoolMgr;

/**
 * @author White
 */
class DemeterPrincipleTest implements BasePrincipleTest {

    @Test
    void test1() {
        execute(() -> {
            OldSchoolMgr schoolMgr = new OldSchoolMgr();
            schoolMgr.print(new OldCollegeMgr());
        });
    }

    @Test
    void test2() {
        execute(() -> {
            SchoolMgr schoolMgr = new SchoolMgr();
            schoolMgr.print(new CollegeMgr());
        });
    }
}

