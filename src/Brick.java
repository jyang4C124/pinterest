import acm.graphics.GCompound;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

import java.awt.*;


/**
 * Created by jyang4 on 3/7/14.
 */
public class Brick extends GCompound {

    public static final double GOLDEN_RATIO =  (1.0 + java.lang.Math.sqrt(5))/2.0;

    public Brick(int frameSize) {
        RandomGenerator rgen = new RandomGenerator();
        double brickWidth = rgen.nextDouble(3, frameSize/20); //a brick should have a width of at least 20, to at most 1/13th of the frame size
        double n = GOLDEN_RATIO;

        GRect bricky = new GRect(brickWidth*GOLDEN_RATIO, brickWidth);
        bricky.setFilled(true);
        Color color = rgen.nextColor(); //look at RandomGenerator documentation so we can figure out how to get colors from a beige subset of colors
        bricky.setColor(color);
        add(bricky);
    }
}
