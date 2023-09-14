import java.awt.*;
import java.awt.Event;

public class AEvent extends Frame implements actionListener
{
aEvent()
{
Button b=new Button("Ok");
TextField tf=new TextField();
b.setbounds(100,100,200,200);
b.addActionListener(this);
add(b);
add(tf);
setSize(400,400);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome to gpp");
}

public static void main(String[] args)
{
new aEvent();
}
}