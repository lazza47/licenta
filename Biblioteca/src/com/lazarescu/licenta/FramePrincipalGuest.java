package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FramePrincipalGuest extends JFrame {

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
					FramePrincipalGuest frame = new FramePrincipalGuest();
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
	public FramePrincipalGuest() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FramePrincipalGuest.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("Meniu guest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnCautaCarte = new JButton("Caut\u0103 carte");
		btnCautaCarte.setBounds(67, 11, 281, 29);
		btnCautaCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCautareCarte frameCautareCarte = new FrameCautareCarte();
				frameCautareCarte.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCautaCarte);

		JButton btnInregistrare = new JButton("\u00CEnregistrare");
		btnInregistrare.setBounds(67, 209, 281, 29);
		btnInregistrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameAdaugareMembruSauAdministrator guest = new FrameAdaugareMembruSauAdministrator(
						"guest");
				guest.setVisible(true);
			}
		});
		contentPane.add(btnInregistrare);

		JLabel lblNewLabel = new JLabel(
				"Pentru mai multe facilit\u0103\u0163i, v\u0103 recomand\u0103m s\u0103 v\u0103 \u00EEnregistra\u0163i !");
		lblNewLabel.setBounds(67, 108, 325, 29);
		contentPane.add(lblNewLabel);
	}
}
