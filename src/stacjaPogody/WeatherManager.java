package stacjaPogody;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import stacjaPogody.Model.Cities;
import stacjaPogody.Model.WeatherForCity;

public class WeatherManager {
	ObservableList<String> cities = FXCollections.observableArrayList();
	
	WeatherManager()
	{
		WeatherForCity firstCity = new WeatherForCity("Kalwaria");
		WeatherForCity secondCity = new WeatherForCity("Krak�w");

		cities.add("Kalwaria");
		cities.add("Krak�w");
		cities.add("Warszawa");
	}
	
	public ObservableList<String> getCities(){
		return cities;
	}

}
