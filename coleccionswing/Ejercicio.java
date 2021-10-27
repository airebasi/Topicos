package coleccionswing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio extends JFrame {

	private JPanel contentPane;
	private JTextField textIntroducido;

	public static void main(String[] args) {
					Ejercicio frame = new Ejercicio();
					frame.setVisible(true);
	}

		Ejercicio() {
			setTitle("19100153");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textIntroducido = new JTextField();
		textIntroducido.setBounds(7, 25, 119, 20);
		contentPane.add(textIntroducido);
		textIntroducido.setColumns(10);
		
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(149, 11, 165, 219);
		contentPane.add(lblResultado);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Numeros miNumero = new Numeros();
				miNumero.varA = "(" + textIntroducido.getText() + ")";
				if(lblResultado.getText() == "")
				{
					lblResultado.setText("Introduzca un valor");
				}
				else
				{
				for(int x = 0; x < miNumero.varA.length(); x++)
				{
					miNumero.varB = miNumero.varA.charAt(x);
					System.out.println(miNumero.varB);
					if(miNumero.varB == '(')
					{
						miNumero.pila.push("Abre");
					}
					if(miNumero.varB == ')')
					{
						miNumero.pila.pop();
						if(miNumero.pila.isEmpty())
						{
							lblResultado.setText("Correcto");
						}
						else
						{
							lblResultado.setText("Incorrecto");
						}
					}
				}
				}
			}
		});
		btnProcesar.setBounds(24, 67, 89, 23);
		contentPane.add(btnProcesar);
	}
}
