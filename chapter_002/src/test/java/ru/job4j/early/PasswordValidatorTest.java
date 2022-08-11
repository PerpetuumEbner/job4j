package ru.job4j.early;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PasswordValidatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordIsEmpty() {
        PasswordValidator.validate(null);
    }

    @Test()
    public void whenPasswordLengthLessThanEightCharacters() {
        assertThat(PasswordValidator.validate("Xa4|#~C"),
                is("Пароль должен быть от 8 до 32 символов включительно."));
    }

    @Test()
    public void whenPasswordMustContainUppercaseCharacters() {
        assertThat(PasswordValidator.validate("|zpwm@2ga}"),
                is("Пароль должен содержать символы верхнего регистра."));
    }

    @Test()
    public void whenPasswordMustContainLowercaseCharacters() {
        assertThat(PasswordValidator.validate("E4{JEA0~Y"),
                is("Пароль должен содержать символы нижнего регистра."));
    }

    @Test()
    public void whenPasswordMustContainSpecialCharacters() {
        assertThat(PasswordValidator.validate("eP0yOw0if"),
                is("Пароль должен содержать спецсимволы."));
    }

    @Test()
    public void whenPasswordNotSimple() {
        assertThat(PasswordValidator.validate("qwerty"),
                is("Пароль не должен быть простым."));
        assertThat(PasswordValidator.validate("12345"),
                is("Пароль не должен быть простым."));
        assertThat(PasswordValidator.validate("password"),
                is("Пароль не должен быть простым."));
        assertThat(PasswordValidator.validate("admin"),
                is("Пароль не должен быть простым."));
        assertThat(PasswordValidator.validate("user"),
                is("Пароль не должен быть простым."));
    }

    @Test
    public void whenPasswordAccepted() {
        assertThat(PasswordValidator.validate("~Yon9O%jAMF"),
                is("Пароль соответствует требованиям."));
    }
}