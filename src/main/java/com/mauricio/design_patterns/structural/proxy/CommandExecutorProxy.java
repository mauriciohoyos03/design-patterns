package com.mauricio.design_patterns.structural.proxy;

/*
    Proxy design pattern is used when we want to provide controlled access of a functionality.

    Let’s say we have a class that can run some command on the system. Now if we are using it,
    its fine but if we want to give this program to a client application, it can have severe
    issues because client program can issue command to delete some system
    files or change some settings that you don’t want.
*/
public class CommandExecutorProxy implements CommandExecutor{

    private boolean isAdmin;
    private final CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String pass) {
        if (user.equals("Admin") && pass.equals("123456")) isAdmin = true;
        commandExecutor = new CommandExecutorImp();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                commandExecutor.runCommand(cmd);
            }
        }
    }
}
