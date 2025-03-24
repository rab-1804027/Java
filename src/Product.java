public class Product<T,U> {

    T item;
    U unitPrice;

    Product(T item, U unitPrice) {
        this.item = item;
        this.unitPrice = unitPrice;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public void setUnitPrice(U unitPrice) {
        this.unitPrice = unitPrice;
    }
    public T getItem() {
        return item;
    }
    public U getUnitPrice() {
        return unitPrice;
    }
}
