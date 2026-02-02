module demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens eus.ehu to javafx.fxml;
    exports eus.ehu;
}
