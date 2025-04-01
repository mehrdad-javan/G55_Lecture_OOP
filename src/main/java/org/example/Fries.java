package org.example;

public class Fries extends FoodItem {

    private Size size; // S,M,L
    private boolean isSpicy;
    private boolean isSweetPotato;

    public Fries(Size size, boolean isSpicy, boolean isSweetPotato) {
        super(size.getTitle(), size.getPrice());
        this.isSpicy = isSpicy;
        this.size = size;
        this.isSweetPotato = isSweetPotato;
    }

    public Fries() {
        super(Size.M.getTitle(), Size.M.getPrice());
        this.isSpicy = true;
        this.size = Size.M;
        this.isSweetPotato = false;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.2;
    }

    @Override
    public String toString() {
        return "Fries{" +
                ", name=" + getName() +
                ", price=" + getPrice() +
                ", size=" + size +
                ", isSpicy=" + isSpicy +
                ", isSweetPotato=" + isSweetPotato +
                '}';
    }
}
