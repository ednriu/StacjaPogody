module stacjaPogody {
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.controls;
	requires javafx.base;
	
    opens stacjaPogody;
    opens stacjaPogody.View;
    opens stacjaPogody.Controller;
    opens stacjaPogody.Model;
}