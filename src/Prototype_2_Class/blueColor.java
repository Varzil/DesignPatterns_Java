package Prototype_2_Class;

class blueColor extends Color {
    public blueColor() {
        this.colorName = "blue";
    }
    @Override
    void addColor() {
        System.out.println("Blue color added");
    }
}