/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resetFieldThread;

import com.toedter.calendar.JDateChooser;

import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author pc
 */
public class ResetFieldRunnable implements Runnable {

    private ArrayList<JTextField> listOfTextFields;
    private JDateChooser calendar;
    private JPasswordField passwordField;

    public ResetFieldRunnable(
            ArrayList<JTextField> listOfTextFields,
            JDateChooser calendar,
            JPasswordField passwordField) {

        this.listOfTextFields = listOfTextFields;
        this.calendar = calendar;
        this.passwordField = passwordField;
    }

    @Override
    public void run() {
        for (int i = 0; i < listOfTextFields.size(); i++) {
            JTextField textField = listOfTextFields.get(i);
            textField.setText("");
        }
        calendar.setCalendar(null);
        passwordField.setText("");
    }
}

