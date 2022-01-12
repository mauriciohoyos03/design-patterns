package com.mauricio.design_patterns.behavioral.template;

import java.nio.charset.StandardCharsets;

/**
 * Base class of social network.
 */
public abstract class SocialNetworkTemplate {
    String userName;
    String password;

    /**
     * Publish the data to whatever network.
     */
    public final  boolean post (String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            simulateNetworkLatency();
            logOut();
            return result;
        }
        return false;
    }
    //Default implementation
    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    protected abstract void logOut();

    protected abstract boolean sendData(byte[] bytes);

    public abstract boolean logIn(String userName, String password);
}