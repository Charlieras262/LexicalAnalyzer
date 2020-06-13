@echo off
echo -------------------------- Seteando Variables --------------------------
cd ..
cd libs
setx LIBS_HOME %cd%
cd ..
cd lexer
setx LEXER_HOME %cd%
cd ..
cd scripts
echo -------------------------- Compilando archivos --------------------------
java -jar "%LIBS_HOME%\jflex-full-1.8.2.jar" LexicalAnalyzer.jflex
java -jar "%LIBS_HOME%\java-cup-11b.jar" -parser SyntacticAnalyzer -symbols Token SyntacticAnalyzer.cup
echo -------------------------- Copiando archivos ----------------------------
copy "%cd%\*.java" "%LEXER_HOME%"
echo -------------------------- Eliminando Archivos Basura ------------------
del /f /a "%cd%\*.java"
echo -------------------------- Tarea completada ----------------------------
pause