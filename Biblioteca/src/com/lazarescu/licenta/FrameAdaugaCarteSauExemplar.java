package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameAdaugaCarteSauExemplar extends JFrame {

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
					FrameAdaugaCarteSauExemplar frame = new FrameAdaugaCarteSauExemplar();
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
	public FrameAdaugaCarteSauExemplar() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameAdaugaCarteSauExemplar.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnAdaugaCarte = new JButton("Adaug\u0103 carte");
		btnAdaugaCarte.setBounds(5, 5, 424, 66);
		btnAdaugaCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameAdaugaCarte meniuAdaugaCarte = new FrameAdaugaCarte();
				meniuAdaugaCarte.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAdaugaCarte);

		JButton btnAdaugaExemplar = new JButton("Adaug\u0103 exemplar");
		btnAdaugaExemplar.setBounds(5, 197, 424, 58);
		btnAdaugaExemplar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FrameAdaugaExemplar frameAdaugaExemplar = new FrameAdaugaExemplar();
				frameAdaugaExemplar.setVisible(true);
			}
		});
		contentPane.add(btnAdaugaExemplar);
	}

}
