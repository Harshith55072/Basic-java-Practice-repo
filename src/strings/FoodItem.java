

public class FoodItem {

    //varaible
    String name;
    double price;
    String category;

    //method

    void displayDetails()
    {
        System.out.println("Food Name :"+ name);
        System.out.println("Price :"+price);
        System.out.println("Category :"+category);
        System.out.println("---");
    }

    public static void main(String[] args) {
        FoodItem fooditem1=new FoodItem();
        fooditem1.name="Burger";
        fooditem1.price=299.99;
        fooditem1.category="Fast Food";

        fooditem1.displayDetails();

        FoodItem fooditem2=new FoodItem();
        fooditem2.name="Briyanni";
        fooditem2.price=399.99;
        fooditem2.category="Rice";

        fooditem2.displayDetails();

    }

}
