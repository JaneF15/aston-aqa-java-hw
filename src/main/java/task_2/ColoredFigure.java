package task_2;

import task_2.iface.Colored;

public class ColoredFigure implements Colored {

    private Color backgroundColor;
    private Color borderColor;

    public ColoredFigure() {
        this.backgroundColor = Color.WHITE;
        this.borderColor = Color.BLACK;
    }

    public ColoredFigure(Color backgroundColor, Color borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }

    @Override
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}
