import acm.graphics.GCompound;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

import java.awt.*;


/**
 * Created by jyang4 on 3/7/14.
 */
public class Brick extends GCompound {

    public static final double GOLDEN_RATIO =  (1.0 + java.lang.Math.sqrt(5))/2.0;
    private double brickWidth;
    private double brickHeight;

    public Brick(int frameSize) {
        RandomGenerator rgen = new RandomGenerator();
        brickWidth = rgen.nextDouble(3, frameSize/20); //a brick should have a width of at least 3, to at most 1/20th of the frame size
        brickHeight = brickWidth*GOLDEN_RATIO;

        GRect bricky = new GRect(brickHeight, brickWidth);
        bricky.setFilled(true);
        int r = rgen.nextInt(100,255); //look at RandomGenerator documentation so we can figure out how to get colors from a beige subset of colors
        int g = rgen.nextInt(100,255);
        int b = rgen.nextInt(0, 175);
        Color color = new Color(r,g,b);
        bricky.setColor(color);
        add(bricky);
    }

    public double getBrickWidth(){
        return this.brickWidth;
    }
    public double getBrickHeight(){
        return this.brickHeight;
    }
}
