package Prototype_2_Class;

class blackColor extends Color{
    public blackColor() {
        this.colorName = "black";
    }
    @Override
    void addColor() {
        System.out.println("Black color added");
    }
}
