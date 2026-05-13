public class WeatherChecker {

    public static void main(String[] args) {

        boolean isSunny = false;
        double temp = 60;

        if (temp <= 80 && temp >= 70 && isSunny) {

            System.out.println("The weather is good");
            System.out.println("The weather is beautiful");

        } else if (temp <= 80 && temp >= 70 && !isSunny) {

            System.out.println("The weather is good");
            System.out.println("And cloudy");

        } else if (temp >= 30 || temp <= 60 && !isSunny) {

            System.out.println("The weather is cold");
            System.out.println("And cloudy");
        }
    }
}