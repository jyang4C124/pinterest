import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.util.RandomGenerator;

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

    public ConcentricCircles(double frameSize, double setSize) {

        radius6 = setSize*.85;
        radius5 = setSize*(.85 - .15);
        radius4 = setSize*(.85 - .25);
        radius3 = setSize*(.85 - .35);
        radius2 = setSize*(.85 - .45);
        radius1 = setSize*(.85 - .55);

        //should auto center the circles based on the frameSize
        GOval circ6 = new GOval((frameSize - radius6)/2, (frameSize- radius6)/2, radius6, radius6);
        GOval circ5 = new GOval((frameSize - radius5)/2 ,(frameSize - radius5)/2, radius5, radius5);
        GOval circ4 = new GOval((frameSize - radius4)/2, (frameSize - radius4)/2, radius4, radius4);
        GOval circ3 = new GOval((frameSize - radius3)/2 ,(frameSize - radius3)/2, radius3, radius3);
        GOval circ2 = new GOval((frameSize - radius2)/2, (frameSize - radius2)/2, radius2, radius2);
        GOval circ1 = new GOval((frameSize - radius1)/2 ,(frameSize - radius1)/2, radius1, radius1);

        RandomGenerator rgen = new RandomGenerator();

        Color color = rgen.nextColor();
        circ6.setColor(color);


        color = rgen.nextColor();
        circ5.setColor(color);

        color = rgen.nextColor();
        circ5.setColor(color);

        //color = rgen.nextColor();
        circ4.setColor(Color.black);

        color = rgen.nextColor();
        circ3.setColor(color);

        //color = rgen.nextColor();
        circ2.setColor(color.black);

        color = rgen.nextColor();
        circ1.setColor(color);

        add(circ6);
        add(circ5);
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

/*      GOval circ6 = new GOval((frameSize - radius6)/2 - radius6/2.0, (frameSize- radius6)/2 - radius6/2.0, radius6, radius6);
        GOval circ5 = new GOval((frameSize - radius5)/2 -radius5/2.0,(frameSize - radius5)/2 -radius5/2.0, radius5, radius5);
        GOval circ4 = new GOval((frameSize - radius4)/2 - radius4/2.0, (frameSize - radius4)/2 - radius4/2.0, radius4, radius4);
        GOval circ3 = new GOval((frameSize - radius3)/2 - radius3/2.0,(frameSize - radius3)/2- radius3/2.0, radius3, radius3);
        GOval circ2 = new GOval((frameSize - radius2)/2- radius2/2.0, (frameSize - radius2)/2 - radius2/2.0, radius2, radius2);
        GOval circ1 = new GOval((frameSize - radius1)/2 - radius1/2.0,(frameSize - radius1)/2- radius1/2.0, radius1, radius1);

        This is for super cool rainbow gradient effects
*/
