package ru.job4j.early;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PasswordValidatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordIsEmpty() {
        PasswordValidator.validate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordLengthLessThanEightCharacters() {
        PasswordValidator.validate("Xa4|#~C");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordMustContainUppercaseCharacters() {
        PasswordValidator.validate("|zpwm@2ga}");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordMustContainLowercaseCharacters() {
        PasswordValidator.validate("E4{JEA0~Y");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordMustContainSpecialCharacters() {
        PasswordValidator.validate("eP0yOw0if");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordNotSimple() {
        PasswordValidator.validate("qwerty");
        PasswordValidator.validate("12345");
        PasswordValidator.validate("password");
        PasswordValidator.validate("admin");
        PasswordValidator.validate("user");
    }

    @Test
    public void whenPasswordAccepted() {
        assertThat(PasswordValidator.validate("~Yon9O%jAMF"),
                is("Пароль соответствует требованиям."));
    }
}