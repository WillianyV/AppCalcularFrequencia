package questao13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControladorTela {
	TelaQuestao telaQuestao;

	public ControladorTela(TelaQuestao telaQuestao) {
		
		this.telaQuestao = telaQuestao;
		controlar();
	}
	
	public void controlar(){
		
		telaQuestao.getCalcularButton().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			try {
				CalcularFrequencia cf = new CalcularFrequencia(Double.parseDouble(telaQuestao.getkField().getText()), 
						Double.parseDouble(telaQuestao.getmField().getText()));
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "ERRO");
			}
			
			telaQuestao.getkField().setText(null);
			telaQuestao.getmField().setText(null);
				
			}
		});
	}
	
	

}
