import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * Created by jyang4 on 3/7/14.
 */
public class CircleOnRadial extends GCompound {

    public CircleOnRadial(double radius) {
        GOval blackCircle = new GOval(0,0, radius, radius);
        blackCircle.setFilled(true);
        blackCircle.setColor(Color.BLACK);


//        GOval bigCirc = new GOval(x,y, bigSize, bigSize);
//        GOval mediumCirc = new GOval(x + (bigSize - mediumSize)/2 ,x + (bigSize - smallSize)/2, mediumSize, mediumSize);

        GOval colorfulCircle = new GOval( (radius - (radius - 4))/2, (radius - (radius - 4))/2, radius - 4, radius - 4);
        colorfulCircle.setFilled(true);
        colorfulCircle.setColor(Color.GREEN);

        add(blackCircle);
        add(colorfulCircle);
    }
}
