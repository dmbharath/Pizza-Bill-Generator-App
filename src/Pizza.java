public class Pizza
{
    private double price;
    @SuppressWarnings("unused")
    private boolean veg;
    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 100;
    private final int backPackPrice = 20;
    private double basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;
    public Pizza(boolean veg)
    {
        this.veg = veg;
        this.price = veg ? 300.0 : 400.0;
        this.basePizzaPrice = this.price; 
        System.out.println("Base Pizza price : "+basePizzaPrice);
    }
    public void addExtraCheese()
    {
        if(!isExtraCheeseAdded)
        {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice; 
        }
        else 
        {
            System.out.println("Extra cheese already added...");
        }
    }
    public void addExtraToppings()
    {
        if(!isExtraToppingsAdded)
        {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        }
        else
        {
            System.out.println("Extra toppings already added...");
        }
    } 
    public void addTakeAway()
    {
        if(!isOptedTakeAway)
        {
            isOptedTakeAway = true;
            this.price += backPackPrice; 
        }
        else 
        {
            System.out.println("Take away already added...");
        }
    }
    public void getBill()
    {
        StringBuilder bill = new StringBuilder();
        bill .append("Base price : $").append(basePizzaPrice).append("\n");
        if(isExtraCheeseAdded)
        {
            bill.append("Extra Cheese : $").append(extraCheesePrice).append("\n");
        }
        if(isExtraToppingsAdded)
        {
            bill.append("Extra Toppings : $").append(extraToppingsPrice).append("\n");
        }
        if(isOptedTakeAway)
        {
            bill.append("Takeaway : $").append(backPackPrice).append("\n");
        }
        bill.append("Total Bill : $").append(this.price).append("\n");
        System.out.println(bill.toString()); 
    } 
    public double getPrice()
    {
        return this.price;
    }
    public double getBasePizzaPrice() 
    {
        return this.basePizzaPrice;
    }
    
    public boolean isExtraCheeseAdded() 
    {
        return this.isExtraCheeseAdded;
    }
    
    public int getExtraCheesePrice() 
    {
        return this.extraCheesePrice;
    }
    
    public boolean isExtraToppingsAdded() 
    {
        return this.isExtraToppingsAdded;
    }
    
    public int getExtraToppingsPrice() 
    {
        return this.extraToppingsPrice;
    }
    
    public boolean isOptedTakeAway() 
    {
        return this.isOptedTakeAway;
    }
    
    public int getBackPackPrice() 
    {
        return this.backPackPrice;
    }
    
}