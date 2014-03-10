import acm.graphics.GCompound;
import acm.graphics.GPolygon;

import javafx.scene.shape.*;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * Created by John on 3/7/14.
 */
public class RotatedRectangle extends GCompound {

    private double length;
    private double width;

    public RotatedRectangle(double width, double rotation, Color color) {
        this.length = width*Brick.GOLDEN_RATIO;
        this.width = width;

        GPolygon blackRect = new GPolygon();
        blackRect.addVertex(length/2.0, width/2.0);
        blackRect.addEdge(-length, 0);
        blackRect.addEdge(0, -width);
        blackRect.addEdge(length, 0);

        blackRect.setFilled(true);
        blackRect.setColor(Color.black);
        blackRect.rotate(rotation);
        add(blackRect);



        double colorfulLength = length - 4;
        double colorfulWidth = width - 4;
        double colorfulRectXCoord = (length - colorfulLength)/2;
        double colorfulRectYCoord = (width - colorfulWidth)/2;

        GPolygon colorfulRect = new GPolygon();
        colorfulRect.addVertex(colorfulLength/2, colorfulWidth/2);
        colorfulRect.addEdge(-colorfulLength, 0);
        colorfulRect.addEdge(0, -colorfulWidth);
        colorfulRect.addEdge(colorfulLength, 0);

        colorfulRect.setFilled(true);
        colorfulRect.setColor(color);
        colorfulRect.rotate(rotation);
        add(colorfulRect, colorfulRectXCoord, colorfulRectYCoord);
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }


}
