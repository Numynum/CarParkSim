package CarParkSim.main;

import javax.swing.*;

import CarParkSim.controller.*;
import CarParkSim.logic.*;
import CarParkSim.view.*;

/**
 *
 * @author Nienke's boys
 */
public class CarParkSim {

    private Model model;
    private JFrame screen;
    private AbstractView carparkView;
    private AbstractView infoView;
    private Controller controller;
    private ChartView chartView;
    private BarView barView;

    /**
     *
     * @param args from the command line, currently unused
     */
    public CarParkSim(String[] args) {

        model = new Model();
        carparkView = new CarParkView(model);
        infoView = new InfoView(model);
        chartView = new ChartView(model, "Plekgebruik in de Garage");
        barView = new BarView(model, "Dingen");

        model.addView(carparkView);
        model.addView(infoView);
        model.addView(chartView);
        model.addView(barView);

        controller = new Controller(model);
        screen = new JFrame("Car Park Simulator");
        screen.setSize(1250, 500);
        screen.setLayout(null);

        screen.getContentPane().add(infoView);
        screen.getContentPane().add(carparkView);
        screen.getContentPane().add(controller);
        screen.getContentPane().add(chartView);
        screen.getContentPane().add(barView);
        infoView.setBounds(850, 55, 350, 370);
        carparkView.setBounds(0, 0, 850, 370);
        controller.setBounds(0, 370, 800, 130);
        chartView.setBounds(0, 500, 560, 400);
        barView.setBounds(600, 500, 560, 400);
        screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen.setVisible(true);
        
        model.notifyViews();
    }

}
