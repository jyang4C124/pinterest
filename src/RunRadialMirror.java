import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by jyang4 on 3/7/14.
 */
public class RunRadialMirror extends GraphicsProgram {
    @Override
    public void run() {
        int frameSize = 500;
        setSize(frameSize,frameSize*2);

        //Making the brick wall with a for loop
        double totLengthOfBricks = 0; //Length is horizontal of the brick, it is the longest
        double totWidthOfBricks = 0; //Width is the vertical of the brick, it is shorter

        double meanLength = (3 + frameSize/20.0)/1.5; //this variable is used to tell how closely to place bricks next to each other

        for (int i = 0; i < frameSize/15.0; i++) { //how big i gets was arbitrarily chosen, playing around with it is fun
            Brick rowBrick = new Brick(frameSize);
            add(rowBrick, totLengthOfBricks, 0);
            totLengthOfBricks += rowBrick.getBrickHeight();

            int j = 0;
            totWidthOfBricks = 0;

            for (j = 0; j < (frameSize*Brick.GOLDEN_RATIO)/10; j++) { //how big j gets is fun to play with
                Brick columnBrick = new Brick(frameSize);
                add(columnBrick, i*meanLength, totWidthOfBricks);
                totWidthOfBricks += columnBrick.getBrickWidth();
            }
        }

        //Making the circles on the radials
//        CircleOnRadial circleOnRadial = new CircleOnRadial(105);
//        CircleOnRadial circleOnRadial2 = new CircleOnRadial(50);
//        add(circleOnRadial);
//        add(circleOnRadial2, 60,60);

        RectangleOnRadial rectangleOnRadial = new RectangleOnRadial(45);
        add(rectangleOnRadial);

        ConcentricCircles concentricCircles = new ConcentricCircles(frameSize);
        add(concentricCircles);
        double[] radiusArray = concentricCircles.getRadius();

//        for(int k = 0; k < 360; k += 5) {
//            CircleOnRadial circleOnRadial = new CircleOnRadial(10);
//            double yCoord = Math.sqrt(radiusArray[5] - k);
//            add(circleOnRadial, frameSize/2.0 + k,yCoord);
//        }

        for(int m = 0; m < 360; m += 15) {
            CircleOnRadial circleOnRadial = new CircleOnRadial(10);
            double onThisRadius = radiusArray[5];
            double radians = m*Math.PI/180;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
        }
        for(int m = 0; m < 360; m += 15) {
            CircleOnRadial circleOnRadial = new CircleOnRadial(10);
            double onThisRadius = radiusArray[4];
            double radians = m*Math.PI/180;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
        }
        for(int m = 0; m < 360; m += 15) {
            CircleOnRadial circleOnRadial = new CircleOnRadial(10);
            double onThisRadius = radiusArray[3];
            double radians = m*Math.PI/180;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
        }
        for(int m = 0; m < 360; m += 15) {
            CircleOnRadial circleOnRadial = new CircleOnRadial(10);
            double onThisRadius = radiusArray[2];
            double radians = m*Math.PI/180;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
        }
        for(int m = 0; m < 360; m += 15) {
            CircleOnRadial circleOnRadial = new CircleOnRadial(10);
            double onThisRadius = radiusArray[1];
            double radians = m*Math.PI/180;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
        }



    }
}
