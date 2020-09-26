package com.company;

public class Main {

    public static void main(String[] args) {

        double sum = 0;
        int epsilon = 1000;
        double k = 0.5;

        double interval = Math.PI - 0;

        for (int i = 1; i <= epsilon; i++)
        {

            double Ydelta = Math.sin(interval / epsilon * i);

            if (Ydelta > k)
            {
                sum += interval / epsilon * k;
            }
            else
            {
                sum += interval / epsilon * Ydelta;
            }

        }
        System.out.println("\n" + "Integral = "+ sum);
    }
}
