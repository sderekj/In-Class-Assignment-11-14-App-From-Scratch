package nyc.c4q.dereksantos.in_class_assignment_11_14;


import java.util.List;

public class ColorPojo {
    private List<ColorPalette> colorPalette;
    private Display display;

    public List<ColorPalette> getColorPalette ()
    {
        return colorPalette;
    }

    public void setColorPalette (List<ColorPalette> colorPalette)
    {
        this.colorPalette = colorPalette;
    }

    public Display getDisplay ()
    {
        return display;
    }

    public void setDisplay (Display display)
    {
        this.display = display;
    }

}
