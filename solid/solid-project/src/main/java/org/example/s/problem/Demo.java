package org.example.s.problem;


import org.example.s.solution.User;

public class Demo {

    public static void main(String[] args) {
        MailBoxSettingsService mailboxSettingsService = new MailBoxSettingsService();
        User user = new User();

        mailboxSettingsService.changeSecondaryEmail(user, "toto@gmail.com");

        if(mailboxSettingsService.hasAccess(user)){
            user.sendMoney(new User(), 1000);
        }

    }
}
