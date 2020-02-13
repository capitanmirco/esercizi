
import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashSet;
//FACCIAMO DIVENTARE LA NOSTRA CLASSE UN FRAME ESTENDENDO LA CLASSE OMONIMA
public class MioFrame extends Frame implements ActionListener
{
	
	Color x=new Color(255,0,0);
	Font mioFont =new Font("Arial",Font.BOLD,25);
	
	int pos_yb=50;
	int pos_xb=50;

	int pos_yt=50;
	int pos_xt=50;

	HashSet<Integer> sestinaV=new HashSet<Integer>();
	ArrayList<Integer> gOrdinata=new ArrayList<Integer>();
	ArrayList<Integer> vOrdinata=new ArrayList<Integer>();
	HashSet<Integer> sestinaG=new HashSet<Integer>();

	ArrayList<TextField> at=new ComponentFActory().creaText(6,50,50);
	ArrayList<Button> ab=new ComponentFActory().creaButton(2,130,30,this);

	/*
	private Button chiudi;
	private Button check;
	*/
	private Label l_errore;

	private TextField t;
	private int contatore=3;
	

	public MioFrame(String title)
	{
			super(title);
			this.setVisible(true);
			this.setSize(500,500);
			this.setLocation(400,300);
			this.setBackground(x);
			this.setLayout(null);


			l_errore=new Label();
			l_errore.setSize(300,50);
			l_errore.setLocation(130,100);
			l_errore.setFont(mioFont);

			

			for (int i=0;i<ab.size() ;i++ ) {
				
				
				ab.get(i).setLocation(pos_xb,400);
				pos_xb+=150;

				
				add(ab.get(i));
			}

			ab.get(0).setLabel("CHIUDI");
			ab.get(1).setLabel("ENTER");


			for (int i=0;i<at.size() ;i++ ) {
				
				
				at.get(i).setLocation(pos_xt,150);
				pos_xt+=70;
				add(at.get(i));
			}
			

			
			
			
			add(l_errore);

		}

		private HashSet<Integer> checkG(ArrayList<TextField> z)
		{

			for (int i=0;i<z.size() ;i++ ) {
				
				Integer x=Integer.parseInt(z.get(i).getText());
				
				if (x<=0 || x>90 ) {
					
					
					i--;
					
					
				}
				
				else if(  !sestinaG.add(x))
				{
					
						i--;

				}
				
			}
			return sestinaG;
		}


		private ArrayList<Integer> sestinav()
		{

			for (int j=0;j<6 ;j++ ) {


				
					if(!sestinaV.add( (int)(Math.random()*90+1)   ) )
					{
							j--;
					}
			}
			vOrdinata.addAll(sestinaV);
			return vOrdinata;
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{

			if(e.getActionCommand().equals("CHIUDI"))
			{
					System.exit(0);
			}
			/*
			if(e.getSource()==check)
			{
				
					String pinInserito=t.getText();

					if (pinInserito.equals("ciccio")) {

						
					}
					else
					{
						l_errore.setText("PIN ERRATO");
						contatore--;
						
					}
				
			}
			if(e.getSource()==chiudi)
			{
					System.exit(0);
				
			}
			*/
			
		}


}