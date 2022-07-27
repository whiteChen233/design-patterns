package com.github.white.command;

import com.github.white.log.GlobalLogger;

public class Client {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        GlobalLogger.info("按一下开灯");
        remoteController.onButton(0);
        GlobalLogger.info("按一下关灯");
        remoteController.offButton(0);
        GlobalLogger.info("撤销操作");
        remoteController.undoButton();
    }
}
