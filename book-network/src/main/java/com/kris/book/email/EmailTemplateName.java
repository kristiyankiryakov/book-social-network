package com.kris.book.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    Activate_ACCOUNT("activate_account")
;

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
