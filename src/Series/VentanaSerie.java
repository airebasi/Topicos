package Series;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;


public class VentanaSerie extends JFrame
{

	private JPanel contentPane;
	private JTextField txt1erValor;
	private JTextField txt2ndoValor;
	private JTextField txtVueltas;
	private JTextArea txtResultado;
	
	//Lanzamiento de aplicacion
	public static void main(String [] args) 
	{
		VentanaSerie frame = new VentanaSerie();
		frame.setVisible(true);
	}
	
	public VentanaSerie()
	{
		JButton btnMostrarResultado = new JButton("Resultado");
		btnMostrarResultado.setBounds(42, 86, 89, 23);
		getContentPane().add(btnMostrarResultado);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 209, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor1 = new JLabel("1er valor");
		lblValor1.setBounds(10, 11, 73, 14);
		contentPane.add(lblValor1);
		
		JLabel lblValor2 = new JLabel("2do valor");
		lblValor2.setBounds(10, 36, 73, 14);
		contentPane.add(lblValor2);
		
		JLabel lblIteracion = new JLabel("Iteraciones");
		lblIteracion.setBounds(10, 62, 73, 14);
		contentPane.add(lblIteracion);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(230, 119, -29, 14);
		contentPane.add(lblResultado);
		
		JButton btnMostrarR = new JButton("Resultado");
		btnMostrarR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int z = 1;
				String a = txt1erValor.getText();
				String b = txt2ndoValor.getText();
				String c = txtVueltas.getText();
				String Cadena = "";
				
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				int Limite = Integer.parseInt(c);
				int Resultado = 0;
				while (z <= Limite)
				{
					Resultado = x + y;
			    	System.out.println(Resultado);
			    	z++;
			    	x = y;
			    	y = Resultado;
			    	Cadena = Cadena + " " + Resultado;
				}
				txtResultado.setText(Cadena);
			}
		});
		btnMostrarR.setBounds(36, 87, 124, 23);
		contentPane.add(btnMostrarR);
		
		txt1erValor = new JTextField();
		txt1erValor.setBounds(93, 8, 86, 20);
		contentPane.add(txt1erValor);
		txt1erValor.setColumns(10);
		
		txt2ndoValor = new JTextField();
		txt2ndoValor.setBounds(93, 33, 86, 20);
		contentPane.add(txt2ndoValor);
		txt2ndoValor.setColumns(10);
		
		txtVueltas = new JTextField();
		txtVueltas.setBounds(93, 59, 86, 20);
		contentPane.add(txtVueltas);
		txtVueltas.setColumns(10);
		
		JTextPane txtResultado = new JTextPane();
		txtResultado.setBounds(36, 119, 124, 33);
		contentPane.add(txtResultado);
	}
}
