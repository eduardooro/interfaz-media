package com.utc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class listapersonas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textInID;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textGenero;
	private JTextField textDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listapersonas frame = new listapersonas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public listapersonas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("FORMULARIO DE REGISTRO DE PERSONAS");
		lblTitulo.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblTitulo.setBounds(150, 21, 366, 36);
		contentPane.add(lblTitulo);
		
		JButton btnREGISTRO = new JButton("Registro de persona");
		btnREGISTRO.setBounds(530, 81, 129, 23);
		contentPane.add(btnREGISTRO);
		
		JButton btnActualizacion = new JButton("Actualizacion");
		btnActualizacion.setBounds(530, 115, 129, 23);
		contentPane.add(btnActualizacion);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(530, 149, 129, 23);
		contentPane.add(btnEliminar);
		
		JButton btnBuscarPersona = new JButton("Buscar Persona");
		btnBuscarPersona.setBounds(530, 183, 129, 23);
		contentPane.add(btnBuscarPersona);
		
		JButton btnFullPersonas = new JButton("Todas las personas");
		btnFullPersonas.setBounds(530, 217, 129, 23);
		contentPane.add(btnFullPersonas);
		
		JButton btnLimpieza = new JButton("Limpieza formulario");
		btnLimpieza.setBounds(530, 251, 129, 23);
		contentPane.add(btnLimpieza);
		
		JButton btnBuscarPPersona = new JButton("Buscar por persona");
		btnBuscarPPersona.setBounds(530, 285, 129, 23);
		contentPane.add(btnBuscarPPersona);
		
		JButton btnIdPersona = new JButton("ID de la persona");
		btnIdPersona.setBounds(530, 313, 129, 23);
		contentPane.add(btnIdPersona);
		
		JLabel lblBuscar = new JLabel("Buscar y filtar");
		lblBuscar.setBounds(530, 354, 91, 14);
		contentPane.add(lblBuscar);
		
		JLabel lblID = new JLabel("Ingrese el ID para buscar");
		lblID.setBounds(530, 367, 129, 14);
		contentPane.add(lblID);
		
		textField = new JTextField();
		textField.setBounds(530, 385, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRedad = new JLabel("Filtrar por rango de edad");
		lblRedad.setBounds(530, 409, 129, 14);
		contentPane.add(lblRedad);
		
		JButton btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.setBounds(530, 433, 89, 23);
		contentPane.add(btnEjecutar);
		
		JLabel lblIngreseID = new JLabel("ID:");
		lblIngreseID.setBounds(25, 102, 46, 14);
		contentPane.add(lblIngreseID);
		
		textInID = new JTextField();
		textInID.setBounds(49, 99, 232, 20);
		contentPane.add(textInID);
		textInID.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 153, 46, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(72, 150, 209, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(25, 210, 46, 14);
		contentPane.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(72, 207, 209, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(25, 255, 46, 14);
		contentPane.add(lblGenero);
		
		textGenero = new JTextField();
		textGenero.setBounds(72, 252, 209, 20);
		contentPane.add(textGenero);
		textGenero.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(25, 294, 63, 14);
		contentPane.add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(72, 291, 209, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);

	}
}
