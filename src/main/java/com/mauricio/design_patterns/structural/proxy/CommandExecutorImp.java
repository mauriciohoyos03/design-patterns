package com.mauricio.design_patterns.structural.proxy;

public class CommandExecutorImp implements CommandExecutor{

    @Override
    public void runCommand(String cmd) throws Exception {
        //Some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println(cmd + " Command executed.");
    }
}
