import java.applet.Applet;
import java.awt.*;
//xml code
/*<applet code="applet.class" width="520" height="320"></applet>*/
public class applet extends Applet {
    Image img;
    //Intialization
    public void init() {
         img = getImage(getDocumentBase(), "img.png");
    }
    // Rendering Image
    public void paint(Graphics g) {
        g.drawImage(img, 10, 10, 800, 500, this);
    }
}
