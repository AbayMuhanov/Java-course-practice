package Interface;

import Interface.Drawable;
import Interface.Eatable;

public interface Element extends Drawable, Eatable {

    int sum();

    void run();
}
