public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ExtraCheese(new BasePizza());
        System.out.println(pizza.cost());

        Pizza pizza1 = new Veggies(new ExtraCheese(new GardenPizza()));
        System.out.println(pizza1.cost());
    }
}
