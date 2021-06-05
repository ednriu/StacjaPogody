package stacjaPogody.View;

import java.util.ArrayList;



import javafx.stage.Stage;
import stacjaPogody.WeatherManager;

public class ViewFactory {
	
	private ArrayList<Stage> activeStages;
    private WeatherManager weatherManager;
	
	public ViewFactory(WeatherManager weatherManager) {
        activeStages = new ArrayList<Stage>();
        this.weatherManager = weatherManager;
    }

}
