package Wrappers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private LocalDate date;

    public Date(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.date = LocalDate.parse(date,formatter);
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
