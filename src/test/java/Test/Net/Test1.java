package Test.Net;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class mylistener implements WindowListener
{
Frame f1=new Frame("Demo Frame Title");
public mylistener()
{
f1.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f1.dispose();
}
});
f1.setSize(300,300);
f1.setLayout(null);
f1.setVisible(true);
}
@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}
}
public class Test1 
{

	public static void main(String[] args) 
	{
		new mylistener();
	
	}

}

