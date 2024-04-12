public class Cylindre extends Circle {
    public Float height = 1.0F;
    public Float volume;

    public Cylindre() {
    }

    public Cylindre(Float radio, String color, Float area, Float height, Float volume) {
        super(radio, color, area);
        this.height = height;
        this.volume = volume;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float calculeVolume() {
        volume = 3.141592F * (radio * 2) * height;
        return volume;
    }


    public void showCylindre() {
        System.out.printf("\nShowing Cylindre:\nColor:[%s] ,Radio:[%.1f]\nArea:[%.1f], Height:[%.1f], Volume:[%.1f}\n", color, radio, area, height, volume);
    }

    @Override
    public Float calculeArea()
    {
    //2π×radius×height + 2×areaBase
        area = (2*3.141592F) * super.getRadio() * height + (2*super.calculeArea());
        return area;
    }
}
