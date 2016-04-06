package CarParkSim.controller;

import javax.swing.*;
import CarParkSim.logic.*;
import java.awt.event.*;

public class Controller extends AbstractController implements ActionListener {
	private JButton start;
	private JButton stop;
	
	public Controller(Model model) {
		super(model);
		
		setSize(450, 50);
		start=new JButton("Start");
		start.addActionListener(this);
		stop=new JButton("Stop");
		stop.addActionListener(this);
		
		this.setLayout(null);
		add(start);
		add(stop);
		start.setBounds(229, 10, 70, 30);
		stop.setBounds(319, 10, 70, 30);

		setVisible(true);
	}

        @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start) {
			model.start();
		}
		
		if (e.getSource()==stop) {
			model.stop();
		}
	}
}