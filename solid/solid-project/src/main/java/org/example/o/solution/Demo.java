package org.example.o.solution;

import org.example.o.solution.User;
import org.example.o.solution.LoanHandler;

public class Demo {


    public static void main(String[] args) {

        LoanHandler loanHandler = new ImmoLoanHandler(new GageLoanValidator());

        User user = new User();

        loanHandler.approveLoan(user);




    }


}
