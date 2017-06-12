import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class CalcEng implements ActionListener {
	
	CalcView cv;
	CalcEng (CalcView cv){
		this.cv=cv;
	}
	double vvod=0;
	String znak="";
	String onscrin;
	int i=12;
	
	public void actionPerformed(ActionEvent ev){
		
		
		
		JButton bb = (JButton) ev.getSource();
		String knopka = bb.getText();
		System.out.println(knopka);
		onscrin = cv.txt.getText();
		if (onscrin.equals("0")){
			cv.txt.setText(knopka);
		}else{
		cv.txt.setText(onscrin+knopka);}
		
		double txttrans=0;
		try {
			 txttrans = Double.parseDouble(onscrin);
		} catch (NumberFormatException e) {
			 //TODO Auto-generated catch block
			JOptionPane.showConfirmDialog(null, "Нельзя буквы!","Ошибка!",JOptionPane.PLAIN_MESSAGE);
			//e.getMessage();
		}
		
			Object nazhato = ev.getSource();
			
			if (!onscrin.equals("")){
				while (i<cv.tot){
					if (nazhato == cv.b[i]){
						vvod=txttrans;
						znak=cv.b[i].getText();
						cv.txt.setText("0"); break;
					} i++; } 
				i=12;}
								
			if (nazhato == cv.b[11]){
				switch (znak){
				case("+"):vvod+=txttrans;
				break;
				case("-"):vvod-=txttrans;
				break;
				case("*"):vvod*=txttrans;
				break;
				case("/"):vvod/=txttrans;
				break;
				} cv.txt.setText(vvod+"");
			}
			
		}
}
