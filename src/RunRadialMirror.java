import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by jyang4 on 3/7/14.
 */
public class RunRadialMirror extends GraphicsProgram {
    @Override
    public void run() {
        int frameSize = 500;
        setSize(frameSize*2,frameSize); //weird....

        //Making the brick wall
        double totLengthOfBricks = 0; //Length is horizontal of the brick, it is the longest
        double totWidthOfBricks = 0; //Width is the vertical of the brick, it is shorter

        double meanLength = 3 + frameSize/20;

        for (int i = 0; i < frameSize/20; i++) {
            Brick rowBrick = new Brick(frameSize);
            add(rowBrick, totLengthOfBricks,0);
            totLengthOfBricks += rowBrick.getBrickHeight();
            int j = 0;
            totWidthOfBricks = 0;

            for (j = 0; j < frameSize/20; j++) {
                Brick columnBrick = new Brick(frameSize);
                add(columnBrick,i*meanLength,totWidthOfBricks);
                totWidthOfBricks += columnBrick.getBrickWidth();
            }
        }

        //Making the circles on the radials
        CircleOnRadial circleOnRadial = new CircleOnRadial(105);
        CircleOnRadial circleOnRadial2 = new CircleOnRadial(50);
        add(circleOnRadial);
        add(circleOnRadial2, 60,60);

        RectangleOnRadial rectangleOnRadial = new RectangleOnRadial(45);
        add(rectangleOnRadial);

        ConcentricCircles concentricCircles = new ConcentricCircles(frameSize);
        add(concentricCircles);



//        Rectangle
//        Graphics2D g2d = (Graphics)rectangleOnRadial;
//        Graphics

    }
}
