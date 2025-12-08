package org.example.s.solution;


import org.example.s.problem.MailBoxSettingsService;

public class Demo {

    public static void main(String[] args) {

        MailBoxSettingsService mailboxSettingsService = new MailBoxSettingsService();
        User user = new User();

        mailboxSettingsService.changeSecondaryEmail(user, "toto@gmail.com");

        SecurityService securityService = new SecurityService();
        if(securityService.hasAccess(user)){
            user.sendMoney(new User(), 1000);
        }

    }
}
