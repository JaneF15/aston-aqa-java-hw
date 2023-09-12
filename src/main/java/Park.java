import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Park{" +
                "attractions=" + attractions +
                '}';
    }

    public class Attraction {

        private String name;
        private String openingHours;
        private double price;

        public Attraction(String name, String openingHours, double price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;

            attractions.add(this);
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", openingHours='" + openingHours + '\'' +
                    ", price=" + price +
                    '}';
        }

    }

}
