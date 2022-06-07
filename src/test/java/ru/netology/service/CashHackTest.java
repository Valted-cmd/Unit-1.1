package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashHackTest {

        CashHack service = new CashHack();

        @Test
        public void shouldAmountLessThan1000() {
            int actual = service.remain(900);
            int expected = 100;
            assertEquals(actual, expected);
        }

        @Test
        public void shouldAmountMoreThan1000() {
            int actual = service.remain(1100);
            int expected = 900;
            assertEquals(actual, expected);
        }

        @Test
        public void shouldAmount1000() {
            int actual = service.remain(1000);
            int expected = 0;
            assertEquals(actual, expected);
        }
    }
