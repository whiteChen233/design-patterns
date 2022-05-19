package com.github.white.responsibility;

public class Client {

    public static void main(String[] args) {
        Handler tl = new TeamLeader();
        Handler pm = new ProjectManager();
        Handler dm = new DepartmentManager();
        tl.setNext(pm);
        pm.setNext(dm);

        LeaveForm lf4 = new LeaveForm("小彩", 11, "出国逛gai");
        LeaveForm lf1 = new LeaveForm("小白", 9, "出门旅游");
        LeaveForm lf2 = new LeaveForm("小黄", 4, "出门相亲");
        LeaveForm lf3 = new LeaveForm("小红", 1, "出门逛gai");

        tl.submit(lf1);
        tl.submit(lf2);
        tl.submit(lf3);
        tl.submit(lf4);
    }
}
