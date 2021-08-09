package questao13;

import javax.swing.JOptionPane;

public class CalcularFrequencia {
	//ATRIBUTOS
	private double k;
	private double m;
	private double w;
	private double f;

	//MÉTODO CONSTRUTOR
	public CalcularFrequencia(double k, double m){
		this.k = k;
		this.m = m;
		calcFrequencia();

	}

	//MÉTODO ESPECIAL
	public void calcFrequencia(){
		double calc;

		calc = (2*k)/(m);
		w =  Math.sqrt(calc);		
		f = (w/(2*Math.PI));

		JOptionPane.showMessageDialog(null, "Frequência " + f + " Hz");

	}

	//MÉTODOS ACESSORES
	public void setK(double k) {
		this.k = k;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getK() {
		return k;
	}

	public double getM() {
		return m;
	}
		


}
