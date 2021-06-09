package stacjaPogody.Controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import stacjaPogody.WeatherManager;
import stacjaPogody.View.ViewFactory;

public class SelectCitiesController extends BaseController implements Initializable{

	public SelectCitiesController(ViewFactory viewFactory, WeatherManager weatherManager, String fxmlName) {
		super(viewFactory, weatherManager, fxmlName);
		// TODO Auto-generated constructor stub
	}
	
	  @FXML
	    private Button WybierzButton;

	    @FXML
	    private ChoiceBox<?> WyjazdZLista;

	    @FXML
	    private ChoiceBox<?> WyjazdDoLista;

	    @FXML
	    private Button AnulujButton;

	    @FXML
	    void AnulujButton() {

	    }

	    @FXML
	    void WybierzButton() {
	    	viewFactory.showWeatherDataWindow();
	    }

	    @FXML
	    void WyjazdDoDrag() {

	    }

	    @FXML
	    void WyjazdZDrag() {

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}

}
