package com.crrl.lexical.models;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class CompileError {

    private final String lexeme;
    private final String type;
    private final String description;
    private final int line;
    private final int column;

    public CompileError(String lexeme, String type, String description, int line, int column) {
        this.lexeme = lexeme;
        this.type = type;
        this.description = description;
        this.line = line + 1;
        this.column = column + 1;
    }

    public String getLexeme() {
        return lexeme;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public SimpleStringProperty getLexemeProperty() {
        return new SimpleStringProperty(lexeme);
    }

    public SimpleStringProperty getTypeProperty() {
        return new SimpleStringProperty(type);
    }

    public SimpleStringProperty getDescriptionProperty() {
        return new SimpleStringProperty(description);
    }

    public SimpleStringProperty getLineProperty() {
        return new SimpleStringProperty(String.valueOf(line));
    }

    public SimpleStringProperty getColumnProperty() {
        return new SimpleStringProperty(String.valueOf(column));
    }

    @Override
    public String toString() {
        return "CompileError{" +
                "lexeme='" + lexeme + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
