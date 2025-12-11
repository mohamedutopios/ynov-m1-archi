package org.example;

public enum ValidationType {
    EMAIL("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"),
    PHONE("^^\\+?[0-9. ()-]{7,25}$"),
    USERNAME("^[a-zA-Z0-9._-]{3,}$");

    private final String regex;

    ValidationType(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }
}

