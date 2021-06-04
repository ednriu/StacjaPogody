package stacjaPogody.Controller;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import stacjaPogody.View.ViewFactory;

public class SelectCitiesController extends BaseController {

	public SelectCitiesController(ViewFactory viewFactory, String fxmlName) {
		super(viewFactory, fxmlName);
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
	    void AnulujButton(ActionEvent event) {

	    }

	    @FXML
	    void WybierzButton(ActionEvent event) {

	    }

	    @FXML
	    void WyjazdDoDrag(MouseEvent event) {

	    }

	    @FXML
	    void WyjazdZDrag(MouseEvent event) {

	    }

}
