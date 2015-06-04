package com.lazarescu.licenta;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FramePrincipalMembruInregistrat extends JFrame {

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
					FramePrincipalMembruInregistrat frame = new FramePrincipalMembruInregistrat();
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
	public FramePrincipalMembruInregistrat() {
		setTitle("Membru \u00EEnregistrat");
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						FramePrincipalMembruInregistrat.class
								.getResource("/com/lazarescu/licenta/imagini/iconFrame32px.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnCautaCarte = new JButton("Caut\u0103 carte");
		btnCautaCarte.setBounds(5, 6, 424, 55);
		btnCautaCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCautareCarte frameCautareCarte = new FrameCautareCarte();
				frameCautareCarte.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCautaCarte);

		JButton btnAfiseazaIstoricOperatiuni = new JButton(
				"Afi\u015Feaz\u0103 istoric opera\u0163iuni personale");
		btnAfiseazaIstoricOperatiuni.setBounds(5, 99, 424, 55);
		btnAfiseazaIstoricOperatiuni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.operatiuniPersonale();
			}
		});
		contentPane.add(btnAfiseazaIstoricOperatiuni);

		JButton btnSituatiaCartilorImprumutate = new JButton(
				"Situa\u0163ia c\u0103r\u0163ilor \u00EEmprumutate");
		btnSituatiaCartilorImprumutate.setBounds(5, 195, 424, 55);
		btnSituatiaCartilorImprumutate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeniuFunctii.operatiuniPersonaleReturnate();
			}
		});
		contentPane.add(btnSituatiaCartilorImprumutate);
	}

}
