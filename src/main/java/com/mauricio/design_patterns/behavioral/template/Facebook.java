package com.mauricio.design_patterns.behavioral.template;

public class Facebook extends SocialNetworkTemplate{

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    protected void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }

    @Override
    protected boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }
}
