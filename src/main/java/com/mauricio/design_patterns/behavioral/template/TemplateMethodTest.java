package com.mauricio.design_patterns.behavioral.template;

public class TemplateMethodTest {

    public static void main(String... args) {
        String msg = "Message to publish in social network";

        SocialNetworkTemplate facebookNet = new Facebook("mauro", "1234");
        facebookNet.post(msg);

        SocialNetworkTemplate twitterNet = new Twitter("Mauro", "1242");
        twitterNet.post(msg);
    }
}
