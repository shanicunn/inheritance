//1. Write a class with the name Rectangle. The class needs two fields (instance variable) with
// names width and length both of type double.The class needs to have one constructor with
// parameters width and length both of type double and it needs to initialize the fields.
//

public class Rectangle {
    double width;
    double length;
    double area;

    public Rectangle(double width, double length) {
        //        In case the width parameter is less than 0 it needs to set the width field value to 0.
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        //        In case the length parameter is less than 0 it needs to set the length field value to 0.
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

    }
    //        Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth() {
        return width;
    }
    //        Method named getLength without any parameters, it needs to return the value of length field.
    public double getLength() {
        return length;
    }
    //        Method named getArea without any parameters, it needs to return the calculated area (width * length).
    public double getArea() {
        area = (width * length);
        return area;
    }
}

