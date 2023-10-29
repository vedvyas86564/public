
enum DAYS {//enum can work as a bridge from business logic and your code
    //enums can have constructors
    //enums mostly used for constants

    MONDAY(1, "Mondays are working days"),
    TUESDAY(2, ""),
    WEDNESDAY(3, ""),
    THURSDAY(4, ""),
    FRIDAY(5, ""),
    SATURDAY(6, ""),
    SUNDAY(7, "");

    private int number;
    private String title;

    DAYS(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static DAYS find(int number) {
        DAYS[] values = DAYS.values();
        for (DAYS day : values) {
            if (day.number == number) {
                return day;
            }
        }
        return null;
    }

    public static String str() {
        DAYS[] values = DAYS.values();
        String str = "DAYS[";
        for (DAYS day : values) {
            str += day.toString() + ",";
        }
        return str += "]";
    }
}

