package com.github.white.responsibility;

import com.github.white.log.GlobalLogger;

public class TeamLeader extends Handler {

    public TeamLeader() {
        super(Handler.TEAM_LEADER);
    }

    @Override
    void process(LeaveForm leaveForm) {
        GlobalLogger.info("{}批准了{}的请假", this.getClass().getSimpleName(), leaveForm.getName());
    }
}
