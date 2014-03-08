import acm.graphics.GCompound;
import acm.graphics.GOval;

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
        double x = frameSize/2.0;
        double y = frameSize/2.0;

        radius6 = frameSize*2.0/3;
        radius5 = frameSize*(2.0/3 - .05);
        radius4 = frameSize*(2.0/3 - .10);
        radius3 = frameSize*(2.0/3 - .15);
        radius2 = frameSize*(2.0/3 - .20);
        radius1 = frameSize*(2.0/3 - .25);

        GOval circ6 = new GOval(x, y, radius6, radius6);
        GOval circ5 = new GOval(x + (radius6 - radius5)/2 ,y + (radius6 - radius5)/2, radius5, radius5);
        GOval circ4 = new GOval(x +(radius6 - radius4)/2, y+ (radius6 - radius4)/2, radius4, radius4);
        GOval circ3 = new GOval(x + (radius6 - radius3)/2 ,y + (radius6 - radius3)/2, radius3, radius3);
        GOval circ2 = new GOval( x + (radius6 - radius2)/2, y + (radius6 - radius2)/2, radius2, radius2);
        GOval circ1 = new GOval(x + (radius6 - radius1)/2 ,y + (radius6 - radius1)/2, radius1, radius1);

        add(circ6);
        add(circ5);
        add(circ4);
        add(circ3);
        add(circ2);
        add(circ1);
    }


}
