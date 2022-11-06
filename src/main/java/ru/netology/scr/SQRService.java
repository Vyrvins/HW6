package ru.netology.scr;

public class SQRService {
    public int SQR(int min, int max) {
        int countSQR = 0;//счетчик количества чисел, составляющих квадратный корень из диапазона

        for (int i = 10; i < 100; i++) {
            if ((i * i >= min && i * i <= max)) {
                countSQR++;
            }
        }
        return countSQR;
    }
}
