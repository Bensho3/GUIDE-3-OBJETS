public class Circle {
    public Float radio = 1.0F;

    public String color = "Red";

    public Float area;

    public Circle()
    {
    }

    public Circle(Float radio, String color, Float area) {
        this.radio = radio;
        this.color = color;
        this.area = area;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float calculeArea()
    {
        area= 3.1415F * (radio*2);
        return area;
    }

    public void showCircle()
    {
        System.out.printf("Showing Circle\nColor:[%s] ,Radio:[%.1f]\nArea:[%.1f]", color,radio,area);
    }

}
