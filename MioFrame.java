
import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//FACCIAMO DIVENTARE LA NOSTRA CLASSE UN FRAME ESTENDENDO LA CLASSE OMONIMA
public class MioFrame extends Frame implements ActionListener
{
	
	Color x=new Color(255,0,0);


	private Button chiudi;

	public MioFrame(String title)
	{
			super(title);
			this.setVisible(true);
			this.setSize(500,500);
			this.setLocation(400,300);
			this.setBackground(x);
			this.setLayout(null);


			chiudi=new Button("CHIUDI");
			chiudi.setSize(80,40);
			chiudi.setLocation(200,400);
			chiudi.addActionListener(this);


			this.add(chiudi);

		}

		@Override
		public void actionPerformed(ActionEvent e)
		{

			System.exit(0);
		}


}