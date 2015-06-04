package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameCautareCarte extends JFrame {

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
					FrameCautareCarte frame = new FrameCautareCarte();
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
	public FrameCautareCarte() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameCautareCarte.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("C\u0103utare carte");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnDupaTitlu = new JButton("Dup\u0103 titlu");
		btnDupaTitlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCautareDupaTitlu frameCautareDupaTitlu = new FrameCautareDupaTitlu();
				frameCautareDupaTitlu.setVisible(true);
			}
		});
		btnDupaTitlu.setBounds(151, 46, 103, 23);
		contentPane.add(btnDupaTitlu);

		JButton btnDupaAutor = new JButton("Dup\u0103 autor");
		btnDupaAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCautaDupaAutor frameCautaDupaAutor = new FrameCautaDupaAutor();
				frameCautaDupaAutor.setVisible(true);
			}
		});
		btnDupaAutor.setBounds(151, 114, 103, 23);
		contentPane.add(btnDupaAutor);

		JButton btnAfiseazaToate = new JButton("Afi\u015Feaz\u0103 toate");
		btnAfiseazaToate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.afiseazaToateCartile();
			}
		});
		btnAfiseazaToate.setBounds(151, 186, 103, 23);
		contentPane.add(btnAfiseazaToate);
	}

}
