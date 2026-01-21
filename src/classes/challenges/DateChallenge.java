package classes.challenges;

public class DateChallenge {

    public int day;
    public int month;
    public int year;

    public DateChallenge() {
        day = 1;
        month = 1;
        year = 1970;
    }

    public DateChallenge(int initialDay, int initialMonth, int initialYear) {
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    public String formatDateEN() {
        return String.format("%d-%d-%d\n", year, month, day);
    }

    public String formatDateBR() {
        return String.format("%d/%d/%d", day, month, year);
    }

    public void printDateEN() {
        System.out.println(formatDateEN());
    }

    public void printDateBR() {
        System.out.println(formatDateBR());
    }
}
