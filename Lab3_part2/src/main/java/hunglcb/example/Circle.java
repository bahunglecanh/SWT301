package hunglcb.example;

import java.util.logging.Logger;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    // Missing draw() implementation → compile error
    @Override
    public void draw(){
        Logger logger=Logger.getLogger(Circle.class.getName());
        logger.info("Drawing a circle");
    }
}
