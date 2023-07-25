package Interface;

import Interface.Drawable;
import Interface.Eatable;

public abstract class Example implements Drawable, Eatable {
    private String title;

    @Override
    public void draw() {
        System.out.println("Рисуем");
    }

    @Override
    public void eat() {
        System.out.println("Кушаем");
    }


}
