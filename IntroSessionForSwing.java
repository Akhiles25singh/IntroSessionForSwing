/**
 * Created by IntelliJ IDEA.
 * User: Akhilesh2596
 * Date: 11/12/22
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
import javax.swing.*;
public class IntroSessionForSwing {
    JFrame myframe;
    IntroSessionForSwing()
    {
        myframe=new JFrame("Todays Frame");
        JTextArea area=new JTextArea("Welcome to javatpoint Akhilesh");
        area.setBounds(10,30, 200,200);
        myframe.add(area);
        myframe.setSize(800,800);
        myframe.setLayout(null);
        myframe.setVisible(true);
    }
    public static void main(String arg[]){
        IntroSessionForSwing xy=new IntroSessionForSwing();
    }
}
