package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;


public class CashHackTest {
    CashHack service = new CashHack();

    @Test
    public void shouldAmountLessThan1000() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMoreThan1000() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldAmountLessThan1000Jupiter() {
        int actual = service.remain(900);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldAmountMoreThan1000Jupiter() {
        int actual = service.remain(1100);
        int expected = 900;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldAmount1000Jupiter() {
        int actual = service.remain(1000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}