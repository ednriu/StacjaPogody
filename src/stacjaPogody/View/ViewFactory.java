package stacjaPogody.View;

import java.io.IOException;
import java.util.ArrayList;

import stacjaPogody.Controller.BaseController;
import stacjaPogody.Controller.SelectCitiesController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import stacjaPogody.WeatherManager;

public class ViewFactory {
	
	private ArrayList<Stage> activeStages;
    private WeatherManager weatherManager;
	
	public ViewFactory(WeatherManager weatherManager) {
        activeStages = new ArrayList<Stage>();
        this.weatherManager = weatherManager;
    }
	
    public void showCitySelectionWindow(){
        BaseController controller = new SelectCitiesController(this, weatherManager, "citySelection.fxml");
        initializeStage(controller);
    }

    private void initializeStage(BaseController baseController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        //updateStyle(scene);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        activeStages.add(stage);
    }

    public  void closeStage(Stage stageToClose){
        stageToClose.close();
        activeStages.remove(stageToClose);
    }

}
