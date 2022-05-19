package com.github.white.responsibility;

import com.github.white.log.GlobalLogger;

public class DepartmentManager extends Handler {

    public DepartmentManager() {
        super(Handler.DEPARTMENT_MANAGER);
    }

    @Override
    void process(LeaveForm leaveForm) {
        GlobalLogger.info("{}批准了{}的请假", this.getClass().getSimpleName(), leaveForm.getName());
    }
}
