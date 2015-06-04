package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameOperatiuni extends JFrame {

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
					FrameOperatiuni frame = new FrameOperatiuni();
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
	public FrameOperatiuni() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameOperatiuni.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("Opera\u0163iuni");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnImprumutareCarte = new JButton("\u00CEmprumutare carte");
		btnImprumutareCarte.setBounds(5, 5, 424, 59);
		btnImprumutareCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.imprumutareCarte();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnImprumutareCarte);

		JButton btnReturnareCarte = new JButton("Returnare carte");
		btnReturnareCarte.setBounds(5, 196, 424, 59);
		btnReturnareCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.returnareCarte2();
			}
		});
		contentPane.add(btnReturnareCarte);
	}

}
