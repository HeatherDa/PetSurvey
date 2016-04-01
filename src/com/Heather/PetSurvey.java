package com.Heather;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class PetSurvey extends JFrame {
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JButton submitButton;
    private JLabel surveyResultsLabel;
    private JButton quitButton;

    boolean hasFish;
    boolean hasCats;
    boolean hasDogs;

    PetSurvey(){
        super("Pet Survey Application");
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));//must come before pack
        pack();
        setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dog=(hasDogs)?"a dog":"no dogs";//solves assignment in three different ways
                String cat=(hasCats==true)?"a cat": "no cats";
                String fish;
                if (hasFish==true){
                    fish="a fish";
                }else{
                    fish="no fish";
                }
                surveyResultsLabel.setText("user has "+dog+", "+cat+" and "+fish+".");
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasDogs=dogCheckBox.isSelected();
            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasCats=catCheckBox.isSelected();
            }
        });
        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasFish=fishCheckBox.isSelected();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
