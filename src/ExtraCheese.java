public class ExtraCheese implements PizzaDecorator{

    Pizza pizza;
    public ExtraCheese(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        int cost=pizza.cost();
        return cost+15;
    }
}
