import java.util.List;



public class Main {

    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();
        print(cities);
    }

        public static void print(List<City> cities) {
            cities.forEach(System.out::println);
        }

}