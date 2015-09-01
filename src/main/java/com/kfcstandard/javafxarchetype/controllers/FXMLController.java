package com.kfcstandard.javafxarchetype.controllers;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Basic class for an FXML controller
 *
 * #KFCStandard and JavaFX8
 *
 * @author Ken Fogel
 */
public class FXMLController {

    // Real programmers use logging, not System.out.println
    private final Logger log = LoggerFactory.getLogger(getClass().getName());

    // The @FXML annotation on a class variable results in the matching
    // reference being injected into the variable
    // label is defined in the fxml file
    @FXML
    private Label label;

    // resources were from the FXMLLoader
    @FXML
    private ResourceBundle resources;

    /**
     * The even handler registered in the FXML file for when the button is
     * pressed
     *
     * @param event
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText(resources.getString("OK"));
    }

    /**
     * This method is automatically called after the fxml file has been loaded.
     * Useful if a control must be dynamically configured such as loading data
     * into a table. In this code all it does is log that it has been called.
     */
    @FXML
    private void initialize() {
        log.info("initialize called");
    }
}
