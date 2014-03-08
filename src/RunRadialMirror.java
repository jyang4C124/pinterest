import acm.program.GraphicsProgram;

/**
 * Created by jyang4 on 3/7/14.
 */
public class RunRadialMirror extends GraphicsProgram {
    @Override
    public void run() {
        int frameSize = 500;
        setSize(frameSize,frameSize);
        Brick bricky = new Brick(frameSize);
        add(bricky);

    }
}
