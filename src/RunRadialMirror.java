import acm.graphics.GOval;
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

        //this variable is used to tell how closely to place bricks next to each other
        double meanLength = (3 + frameSize/20.0)/1.5;

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



//        RectangleOnRadial rectangleOnRadial = new RectangleOnRadial(45);
//        add(rectangleOnRadial);

//        RotatedRectangle rotatedRectangle = new RotatedRectangle(45,0);
//        add(rotatedRectangle,45*Brick.GOLDEN_RATIO/2.0, 45);

        ConcentricCircles concentricCircles = new ConcentricCircles(frameSize);
        add(concentricCircles);
        double[] radiusArray = concentricCircles.getRadiusArray();

        //Weird thing I am doing
        for (int n = 0; n < 100; n +=5) {
            ConcentricCircles concentricCirclesWeird = new ConcentricCircles(frameSize - 75 + n);
            add(concentricCirclesWeird);
        }



        //Specifying colors for geometric objects
        Color beige = new Color(250,235,215);
        Color darkGreen = new Color(0,100,0);
        Color lighterGreen = new Color(143,188,143);
        Color darkOliveGreen = new Color(85,107,47);


        //note there are 12 geometric shapes in each of the large concentric circles so k should be 360/12 = 30.
        //the for loops below generate geometric shapes for each concentric circle

        //the smallest circles in radius6 (largest)
        int i = 0;
        CircleOnRadial circleOnRadial;
        for(int m = 0; m < 360; m += 30) {

            if (i%3 == 0) {
                circleOnRadial = new CircleOnRadial(19, beige); //specifying size and type of geometric object placed on the large concentric circle
            } else if (i%3 == 1) {
                circleOnRadial = new CircleOnRadial(19, lighterGreen); //specifying size and type of geometric object placed on the large concentric circle
            } else {
                circleOnRadial = new CircleOnRadial(19, darkGreen); //specifying size and type of geometric object placed on the large concentric circle
            }


            double onThisRadius = radiusArray[5]; //radius 6, since index starts at 0
            double radians = m*Math.PI/180 - 45; //minus 45 to shift degrees to left
            double xCoord = onThisRadius*Math.cos(radians); //get x coordinate through polar form r*theta
            double yCoord = onThisRadius*Math.sin(radians); //get y coordinate through polar form r*theta
            add(circleOnRadial, (frameSize - xCoord)/2 - 19/2.0, (frameSize - yCoord)/2 - 19/2.0); //(frameSize - Coord)/2 is used to center the circle. Then subtract the size/2 to center the center of the circle on the frame circle.
            i+=1;
        }

        //the small rectangles in radius 5 //wth happened
        int rotationAngle = 10;
        for(int m = 0; m < 360; m += 30) {
            RotatedRectangle rotatedRectangle = new RotatedRectangle(15, rotationAngle, darkOliveGreen);
            double onThisRadius = radiusArray[4];
            double radians = m*Math.PI/180 - 15;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(rotatedRectangle, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
            rotationAngle -= 30;
        }

        //medium sized circles on radius4
        for(int m = 0; m < 360; m += 30) {
            if (i%3 == 1) {
                circleOnRadial = new CircleOnRadial(25,beige);
            } else if (i%3 == 0) {
                circleOnRadial = new CircleOnRadial(25,lighterGreen);
            } else {
                circleOnRadial= new CircleOnRadial(25, darkGreen);
            }

            double onThisRadius = radiusArray[3];
            double radians = m*Math.PI/180 + 15;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2 - 25/2.0, (frameSize - yCoord)/2 - 25/2.0);
            i += 1;
        }
        //largest rectangles
        rotationAngle = 10;
        for(int m = 0; m < 360; m += 30) {
            RotatedRectangle rotatedRectangle = new RotatedRectangle(20, rotationAngle, darkOliveGreen);
            double onThisRadius = radiusArray[2];
            double radians = m*Math.PI/180 + 45;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(rotatedRectangle, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
            rotationAngle -= 30;
        }

        //largest circles on radius2
        for(int m = 0; m < 360; m += 30) {
            if (i%3 == 0) {
                circleOnRadial = new CircleOnRadial(31,beige);
            } else if (i%3 == 1) {
                circleOnRadial= new CircleOnRadial(31, darkGreen);
            } else {
                circleOnRadial = new CircleOnRadial(31,lighterGreen);
            }
            double onThisRadius = radiusArray[1];
            double radians = m*Math.PI/180 + 75;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(circleOnRadial, (frameSize - xCoord)/2 - 31/2.0, (frameSize - yCoord)/2 - 31/2.0);
            i += 1;
        }

        //inner radius of rectangles
        rotationAngle = 10;
        for(int m = 0; m < 360; m += 30) {
            RotatedRectangle rotatedRectangle = new RotatedRectangle(15, rotationAngle, darkOliveGreen);
            double onThisRadius = radiusArray[0];
            double radians = m*Math.PI/180 + 105;
            double xCoord = onThisRadius*Math.cos(radians);
            double yCoord = onThisRadius*Math.sin(radians);
            add(rotatedRectangle, (frameSize - xCoord)/2, (frameSize - yCoord)/2);
            rotationAngle -= 30;
        }

        //add center mirror
        int m = 0;
        Color transparentWhite = new Color(255,255,255,200);
        for (m = 0; m < 360*100; m+= 5) {
            double mirrorRadius = radiusArray[0] - 15 - 2*m;
            GOval centerCircle = new GOval(mirrorRadius, mirrorRadius);
            centerCircle.setFilled(true);
            centerCircle.setColor(transparentWhite);
            transparentWhite = new Color(255,255,255, (20+(4*m)/5)%255);
            add(centerCircle, (frameSize - mirrorRadius)/2 , (frameSize - mirrorRadius)/2);
        }



    }
}
