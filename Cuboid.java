// 2. Write a class with the name Cuboid that extends Rectangle class.
// The class needs one field (instance variable) with name height of type double.
// The class needs to have one constructor with three parameters width, length, and height all of type double.
// It needs to call parent constructor and initialize a height field.

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        //        In case the height parameter is less than 0 it needs to set the height field value to 0.
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    //        Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return height;
    }
    //        Method named getVolume without any parameters, it needs to return the calculated volume.
    //        To calculate volume multiply the area with height.
    public double getVolume() {
        return (area * height);
    }
}