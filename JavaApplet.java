/*Java Program to Create a Basic Applet*/
import java.applet.*;
import java.awt.*;
public class JavaApplet extends Applet
{
    // public static void main(String []arg)
    {
        public void init()                        //Function to initialize the applet
        {
	      setBackground(Color.white);
	      setLayout(new FlowLayout(FlowLayout.CENTER));
        }
        public void paint(Graphics g)             //Function to draw the string
        {
	       g.drawString("Hello World",100,200);
        }
    }
}
/*
<applet code=Basic_Applet.class width=400 height=400>
</applet>
*/