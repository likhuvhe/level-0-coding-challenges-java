class Task07 {
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(fahrenheitToCelsius(86));
    }

    public static double celsiusToFahrenheit(double tempInCelsius) {
        return tempInCelsius * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double tempInFahrenheit) {
        return (tempInFahrenheit - 32) / 1.8;
    }
}
