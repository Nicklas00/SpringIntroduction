package com.example.springintroduction.services;

import java.time.LocalDate;

public class DateCalc {

  public int erDetFredag() {
    LocalDate date = LocalDate.now();
    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();

    int q = day;
    int m = month;
    int j = year / 100;
    int k = year % 100;
    int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
    int d = ((h + 5) % 7) + 1;

    return d;
  }
}
