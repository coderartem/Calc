import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;

public class CalcView {
	
	CalcEng cE = new CalcEng(this);
	
	JButton [] b = new JButton [16];
	int tot = b.length;
	String label []= {"1","2","3","4","5","6","7","8","9","0",".","=","+","-","*","/"};
	JPanel [] p = new JPanel [4];
	int tp = p.length;
	JFrame fr = new JFrame();
	JFormattedTextField txt = new JFormattedTextField("0");
	GridLayout gr1 = new GridLayout (3,3,5,5), gr2 = new GridLayout (4,1,5,5);
	BorderLayout br1 = new BorderLayout(), br2 = new BorderLayout ();
	int i=0;
	
	CalcView (){
		
		for (i=0; i<tp;i++){
			p[i] = new JPanel();
			//i++;
		}i=0;
					
		while ( i<tot){
			b[i]=new JButton(label[i]);
			b[i].addActionListener(cE);
			if (i<tot-4){
				p[2].add(b[i]);
			}else p[3].add(b[i]);
			i++;
		}
		txt.setHorizontalAlignment(JFormattedTextField.RIGHT);
		p[0].setLayout(br1);
		p[1].setLayout(br2);
		p[2].setLayout(gr1);
		p[3].setLayout(gr2);
			
		p[1].add("South",p[2]);
		p[1].add("North",txt);
		p[0].add("West",p[1]);
		p[0].add("East",p[3]);
		
		fr.setContentPane(p[0]);
		fr.pack();
		fr.setVisible(true);
	}
	
	public static void main (String[] args){
		CalcView cV = new CalcView ();
	}
}