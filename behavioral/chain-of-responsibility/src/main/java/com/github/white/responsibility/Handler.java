package com.github.white.responsibility;

import java.util.Objects;

import com.github.white.log.GlobalLogger;

public abstract class Handler {

    public static final int TEAM_LEADER = 1;
    public static final int PROJECT_MANAGER = 5;
    public static final int DEPARTMENT_MANAGER = 10;

    private final int days;

    private Handler next;

    protected Handler(int days) {
        this.days = days;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public final void submit(LeaveForm leaveForm) {
        if (this.days >= leaveForm.getDays()) {
            GlobalLogger.info("{}因为{}请假{}天", leaveForm.getName(), leaveForm.getContent(), leaveForm.getDays());
            this.process(leaveForm);
        } else {
            if (Objects.nonNull(next)) {
                next.submit(leaveForm);
            } else {
                GlobalLogger.info("{}请假{}天的申请无人处理", leaveForm.getName(), leaveForm.getDays());
            }
        }
    }

    abstract void process(LeaveForm leaveForm);
}
