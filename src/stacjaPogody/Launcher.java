package stacjaPogody;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import stacjaPogody.View.ViewFactory;

import java.util.ArrayList;
import java.util.List;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private WeatherManager weatherManager = new WeatherManager();;

    @Override
    public void start(Stage stage) throws Exception {
        //stage.show();
        ViewFactory viewFactory = new ViewFactory(weatherManager);
        viewFactory.showWeatherDataWindow();
        
    }


    @Override
    public void stop() throws Exception {
        
    }
}
