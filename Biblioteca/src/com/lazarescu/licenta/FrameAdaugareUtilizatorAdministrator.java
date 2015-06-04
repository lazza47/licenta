package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameAdaugareUtilizatorAdministrator extends JFrame {

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
					FrameAdaugareUtilizatorAdministrator frame = new FrameAdaugareUtilizatorAdministrator();
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
	public FrameAdaugareUtilizatorAdministrator() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameAdaugareUtilizatorAdministrator.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("Adaug\u0103 utilizator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnAdaugareMembru = new JButton("Ad\u0103ugare membru");
		btnAdaugareMembru.setBounds(5, 5, 424, 61);
		btnAdaugareMembru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameAdaugareMembruSauAdministrator frame = new FrameAdaugareMembruSauAdministrator(
						"membru");
				frame.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAdaugareMembru);

		JButton btnNewButton = new JButton("Ad\u0103ugare administrator");
		btnNewButton.setBounds(5, 194, 424, 61);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameAdaugareMembruSauAdministrator frame = new FrameAdaugareMembruSauAdministrator(
						"administrator");
				frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
	}

}
