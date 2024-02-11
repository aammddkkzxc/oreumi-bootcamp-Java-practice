package _0209Generic;

public class Test {
    public void getCar(Product<? extends Car> product) {
        Car car = product.getItem();
        Avante car2 = product.getItem();
        product.setItem(new Car());
        product.setItem(new Avante());
        product.setItem(new Machine());
    }

    public void setCar(Product<? super Car> product) {
        Car car = product.getItem();
        Object car2 = product.getItem();
        product.setItem(new Car());
        product.setItem(new Avante());
        product.setItem(new Machine());
    }
}
