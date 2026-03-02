module edu.farmingdale.studentmanagerui {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.studentmanagerui to javafx.fxml;
    exports edu.farmingdale.studentmanagerui;
}