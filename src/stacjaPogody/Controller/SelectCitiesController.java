package stacjaPogody.Controller;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import stacjaPogody.WeatherManager;
import stacjaPogody.Model.City;
import stacjaPogody.View.ViewFactory;

public class SelectCitiesController extends BaseController implements Initializable{

	public SelectCitiesController(ViewFactory viewFactory, WeatherManager weatherManager, String fxmlName) {
		super(viewFactory, weatherManager, fxmlName);
		// TODO Auto-generated constructor stub
	}
	
	  	@FXML
	    private Button WybierzButton;

	    @FXML
	    private ChoiceBox<String> WyjazdZLista;

	    @FXML
	    private ChoiceBox<String> WyjazdDoLista;

	    @FXML
	    private Button AnulujButton;

	    @FXML
	    void AnulujButtonAction() {
	    	viewFactory.showWeatherDataWindow();
	    	Stage stage = (Stage) WybierzButton.getScene().getWindow();
	    	viewFactory.closeStage(stage);
	    }

	    @FXML
	    void WybierzButtonAction() {
	    	viewFactory.showWeatherDataWindow();
	    	Stage stage = (Stage) WybierzButton.getScene().getWindow();
            viewFactory.closeStage(stage);
	    }

	    @FXML
	    void WyjazdDoDrag() {

	    }

	    @FXML
	    void WyjazdZMouseClicked() {
			WyjazdZLista.setItems(weatherManager.getCities());
	    	System.out.println("Klikam");

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub

			
		}

}
