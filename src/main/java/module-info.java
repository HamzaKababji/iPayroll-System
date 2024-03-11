module se2203b.ipayroll {
    requires javafx.controls;
    requires javafx.fxml;


    opens se2203b.ipayroll to javafx.fxml;
    exports se2203b.ipayroll;
}