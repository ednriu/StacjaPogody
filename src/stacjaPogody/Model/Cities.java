package stacjaPogody.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cities {
	
	ObservableList<String> cities = FXCollections.observableArrayList();

	public Cities() {
		cities.add("Kalwaria");
		cities.add("Kraków");
		cities.add("Warszawa");
	}
	
	public ObservableList<String> getCities() {		
		return cities;
	}

}
