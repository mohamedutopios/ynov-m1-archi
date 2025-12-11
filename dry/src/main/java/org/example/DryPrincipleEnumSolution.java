package org.example;

public class DryPrincipleEnumSolution {

    public boolean validate(ValidationType type, String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.matches(type.getRegex());
    }

    public static void main(String[] args) {
        DryPrincipleEnumSolution validator = new DryPrincipleEnumSolution();

        System.out.println(validator.validate(ValidationType.EMAIL, "user@example.com"));
        System.out.println(validator.validate(ValidationType.PHONE, "+123456789"));
        System.out.println(validator.validate(ValidationType.USERNAME, "user_test"));
    }
}

