module stacjaPogody {
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.controls;
	
    opens stacjaPogody;
    opens stacjaPogody.View;
    opens stacjaPogody.Controller;
}