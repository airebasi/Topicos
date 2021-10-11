package Cuestionario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Cuestionario extends JFrame 
{

	private JPanel contentPane;
	
	public int NumeroPregunta;
	public int RespuestasCorrectas = 0;
	public String CadenaResultado = "";
	public String Pregunta1 = "1.-Hasta el momento, ¿Cuantas versiones de Java hay?";
	public String Pregunta2 = "2.-En Java, ¿Como se declara un foreach?";
	public String Pregunta3 = "3.-¿Que diferencia tiene el string de Java con C#?";
	public String Pregunta4 = "4.-¿Cual de estas caracteristicas no pertenece a Java?";
	public String Pregunta5 = "5.-¿En que programa esta hecho este programa?";

	public static void main(String[] args) 
	{
					Cuestionario frame = new Cuestionario();
					frame.setVisible(true);
	}
	
	
	public Boolean[] ArregloRespuestas = new Boolean[5];
	
	
	public int CalificarRespuestas()
	{
			for(Boolean x: ArregloRespuestas)
			{
				if (x == true)
				{
					RespuestasCorrectas++;
				}
				else
				{

				}
			}
			return RespuestasCorrectas;
	}
	
	public Cuestionario() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPregunta = new JLabel(Pregunta1);
		lblPregunta.setBounds(10, 11, 414, 34);
		contentPane.add(lblPregunta);
		
		JRadioButton rdbtnR1 = new JRadioButton("16");
		rdbtnR1.setBounds(20, 52, 404, 23);
		contentPane.add(rdbtnR1);
		
		JRadioButton rdbtnR2 = new JRadioButton("11");
		rdbtnR2.setBounds(20, 78, 404, 23);
		contentPane.add(rdbtnR2);
		
		JRadioButton rdbtnR3 = new JRadioButton("14");
		rdbtnR3.setBounds(20, 104, 404, 49);
		contentPane.add(rdbtnR3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnR1);
		group.add(rdbtnR2);
		group.add(rdbtnR3);
		
		JButton btnAnterior = new JButton("<-");
		btnAnterior.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(lblPregunta.getText() == Pregunta1)
				{
					btnAnterior.setVisible(false);
				}
				
				else if(lblPregunta.getText() == Pregunta2)
				{
					btnAnterior.setVisible(true);
					lblPregunta.setText(Pregunta1);
					rdbtnR1.setText("16");
					rdbtnR2.setText("11");
					rdbtnR3.setText("14");
				}
				else if(lblPregunta.getText() == Pregunta3)
				{
					lblPregunta.setText(Pregunta2);
					rdbtnR1.setText("foreach (Tipo objeto in Lista)");
					rdbtnR2.setText("Foreach (Objeto in Lista)");
					rdbtnR3.setText("for (Tipo Dato : Lista)");
				}
				else if(lblPregunta.getText() == Pregunta4)
				{
					lblPregunta.setText(Pregunta3);
					rdbtnR1.setText("No hay diferencia");
					rdbtnR2.setText("Al declarar el dato, se utiliza s en mayuscula (String)");
					rdbtnR3.setText("Tiene que asignarsele un valor vacio al crearse, de lo contrario, falla");
				}
				else if(lblPregunta.getText() == Pregunta5)
				{
					lblPregunta.setText(Pregunta4);
					rdbtnR1.setText("Un metodo para pedirle al usuario que teclee");
					rdbtnR2.setText("ToString()");
					rdbtnR3.setText("Una manera de agrupar los radio buttons");
				}
			}
		});
		btnAnterior.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnAnterior.setBounds(122, 160, 89, 23);
		contentPane.add(btnAnterior);
		
		JLabel lblRespuesta = new JLabel("");
		lblRespuesta.setBounds(143, 200, 143, 34);
		contentPane.add(lblRespuesta);
		
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() 
		{
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				switch(NumeroPregunta)
				{
					case 0:
						if (lblPregunta.getText() == Pregunta1)
						{
							if (rdbtnR1.isSelected())
							{
								ArregloRespuestas[0] = true;
								btnEvaluar.setVisible(false);
							}
							else
							{
								ArregloRespuestas[0] = false;
								btnEvaluar.setVisible(false);
							}
						}
						else
						{
							ArregloRespuestas[0] = false;
							btnEvaluar.setVisible(false);
						}
					case 1:
						if (lblPregunta.getText() == Pregunta2)
						{
							if (rdbtnR3.isSelected())
							{
								ArregloRespuestas[1] = true;
								btnEvaluar.setVisible(false);
							}
							else
							{
								ArregloRespuestas[1] = false;
								btnEvaluar.setVisible(false);
							}
						}
						else
						{
							ArregloRespuestas[1] = false;
							btnEvaluar.setVisible(false);
						}
					case 2:
						 if (lblPregunta.getText() == Pregunta3)
						 {
							 if (rdbtnR2.isSelected())
							{
								 ArregloRespuestas[2] = true;
								 btnEvaluar.setVisible(false);
							}
							 else
								{
									ArregloRespuestas[2] = false;
									btnEvaluar.setVisible(false);
								}
						 }
						 else
							{
								ArregloRespuestas[2] = false;
							}
					case 3:
						if (lblPregunta.getText() == Pregunta4)
						{
							if (rdbtnR2.isSelected())
							{
							ArregloRespuestas[3] = true;
							btnEvaluar.setVisible(false);
							}
							else
							{
								ArregloRespuestas[3] = false;
								btnEvaluar.setVisible(false);
							}
						}
						else
						{
							ArregloRespuestas[3] = false;
							btnEvaluar.setVisible(false);
						}
					case 4:
						if (lblPregunta.getText() == Pregunta5);
						{
							if (rdbtnR1.isSelected())
							{
								ArregloRespuestas[4] = true;
								btnEvaluar.setVisible(false);
							}
							else
							{
								ArregloRespuestas[4] = false;
								btnEvaluar.setVisible(false);
							}
						}
					    if (lblPregunta.getText() != Pregunta5)
						{
							ArregloRespuestas[4] = false;
							btnEvaluar.setVisible(false);
						}
						String S = Integer.toString(CalificarRespuestas());
						lblRespuesta.setText(S);
						default:
				}
			}
		});
		btnEvaluar.setBounds(10, 160, 89, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSiguiente = new JButton("->");
		btnSiguiente.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(lblPregunta.getText() == Pregunta1)
				{
					btnEvaluar.setVisible(true);
					lblPregunta.setText(Pregunta2);
					rdbtnR1.setText("foreach (Tipo objeto in Lista)");
					rdbtnR2.setText("Foreach (Objeto in Lista)");
					rdbtnR3.setText("for (Tipo Dato : Lista)");
					btnAnterior.setVisible(true);
				}
				
				else if(lblPregunta.getText() == Pregunta2)
				{
					btnEvaluar.setVisible(true);
					btnAnterior.setVisible(true);
					lblPregunta.setText(Pregunta3);
					rdbtnR1.setText("No hay diferencia");
					rdbtnR2.setText("Al declarar el dato, se utiliza s en mayuscula (String)");
					rdbtnR3.setText("Tiene que asignarsele un valor vacio al crearse, de lo contrario, falla");
				}
				else if(lblPregunta.getText() == Pregunta3)
				{
					btnEvaluar.setVisible(true);
					lblPregunta.setText(Pregunta4);
					rdbtnR1.setText("Un metodo para pedirle al usuario que teclee");
					rdbtnR2.setText("ToString()");
					rdbtnR3.setText("Una manera de agrupar los radio buttons");
				}
				else if(lblPregunta.getText() == Pregunta4)
				{
					btnEvaluar.setVisible(true);
					lblPregunta.setText(Pregunta5);
					rdbtnR1.setText("JFrame");
					rdbtnR2.setText("JavaEditor");
					rdbtnR3.setText("ApplicationWindow");
				}
				else if(lblPregunta.getText() == Pregunta5)
				{
					btnEvaluar.setVisible(true);
				}
			}
		});
		
		btnSiguiente.setBounds(221, 160, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
			}
		});
		btnSalir.setBounds(335, 160, 89, 23);
		contentPane.add(btnSalir);
	}
}
