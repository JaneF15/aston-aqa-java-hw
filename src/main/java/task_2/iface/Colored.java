package task_2.iface;

import task_2.Color;

public interface Colored {

    Color getBackgroundColor();
    void setBackgroundColor(Color color);

    Color getBorderColor();
    void setBorderColor(Color color);
}
