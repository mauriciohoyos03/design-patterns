package com.mauricio.design_patterns.structural.proxy;

public class TestProxy {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Invited", "1234");
        CommandExecutor executorAsAdmin = new CommandExecutorProxy("Admin", "123456");
        try {
            executor.runCommand("ls");

            executorAsAdmin.runCommand("rm fileAny.pdf");

            executor.runCommand("rm fileAny.txt");
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
