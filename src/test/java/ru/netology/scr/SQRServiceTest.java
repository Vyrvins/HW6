package ru.netology.scr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resourses/SQR.csv")
    public void CountSqrInRange(int expected, int min, int max) {
        SQRService service = new SQRService();
        //int expected = 3;
        int actual = service.SQR(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
