import java.util.ArrayList;
import java.util.List;

public class OrderPizza 
{
    private List<Pizza> pizzas;
    private final int ORDER_DISCOUNT = 30; 

    public OrderPizza() 
    {
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    public void getOrderBill() 
    {
        double total = 0;
        StringBuilder orderBill = new StringBuilder();
        int count = 1;
        for (Pizza pizza : pizzas) 
        {
            orderBill.append("Pizza ").append(count++).append(":\n");
            pizza.getBill();
            total += pizza.getPrice();
        }
        if (pizzas.size() > 2) 
        {
            total -= ORDER_DISCOUNT;
            orderBill.append("Order Discount: $").append(ORDER_DISCOUNT).append("\n");
        }
        orderBill.append("Total Order Price: $").append(total).append("\n");
        System.out.println(orderBill.toString());
    }
}
