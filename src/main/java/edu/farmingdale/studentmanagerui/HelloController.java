package edu.farmingdale.studentmanagerui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {

    @FXML private TableView<?> table;

    @FXML private TableColumn<?, ?> colId;
    @FXML private TableColumn<?, ?> colFirst;
    @FXML private TableColumn<?, ?> colLast;
    @FXML private TableColumn<?, ?> colDept;
    @FXML private TableColumn<?, ?> colMajor;
    @FXML private TableColumn<?, ?> colEmail;

    @FXML
    public void initialize() {
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }
}