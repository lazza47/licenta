package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameStatistici extends JFrame {

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
					FrameStatistici frame = new FrameStatistici();
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
	public FrameStatistici() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FrameStatistici.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setTitle("Statistici");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnStatistici = new JButton(
				"C\u0103r\u0163i nereturnate la timp");
		btnStatistici.setBounds(10, 11, 414, 58);
		btnStatistici.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.cartiNereturnateLaTimp();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnStatistici);

		JButton btnOperatiuniTotale = new JButton("Opera\u0163iuni totale");
		btnOperatiuniTotale.setBounds(10, 192, 414, 58);
		btnOperatiuniTotale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.operatiuniTotale();

			}
		});
		contentPane.add(btnOperatiuniTotale);
	}
}
