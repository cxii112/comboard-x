package me.cxii112.comboard;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ComboardController
{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
