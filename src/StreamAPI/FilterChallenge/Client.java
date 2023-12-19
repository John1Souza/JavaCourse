package StreamAPI.FilterChallenge;

public class Client {
    final String name;
    final double availableValue;
    final String carTypePreference;
    final String colorPreference;

    public Client(String name, double availableValue, String carTypePreference, String colorPreference) {
        this.name = name;
        this.availableValue = availableValue;
        this.carTypePreference = carTypePreference;
        this.colorPreference = colorPreference;
    }
}
