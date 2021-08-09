package questao13;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaQuestao extends JFrame {
	
	private JButton calcularButton;
	private JLabel calcFrequancia, kLabel, mLabel;
	private JTextField kField, mField;
	
	public TelaQuestao(){
		setSize(200, 180);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		calcFrequancia = new JLabel("***Calcular Frequência***");
		kLabel = new JLabel("Constante Elástica: ");
		kField = new JTextField(10);
		mLabel = new JLabel("Massa do Bloco:");
		mField = new JTextField(10);
		calcularButton = new JButton("Calcular");
		
		add(calcFrequancia);
		add(kLabel);
		add(kField);
		add(mLabel);
		add(mField);
		add(calcularButton);		
		
		setVisible(true);
	}

	public JButton getCalcularButton() {
		return calcularButton;
	}

	public void setCalcularButton(JButton calcularButton) {
		this.calcularButton = calcularButton;
	}

	public JLabel getkLabel() {
		return kLabel;
	}

	public void setkLabel(JLabel kLabel) {
		this.kLabel = kLabel;
	}

	public JLabel getmLabel() {
		return mLabel;
	}

	public void setmLabel(JLabel mLabel) {
		this.mLabel = mLabel;
	}

	public JTextField getkField() {
		return kField;
	}

	public void setkField(JTextField kField) {
		this.kField = kField;
	}

	public JTextField getmField() {
		return mField;
	}

	public void setmField(JTextField mField) {
		this.mField = mField;
	}

}
