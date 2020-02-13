import java.util.ArrayList;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
public class ComponentFActory implements ComponentService
{
	

	public  ArrayList<TextField> creaText(int n,int width,int hight)
	{

			ArrayList<TextField> t = new ArrayList<TextField>();

			for (int i=0;i<n ;i++ ) {
				
				t.add(new TextField());

			}
			for (int i=0;i<t.size() ;i++ ) {
				
				t.get(i).setSize(width,hight);
			}

			return t;
	}

	public ArrayList<Button> creaButton(int n,int width,int hight,ActionListener a)
	{
		ArrayList<Button> b=new ArrayList<Button>();

		for (int i=0;i<n ; i++) {
			
			b.add(new Button());
			b.get(i).setSize(width,hight);
			b.get(i).addActionListener(a);
		}
		return b;
	}

		public ArrayList<Label> creaLabel(int n,int width,int hight)
		{

			return null;
		}
}