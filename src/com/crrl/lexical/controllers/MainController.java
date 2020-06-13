package com.crrl.lexical.controllers;

import com.crrl.lexical.lexer.LexicalAnalyzer;
import com.crrl.lexical.lexer.SyntacticAnalyzer;
import com.crrl.lexical.models.CompileError;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private ObservableList<CompileError> errors = FXCollections.observableArrayList();

    @FXML
    private JFXTextField expressions;

    @FXML
    private Label result;

    @FXML
    private TabPane tabPane;

    @FXML
    void onAnalyzeClick(MouseEvent event) {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(new BufferedReader(new StringReader(expressions.getText())));
        SyntacticAnalyzer syntacticAnalyzer = new SyntacticAnalyzer(lexicalAnalyzer);
        errors.clear();
        try {
            syntacticAnalyzer.parse();

            errors.addAll(lexicalAnalyzer.errors);
            errors.addAll(syntacticAnalyzer.errors);
        } catch (Exception e) {

            errors.addAll(lexicalAnalyzer.errors);
            errors.addAll(syntacticAnalyzer.errors);
        }

        if(errors.size() > 0 ) {
            result.setText(
                    "La compilacion fallo con: " +
                            "\n- " + lexicalAnalyzer.errors.size() + " Errores lexicos." +
                            "\n- " + syntacticAnalyzer.errors.size() + " Errores Sintacticos."
            );

            tabPane.getSelectionModel().select(0);
        } else {
            result.setText(
                    "El resultado de la compilación es: " + syntacticAnalyzer.result + "." +
                            "\n- " + lexicalAnalyzer.errors.size() + " Errores lexicos." +
                            "\n- " + syntacticAnalyzer.errors.size() + " Errores Sintacticos."
            );

            tabPane.getSelectionModel().select(1);
        }
    }

    @FXML
    void onExampleClick(MouseEvent event) {
        expressions.setText("not ((true or false) && (false || true)) and !(false or not (true && false) && !false)");
    }

    private TableView<CompileError> initErrorTable() {
        TableView<CompileError> tableErrors = new TableView<>();

        TableColumn<CompileError, String> lexeme = new TableColumn<>("Lexema");
        TableColumn<CompileError, String> type = new TableColumn<>("Tipo");
        TableColumn<CompileError, String> description = new TableColumn<>("Descripcion");
        TableColumn<CompileError, String> line = new TableColumn<>("Linea");
        TableColumn<CompileError, String> column = new TableColumn<>("Columna");

        lexeme.setCellValueFactory(param -> param.getValue().getLexemeProperty());
        type.setCellValueFactory(param -> param.getValue().getTypeProperty());
        description.setCellValueFactory(param -> param.getValue().getDescriptionProperty());
        line.setCellValueFactory(param -> param.getValue().getLineProperty());
        column.setCellValueFactory(param -> param.getValue().getColumnProperty());

        tableErrors.setPlaceholder(new Label("No hay errores"));

        tableErrors.getColumns().addAll(lexeme,type, description, line, column);

        tableErrors.setItems(errors);

        return tableErrors;
    }

    private void initTabPane() {
        Tab errors = new Tab("Errores", initErrorTable());
        Tab tokenFound = new Tab("Resultado", result);
        tabPane.getTabs().addAll(errors, tokenFound);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTabPane();
    }
}
