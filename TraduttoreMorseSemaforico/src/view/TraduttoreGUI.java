package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.*;

public class TraduttoreGUI extends JFrame{
	private static final long serialVersionUID = -6082579042692602457L;
	private JTextField inputField;
	private JTextArea outputArea;
	
	public TraduttoreGUI() {
		setTitle("Traduttore Morse e Semaforico");
		setSize(800, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		UIManager.put("Label.font", new Font("Dialog", Font.BOLD, 16));
		UIManager.put("TextField.font", new Font("Dialog", Font.PLAIN, 18));
		UIManager.put("TextArea.font", new Font("Dialog", Font.PLAIN, 28));
		UIManager.put("Button.font", new Font("Dialog", Font.BOLD, 16));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		
		inputField = new JTextField();
		JButton traduci = new JButton("Traduci");
		outputArea = new JTextArea(2, 20);
		outputArea.setEditable(false);
		
		panel.add(new JLabel("Inserisci il messaggio da tradurre:"));
		panel.add(inputField);
		panel.add(traduci);
		add(panel, BorderLayout.NORTH);
		add(new JScrollPane(outputArea), BorderLayout.CENTER);
		
		ImageIcon icon = new ImageIcon("scout.png");
		Image img = icon.getImage().getScaledInstance(380, 380, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(imageLabel, BorderLayout.SOUTH);
		
		traduci.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String messaggio = inputField.getText();
				String resultMorse = TraduttoreMorseSemaforico.traduciMorse(messaggio);
                String resultSemaforico = TraduttoreMorseSemaforico.traduciSemaforico(messaggio);

                outputArea.setText("Messaggio tradotto in morse: " + resultMorse + "\nMessaggio tradotto in semaforico: " + resultSemaforico);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TraduttoreGUI();
    }
	

}
