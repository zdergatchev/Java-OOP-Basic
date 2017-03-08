package ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws Exception {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private double getLength() {
        return this.length;
    }

    private void setLength(double length) throws Exception {
        if (length <= 0) {
            throw new Exception("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private double getWidth() {
        return this.width;
    }

    private void setWidth(double width) throws Exception {
        if (width <= 0) {
            throw new Exception("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private double getHeight() {
        return this.height;
    }

    private void setHeight(double height) throws Exception {
        if (height <= 0) {
            throw new Exception("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double getSurfaceArea() {
        return (2 * this.getLength() * this.getWidth()) +
                (2 * this.getLength() * this.getHeight()) +
                (2 * this.getWidth() * this.getHeight());
    }

    public double getVolume() {
        return this.getHeight() * this.getWidth() * this.getLength();
    }

    public double getLateralSurfaceArea() {
        return (2 * this.getLength() * this.getHeight()) +
                (2 * this.getWidth() * this.getHeight());
    }
}
