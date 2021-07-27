class Task08{
    public static void main(String[] args) {
        System.out.println(numberToHourMinute(71));
        System.out.println(numberToHourMinute(133));
    }

    public static String numberToHourMinute(int number) {
        int hour = 0;
        int minutes = 0;
        
        while (number > 0) {
            if (number >= 60) {
                number -= 60;
                hour += 1;
            }
            else{
                minutes = number;
                break;
            }
        }
        return pluralSingular(hour, minutes);
    }

    public static String pluralSingular(int hour, int minutes) {
        if (hour > 1 && minutes > 1)
            return String.format("%d hours, %d minutes", hour, minutes);
        if (hour <= 1 && minutes > 1)
            return String.format("%d hour, %d minutes", hour, minutes);
        if (hour > 1 && minutes <= 1)
            return String.format("%d hours, %d minute", hour, minutes);
        return String.format("%d hour, %d minute", hour, minutes);
    }
}
