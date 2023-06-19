package com.restaurant;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class PrimaryController {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    void aboutus(MouseEvent event) throws IOException {
        loadPage("about");


    }

    @FXML
    void employeeDet(MouseEvent event) throws IOException {
        loadPage("employee");


    }

    @FXML
    void gallary(MouseEvent event) throws IOException {
        loadPage("gallery");


    }

    @FXML
    void location(MouseEvent event) throws IOException {
        loadPage("location");

    }

    /**
     * @param event
     */
    @FXML
    void menu(MouseEvent event) {
        bp.setCenter(ap);

    }

    /**
     * @param Page
     * @throws IOException
     */
    private void loadPage(String Page) throws IOException{
        Parent root = null ;
        // root = App.setRoot(Page);
       
         root = FXMLLoader.load(getClass().getResource(Page + ".fxml"));
        bp.setCenter(root);
    }

}
