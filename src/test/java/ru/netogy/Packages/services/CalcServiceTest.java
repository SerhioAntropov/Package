package ru.netogy.Packages.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalcServiceTest {

    @Test
    void CalculateHolidayCounter() {

        CalcService service = new CalcService();


        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;


        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }


}
