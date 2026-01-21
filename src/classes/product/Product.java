package classes.product;

public class Product {

    String name;
    double price;
    double discount;

    Product(String initialName, double initialPrice, double initialDiscount) {
        name = initialName;
        price = initialPrice;
        discount = initialDiscount;
    }

    Product() {

    }

    double priceWithDiscount() {
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount) {
        return price * (1 - discount + managerDiscount);
    }
}
