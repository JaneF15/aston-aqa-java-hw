import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String openingHours, double price) {
        attractions.add(new Attraction(openingHours, price));
    }

    @Override
    public String toString() {
        return "Park{" +
                "attractions=" + attractions +
                '}';
    }

    public class Attraction {

        private String openingHours;
        private double price;

        public Attraction(String openingHours, double price) {
            this.openingHours = openingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "openingHours='" + openingHours + '\'' +
                    ", price=" + price +
                    '}';
        }

    }

}
