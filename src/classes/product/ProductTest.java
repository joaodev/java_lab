package classes.product;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("TV", 2000.32, 0.25);

        var p2 = new Product();
        p2.name = "Smartphone 2";
        p2.price = 500.90;
        p2.discount = 0.29;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice1 = p1.priceWithDiscount(0);
        double finalPrice2 = p2.priceWithDiscount(0.1);
        double averagePrice = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("Average price: $%.2f", averagePrice);
    }
}
