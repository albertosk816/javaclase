package EjerciciosUltimaEvaluacion.Ejercicio01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

		/*
		 * Primero realizamos un jframe que se un tipo de jframe
		 * 
		 * 
		 */
	
	public VentanaPrincipal () {
		//Se crea la ventana dando las dimensiones
		this.setBounds(0, 0, 800, 600);
		
		
		
//		//setResizable es para que la ventana no se pueda maximizar ni minimizar
//		this.setResizable(false);
		
			
		
		//Para que salga a pantalla completa
		 
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//Para cerrar la aplicacion al cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new FlowLayout());
		
		
		JTabbedPane tabbedPanel = new JTabbedPane();
		
		
		//Para escribir en la ventana
		panel.add(new JLabel("Hola"));
		
		
//		//Para escribir en la ventana
//		panel.add(new JTextField("Texto" , 40));
		
		JTextField jtf = new JTextField("Texto" , 40);
		
		
//		//Para seleccionar
//		panel.add(new JCheckBox("Selecciona"));
		
		
		JCheckBox jcb = new JCheckBox("Esto es un check");
		panel.add(jcb);
		
		
		
//		//Boton
//		panel.add(new JButton("Aceptar"));
		
		
		JButton jbt = new JButton("Aceptar");
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = "Contenido del JTextField: \n" + jtf.getText() + "Check: " + jcb.getActionCommand();
				JOptionPane.showMessageDialog(null, str);
				
			}
		});
		
		panel.add(jbt);
		
		//Para crear pestañas en nuestra ventana
		tabbedPanel.add("01" , panel);
		
		
		
		
		
		this.setContentPane(tabbedPanel);
//		this.setContentPane(panel);
		
	}
	
	
	public static void main (String args[]) {
		
		//Creamos e iniciamos la ventana
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

}
