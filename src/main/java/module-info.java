module cats.cat {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens cats.cat to javafx.fxml;
    exports cats.cat;
}