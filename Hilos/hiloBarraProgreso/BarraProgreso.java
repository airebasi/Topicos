package hiloBarraProgreso;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;

public class BarraProgreso extends JFrame {

	private JPanel contentPane;

	int Porcentaje = 0;
	public JProgressBar pBarra;
	//RealizaParte1

	public BarraProgreso() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pBarra = new JProgressBar(0,100);
		pBarra.setStringPainted(true);
		pBarra.setBounds(29, 28, 286, 21);
		contentPane.add(pBarra);
	}
	
	public void MostrarProgreso()
	{
			for(int i = 0; i <= 100; i++)
			{
				pBarra.setValue(i);
				pBarra.repaint();
				try {Thread.sleep(1000);}//Itera cada segundo
				catch(InterruptedException ex) {ex.printStackTrace();}
			}
	}
	
	public static void main(String[] args) 
	{
					BarraProgreso Barra = new BarraProgreso();
					Barra.setVisible(true);
					//ROBADO DE LA CLASE HILO, CREADO PARA COMPROBAR SU FUNCIONAMIENTO COMO PRUEBA ANTES DEL SWING
					Barra.MostrarProgreso();
					
					
	}
}
