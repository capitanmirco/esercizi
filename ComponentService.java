import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public interface ComponentService
{
		

		public ArrayList<TextField> creaText(int n,int width,int hight);

		public ArrayList<Button> creaButton(int n,int width,int hight,ActionListener a);

		public ArrayList<Label> creaLabel(int n,int width,int hight);

		


}