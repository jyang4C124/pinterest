import acm.graphics.GCompound;
import acm.graphics.GOval;

import java.awt.*;

/**
 * Created by John on 3/7/14.
 */
public class ConcentricCircles extends GCompound {

    private double radius6;
    private double radius5;
    private double radius4;
    private double radius3;
    private double radius2;
    private double radius1;

    public ConcentricCircles(double frameSize) {

        radius6 = frameSize*(3.0)/4;
        radius5 = frameSize*((3.0)/4 - .10);
        radius4 = frameSize*((3.0)/4 - .15);
        radius3 = frameSize*((3.0)/4 - .25);
        radius2 = frameSize*((3.0)/4 - .30);
        radius1 = frameSize*((3.0)/4 - .35);

        GOval circ6 = new GOval((frameSize - radius6)/2, (frameSize- radius6)/2, radius6, radius6);
        GOval circ5 = new GOval((frameSize - radius5)/2 ,(frameSize - radius5)/2, radius5, radius5);
        GOval circ4 = new GOval((frameSize - radius4)/2, (frameSize - radius4)/2, radius4, radius4);
        GOval circ3 = new GOval((frameSize - radius3)/2 ,(frameSize - radius3)/2, radius3, radius3);
        GOval circ2 = new GOval((frameSize - radius2)/2, (frameSize - radius2)/2, radius2, radius2);
        GOval circ1 = new GOval((frameSize - radius1)/2 ,(frameSize - radius1)/2, radius1, radius1);

        add(circ6);
        circ5.setColor(Color.blue); add(circ5);
        add(circ4);
        add(circ3);
        add(circ2);
        add(circ1);
    }

    public double[] getRadiusArray(){
        double[] radii = {radius1, radius2, radius3, radius4, radius5, radius6};
        return radii;
    }

}
