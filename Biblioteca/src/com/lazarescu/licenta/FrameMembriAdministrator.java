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

public class FrameMembriAdministrator extends JFrame {

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
					FrameMembriAdministrator frame = new FrameMembriAdministrator();
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
	public FrameMembriAdministrator() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameMembriAdministrator.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("Membri");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnAdaugare = new JButton("Ad\u0103ugare");
		btnAdaugare.setBounds(5, 7, 424, 41);
		btnAdaugare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameAdaugareUtilizatorAdministrator frame = new FrameAdaugareUtilizatorAdministrator();
				frame.setVisible(true);
			}
		});

		JLabel label = new JLabel("");
		label.setBounds(5, 212, 424, 41);
		contentPane.setLayout(null);
		contentPane.add(btnAdaugare);

		JButton btnInformatii = new JButton("Informa\u0163ii Membru");
		btnInformatii.setBounds(5, 48, 424, 41);
		btnInformatii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameInformatiiMembru frame = new FrameInformatiiMembru();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnInformatii);

		JButton btnListaMembrii = new JButton("List\u0103 membri");
		btnListaMembrii.setBounds(5, 89, 424, 41);
		btnListaMembrii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.listaMembrii();
			}
		});
		contentPane.add(btnListaMembrii);

		JButton btnSolicitariInregistrare = new JButton(
				"Solicit\u0103ri inregistrare");
		btnSolicitariInregistrare.setBounds(5, 130, 424, 41);
		btnSolicitariInregistrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.solicitariInregistrare();
			}
		});
		contentPane.add(btnSolicitariInregistrare);

		JLabel labelNrUseriInregistrati = new JLabel("");
		labelNrUseriInregistrati.setHorizontalAlignment(SwingConstants.CENTER);
		labelNrUseriInregistrati.setBounds(5, 171, 424, 82);
		contentPane.add(labelNrUseriInregistrati);
		labelNrUseriInregistrati.setText("Momentan există "
				+ Biblioteca.getInstance().getMembriiInregistrati().size()
				+ " membrii înregistraţi...");

	}

}
