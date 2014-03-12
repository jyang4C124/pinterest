import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * This class is really weird.
 * Created by jenweil on 3/12/14.
 */
public class GradientSpiral extends GCompound {

    private double radius6;
    private double radius5;
    private double radius4;
    private double radius3;
    private double radius2;
    private double radius1;

    public GradientSpiral(double offsetSize, double setSize) {

        radius6 = setSize*.85;
        radius5 = setSize*(.85 - .15);
        radius4 = setSize*(.85 - .25);
        radius3 = setSize*(.85 - .35);
        radius2 = setSize*(.85 - .45);
        radius1 = setSize*(.85 - .55);

        //should auto center the circles based on the frameSize


        GOval circ6 = new GOval((offsetSize - radius6)/2 - radius6/2.0, (offsetSize- radius6)/2 - radius6/2.0, radius6, radius6);
        GOval circ5 = new GOval((offsetSize - radius5)/2 -radius5/2.0,(offsetSize - radius5)/2 -radius5/2.0, radius5, radius5);
        GOval circ4 = new GOval((offsetSize - radius4)/2 - radius4/2.0, (offsetSize - radius4)/2 - radius4/2.0, radius4, radius4);
        GOval circ3 = new GOval((offsetSize - radius3)/2 - radius3/2.0,(offsetSize - radius3)/2- radius3/2.0, radius3, radius3);
        GOval circ2 = new GOval((offsetSize - radius2)/2- radius2/2.0, (offsetSize - radius2)/2 - radius2/2.0, radius2, radius2);
        GOval circ1 = new GOval((offsetSize - radius1)/2 - radius1/2.0,(offsetSize - radius1)/2- radius1/2.0, radius1, radius1);

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



