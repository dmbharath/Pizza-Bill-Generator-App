public class DeluxePizza extends Pizza
{
    public DeluxePizza(Boolean veg)
    {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }    
    @Override
    public void addExtraCheese()
    {
        System.out.println("Cannot add extra cheese to the Deluxe pizza");
    }
    public void addExtraToppings()
    {
        System.out.println("Cannot add extra toppings to the Deluxe pizza");
    }
}
