package org.example.o.solution;

public class ImmoLoanHandler implements LoanHandler {


    private Validator immoValidator;


    public ImmoLoanHandler(Validator immoValidator) {
        this.immoValidator = immoValidator;
    }

    @Override
    public void approveLoan(User user) {
        if(immoValidator.isValid(user)) {}
    }
}
