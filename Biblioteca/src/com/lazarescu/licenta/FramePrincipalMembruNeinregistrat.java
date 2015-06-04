package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FramePrincipalMembruNeinregistrat extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipalMembruNeinregistrat frame = new FramePrincipalMembruNeinregistrat();
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
	public FramePrincipalMembruNeinregistrat() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FramePrincipalMembruNeinregistrat.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("Membru ne\u00EEnregistrat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnCautaCarte = new JButton("Caut\u0103 carte");
		btnCautaCarte.setBounds(5, 87, 424, 94);
		btnCautaCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameCautareCarte frameCautareCarte = new FrameCautareCarte();
				frameCautareCarte.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCautaCarte);

		JLabel lblSolicitareInCurs = new JLabel(
				"Solicitare \u00EEn curs de aprobare....");
		lblSolicitareInCurs.setBounds(5, 5, 424, 14);
		lblSolicitareInCurs.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSolicitareInCurs);
	}

}
