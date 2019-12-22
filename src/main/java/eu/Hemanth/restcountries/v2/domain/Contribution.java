package eu.Hemanth.restcountries.v2.domain;

public class Contribution {

    private int amount;
    private String token;

    public int getAmount() {
        return amount;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Contribution{" +
                "amount=" + amount +
                '}';
    }
}
