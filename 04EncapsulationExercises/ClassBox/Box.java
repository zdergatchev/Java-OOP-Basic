package ClassBox;

public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double surfaceArea(){
       double area = 2 * (this.length * this.width) +
               2 * (this.length * this.height) +
               2 * (this.width * this.height);
        return area;
    }

    public Double literalSurfaceArea(){
        double area = (2 * this.length * this.height) +
                2 * (this.width * this.height);
        return area;
    }


    public Double volume(){
       double volume = (this.length * this.width * this.height);
        return volume;
    }
}
