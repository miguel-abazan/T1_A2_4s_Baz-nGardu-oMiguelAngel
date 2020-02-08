import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

class EjemploNullLayout extends JFrame{
	
	public EjemploNullLayout() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad 2");
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		JLabel lblfirst = new JLabel();
		lblfirst.setText("El formulario clasico incluye todo lo visible "
				+ "en esta lista. ");
		lblfirst.setBounds(25, 5, 320, 30);
		add(lblfirst);
		
		JLabel lblSecond = new JLabel("Opciones de Formulario.");
		lblSecond.setBounds(25, 30, 320, 30);
		add(lblSecond);

		JLabel lblThird = new JLabel("Incluye lo Siguente: ");
		lblThird.setBounds(30, 50, 320, 30);
		add(lblThird);
		
		JCheckBox checkboxFirst = new JCheckBox("Un Titulo Para Tu Formulario");
		checkboxFirst.setBounds(25, 70, 320, 30);
		add(checkboxFirst);
		
		
		JTextArea areaTexto = new JTextArea("Suscribete A la Lista de correos. ", 10,10);
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		areaTexto.setBounds(25, 100, 320, 30);
		add(areaTexto);
		
		ButtonGroup bg = new ButtonGroup();
	
		JRadioButton radiobtnFirst = new JRadioButton("Solo Campos Requeridos.");
		bg.add(radiobtnFirst);
		radiobtnFirst.setBounds(25, 160, 320, 30);
		add(radiobtnFirst);
		
		JRadioButton radiobtnSecond = new JRadioButton("Todos los Campos.");
		bg.add(radiobtnSecond);
		radiobtnSecond.setBounds(25, 185, 320, 30);
		add(radiobtnSecond);
		
		JLabel lblfifth = new JLabel("(editar campos requeridos en el generador del formulario) ");
		lblfifth.setBounds(40, 210, 400, 30);
		add(lblfifth);
		
		JCheckBox checkboxSecond = new JCheckBox("Campos de grupo de interes");
		checkboxSecond.setBounds(25, 270, 320, 30);
		add(checkboxSecond);
		
		JCheckBox checkboxThird = new JCheckBox("Indicador de campos requeridos");
		checkboxThird.setBounds(25, 300, 320, 30);
		add(checkboxThird);
		
		JLabel lblSixth = new JLabel("Establecer anchura del formulario");
		lblSixth.setBounds(25, 330, 320, 30);
		add(lblSixth);
		JTextArea areaTexto2 = new JTextArea("", 10,10);
		areaTexto2.setLineWrap(true);
		areaTexto2.setWrapStyleWord(true);
		areaTexto2.setBounds(25, 360, 320, 30);
		add(areaTexto2);
		
		JCheckBox checkboxFourth = new JCheckBox("Habilitar modo emergente malvado");
		checkboxFourth.setBounds(25, 390, 320, 30);
		add(checkboxFourth);
		JCheckBox checkboxFifth = new JCheckBox("Deshabilitar todo JavaScript");
		checkboxFifth.setBounds(25, 415, 320, 30);
		add(checkboxFifth);
		JCheckBox checkboxSixth = new JCheckBox("Enlace de archivo incluido");
		checkboxSixth.setBounds(25, 440, 320, 30);
		add(checkboxSixth);
		JCheckBox checkboxSeventh = new JCheckBox("Enlace de MonkeyRewars Incluido");
		checkboxSeventh.setBounds(25, 465, 320, 30);
		add(checkboxSeventh);
		
		JPanel panel1= new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Visualizacion"));
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.WHITE);
		panel1.setPreferredSize(new Dimension(1000,1000));
		panel1.setBounds(450, 5, 500, 300);
		
		JLabel lbl1 = new JLabel("Correo Electronico:");
		lbl1.setBounds(0, 50, 320, 30);
		panel1.add(lbl1);
		
		
		
		JTextField t1= new JTextField(20);
		t1.setBounds(30,100,320,30);
		panel1.add(t1);
		
		JLabel lbl2 = new JLabel("Nombre: ");
		lbl2.setBounds(30, 80, 320, 30);
		panel1.add(lbl2);
		
		panel1.add(new JTextField(10));
		panel1.add(new JLabel("Apellido"));
		panel1.add(new JTextField(10));
		ImageIcon btnSu = new ImageIcon("src/Imagenes/sus.jpg");
		JButton btnS=new JButton("Suscribete");
		btnS.setBounds(30, 80, 320, 30);
		btnS.setIcon(btnSu);
		btnS.setIconTextGap(2);
		btnS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnS.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        btnS.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnS.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
		panel1.add(btnS);
		
		add(panel1);
		
		
		
		JLabel lbl10 = new JLabel("Copia/Pega Dentro del Sitio");
		lbl10.setBounds(450, 320, 600, 30);
		add(lbl10);
		
		JTextArea areaTexto3 = new JTextArea("", 1000,1000);
		areaTexto3.setLineWrap(true);
		areaTexto3.setWrapStyleWord(true);
		areaTexto3.setBounds(452, 350, 500, 200);
		add(areaTexto3);
		
	}
}

public class Prueba {
	public static void main(String[] args) {
	
			
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new EjemploNullLayout();
			}
		});
		
		
		
		
	}

}
