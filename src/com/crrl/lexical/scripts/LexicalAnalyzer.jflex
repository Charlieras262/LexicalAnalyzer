/* -----------------  User Code (Java Syntax)--------------------*/
package com.crrl.lexical.lexer;

import com.crrl.lexical.models.CompileError;

import java_cup.runtime.*;
import java.util.LinkedList;

/* ----------------- Declarations ------------------*/

%%

%{
    public LinkedList<CompileError> errors = new LinkedList<>();
%}

// ----------------- Directives
%public
%class LexicalAnalyzer
%cupsym Token
%cup
%char
%column
%full
%ignorecase
%line
%unicode

// ----------------- Regular Expression

B_EXP = ([t][r][u][e])|([f][a][l][s][e])

// ----------------- State

%%

/* ----------------- Lexical Rules -----------------*/

// ----------------- Symbols
<YYINITIAL> "!" { return new Symbol(Token.NOT, yycolumn, yyline, yytext()); }
<YYINITIAL> "not" { return new Symbol(Token.NOT, yycolumn, yyline, yytext()); }
<YYINITIAL> "&&" { return new Symbol(Token.AND, yycolumn, yyline, yytext()); }
<YYINITIAL> "and" { return new Symbol(Token.AND, yycolumn, yyline, yytext()); }
<YYINITIAL> "||" { return new Symbol(Token.OR, yycolumn, yyline, yytext()); }
<YYINITIAL> "or" { return new Symbol(Token.OR, yycolumn, yyline, yytext()); }
<YYINITIAL> "(" { return new Symbol(Token.P_OPEN, yycolumn, yyline, yytext()); }
<YYINITIAL> ")" { return new Symbol(Token.P_CLOSE, yycolumn, yyline, yytext()); }

// ----------------- ER Symbols

<YYINITIAL> {B_EXP} { return new Symbol(Token.B_EXP, yycolumn, yyline, yytext()); }

// ----------------- White Spaces

[\t\r\n\f\s] {}

// ----------------- Lexical Errors

<YYINITIAL> . { errors.add(new CompileError(yytext(), "LE", "Token no valido.", yyline, yycolumn)); }


