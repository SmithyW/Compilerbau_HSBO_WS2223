# Combilerbau_HSBO_WS2223

## Grammatik

- program -> function program | function
- function -> ident openPar parameterList closePar expression
-	parameterList -> ident komma parameterList | ident | Epsilon 
-	expression -> term rightExpression
-	rightExpression -> plus term rightExpression 
-	rightExpression -> minus term rightExpression 
-	rightExpression -> Epsilon
-	term -> operator rightTerm
-	rightTerm -> mult operator rightTerm 
-	rightTerm -> div operator rightTerm 
-	rightTerm -> Epsilon
-	operator -> openPar expression closePar | num | ident | functionCall
-	functionCall -> ident openPar expressionList closePar
-	expressionList -> expression komma expressionList | expression | Epsilon
