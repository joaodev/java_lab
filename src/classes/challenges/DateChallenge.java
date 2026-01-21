package classes.challenges;

public class DateChallenge {

    int day;
    int month;
    int year;

    DateChallenge() {
        day = 1;
        month = 1;
        year = 1970;
    }

    DateChallenge(int initialDay, int initialMonth, int initialYear) {
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    String formatDateEN() {
        return String.format("%d-%d-%d\n", year, month, day);
    }

    String formatDateBR() {
        return String.format("%d/%d/%d", day, month, year);
    }

    void printDateEN() {
        System.out.println(formatDateEN());
    }

    void printDateBR() {
        System.out.println(formatDateBR());
    }
}
