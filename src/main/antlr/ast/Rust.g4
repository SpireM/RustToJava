grammar Rust;
@header {
    package rustless.ast;
}

repl returns [double value]
    : 'quit' EOF { System.exit(0); }
    | expr EOF { $value=$expr.value; } ;
module:	(function)* EOF ;
function: 'fn' ID '(' argumentDeclarationList ')' block (';'|) ; 
block: '{' (instruction ';'?)* '}' ;
instruction
    : assume
    | declare
    | declareAndInit
    | arrayDeclareAndInit
    | functionCall
    | macroCall
    | whileBlockIn
    | ifBlockIn
    ;

assume : ID EQ expr  ;
declare : type ID ;
declareAndInit : type ID EQ expr ;
arrayDeclareAndInit : type ID ':' '[' 'i32' ';' expr ']' '=' '[' expr ';' expr ']' ;
type
    :	'let mut'
    |	'boolean'
    |	'let'
    |	ID
    ;

whileBlockIn : 'while' exprCompare   block   ;
ifBlockIn : 'if' exprCompare   block   ;
functionCall: ID '(' argumentList ')';
macroCall: ID '!' '(' argumentList ')';
argumentList
    : 
    | arg+=argument ( ',' arg+=argument )*
    ;
argument: expr ;
argumentDeclarationList
    : 
    | arg+=argumentDeclaration ( ',' arg+=argumentDeclaration )* 
    ;
argumentDeclaration: ID ;
exprCompare :      expr op  expr
             ;

op : LT
    | RT
    ;
expr returns [double value]
    : functionCall { $value=Double.NaN; }
    | MINUS expr { $value=-$expr.value; }
    | literal { $value=$literal.value; }
    | ID { $value=Double.NaN; }
    | a=expr MULT b=expr { $value=$a.value*$b.value; }
    | a=expr DIV b=expr { $value=$a.value/$b.value; }
    | a=expr PLUS b=expr { $value=$a.value+$b.value; }
    | a=expr MINUS b=expr { $value=$a.value-$b.value; }
    | a=expr EQ b=expr { $a.value = $b.value; }
    | '(' expr ')' { $value=$expr.value; }
    | ID '[' expr ']' { $value=Double.NaN; }
    ;
literal returns [double value]
    : FLOAT { $value=Double.parseDouble($text); }
    | INT { $value=Double.parseDouble($text); }
    | STRING { $value=Double.NaN; }
    ;

LT : '<' ;
RT : '>' ;
MINUS : '-' ;
PLUS : '+' ;
DIV : '/' ;
MULT : '*' ;
EQ : '=' ;

ID : [a-zA-Z][a-zA-Z0-9]* ;
fragment NEWLINE : [\r]?[\n] ;
INT : [0-9]+ ;
FLOAT : [0-9]+([.][0-9]+)?([Ee][-]?[0-9]+)? ;
STRING : '"' ( ESC | ~[\\"] )* '"';
fragment ESC : '\\"' | '\\\\' ;

WS : [ \n\r\t]+ -> channel(HIDDEN); 