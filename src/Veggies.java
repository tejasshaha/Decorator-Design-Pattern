public class Veggies implements PizzaDecorator {
    Pizza pizza;
    public Veggies(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost() {
        int cost=pizza.cost();
        return cost+20;
    }
}
