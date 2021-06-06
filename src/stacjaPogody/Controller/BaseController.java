package stacjaPogody.Controller;

import stacjaPogody.WeatherManager;
import stacjaPogody.View.ViewFactory;

public abstract class BaseController {

	protected WeatherManager weatherManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(ViewFactory viewFactory, WeatherManager weatherManager, String fxmlName) {
        this.viewFactory = viewFactory;
        this.weatherManager = weatherManager;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
