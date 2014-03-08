import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by jyang4 on 3/7/14.
 */
public class RectangleOnRadial extends GCompound {

    private double length;
    private double width;

    public RectangleOnRadial(int width) {
        this.length = width*Brick.GOLDEN_RATIO;
        this.width = width;

        GRect blackSquare = new GRect(0,0, length, width);
        blackSquare.setFilled(true);
        blackSquare.setColor(Color.BLACK);


//        GOval bigCirc = new GOval(x,y, bigSize, bigSize);
//        GOval mediumCirc = new GOval(x + (bigSize - mediumSize)/2 ,x + (bigSize - smallSize)/2, mediumSize, mediumSize);

        GRect colorfulSquare = new GRect( (width - (width - 4))/2, (width - (width - 4))/2, length - 4, width - 4);
        colorfulSquare.setFilled(true);
        colorfulSquare.setColor(Color.GREEN);

        add(blackSquare);
        add(colorfulSquare);

    }





}
