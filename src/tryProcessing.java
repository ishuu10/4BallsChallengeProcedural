import processing.core.*;

public class tryProcessing extends PApplet {
    int x=0;
    int y=100;
    int x1=0;

    int x2=0;

    int x3=0;
    int xSpeed=1;






   public  void settings() {
        size(1000, 1000);
    }
    public void draw() {

        //background(20);
        ellipse(x,y*1,20,20);
        x =x+1;

        ellipse(x1,y*2,20,20);

        x1 =x1+2;
        ellipse(x2,y*3,20,20);
        x2=x2+3;
        ellipse(x3,y*4,20,20);
        x3=x3+4;






    }








    public static void main(String[] passedargs) {
        String[] appletArgs = new String[]{"tryProcessing"};
        PApplet.main(appletArgs);
    }
}

