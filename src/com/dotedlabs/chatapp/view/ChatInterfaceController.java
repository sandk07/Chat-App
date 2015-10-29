package com.dotedlabs.chatapp.view;

import java.util.ArrayList;
import java.util.List;

import com.dotedlabs.chatapp.MainApp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ChatInterfaceController {
	private static final String EMPTY = "";

	@FXML
    private TextField chatMessage;

	@FXML
    private ListView<String> listView;

    List<String> chatDataList = new ArrayList<String>();
    private final ObservableList<String> observableList = FXCollections.observableArrayList();

	// Reference to the main application.
    private MainApp mainApp;


    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ChatInterfaceController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	listView.setItems(observableList);
    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Event triggered when send button is clicked
     */
    public void handleChatSubmit(){

    	if(!chatMessage.getText().equals(EMPTY)){
    		observableList.add(chatMessage.getText());
    	}

        chatMessage.clear();
    }
}
