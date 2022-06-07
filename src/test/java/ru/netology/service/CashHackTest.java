package ru.netology.service;

import org.junit.Test;

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
}