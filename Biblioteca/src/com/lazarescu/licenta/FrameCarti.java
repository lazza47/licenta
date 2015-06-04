package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameCarti extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAdaugare;
	private JButton btnCautare;
	protected static FrameCarti frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					frame = new FrameCarti();
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
	public FrameCarti() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameCarti.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("C\u0103r\u0163i");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnAdaugare = new JButton("Ad\u0103ugare");
		btnAdaugare.setBounds(5, 5, 424, 60);
		btnAdaugare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameAdaugaCarteSauExemplar frame = new FrameAdaugaCarteSauExemplar();
				frame.setVisible(true);
			}

		});
		contentPane.setLayout(null);
		contentPane.add(btnAdaugare);

		btnCautare = new JButton("C\u0103utare ");
		btnCautare.setBounds(5, 195, 424, 60);
		btnCautare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCautareCarte frameCautareCarte = new FrameCautareCarte();
				frameCautareCarte.setVisible(true);
			}
		});
		contentPane.add(btnCautare);
	}

	public void removeButtons() {
		remove(btnAdaugare);
		remove(btnCautare);
	}
}
