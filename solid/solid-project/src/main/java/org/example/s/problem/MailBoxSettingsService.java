package org.example.s.problem;

import org.example.s.solution.Role;
import org.example.s.solution.User;

public class MailBoxSettingsService {

    public void changeSecondaryEmail(User user, String newEmail) {
        if(hasAccess(user)){
            user.setSecondaryEmail(newEmail);
        }

    }

    public boolean hasAccess(User user){
        return user.getRole() == Role.ADMIN;
    }





}
