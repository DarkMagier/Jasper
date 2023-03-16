grammar Jasper;

prog: makeenvariable
    |Class Identifier ('(' Identifier ')')? (Implements Identifier)? '{'
    promission? abbrex? save_type Identifier (':' ('*'|'**')? type)? ('=' '&'? literal) ';'
    '}'
    |Function Identifier '(' (makeenvariable (','makeenvariable)*)? ')' ('->' '('(int (',' int)*)?')')? '{' '}';
makeenvariable:
    Var Identifier (':' ('*'|'**')? type)? ('=' '&'? literal)?
    |Var Identifier (':' '<'('*'|'**')? type '>')? ('=' '&'? literal)?;

promission:Public|Protect|Private;
save_type:Var|Const;
abbrex:Static;
type:int
    |uint
    |float
    |char
    |string
    |byte
    |Identifier
    ;
literal:Integer|FloatLiteral|Identifier;

int:Int
    |Int8
    |Int16
    |Int32
    |Int64
    |Int128
    ;
uint:UInt
    |UInt8
    |UInt16
    |UInt32
    |UInt64
    |UInt128
    ;

float:Float
     |Float32
     |Float64
     ;

char:Char
    |Char8
    |Char16
    |Char32
    ;
byte:Byte;
string:String;

// Keywords:
Int:'int';
Int8:'int8';
Int16:'int16';
Int32:'int32';
Int64:'int64';
Int128:'int128';

UInt:'uint';
UInt8:'uint8';
UInt16:'uint16';
UInt32:'uint32';
UInt64:'uint64';
UInt128:'uint128';

Float:'float';
Float32:'float32';
Float64:'float64';

Number:'number';

Bool:'bool';
True:'true'|'True';
False:'false''False';
Null:'null';

Byte:'byte';
Char:'char';
Char8:'char8';
Char16:'char16';
Char32:'char32';

String:'string';


Function:'function';

Enum:'enum';
Class:'class';
Public:'public';
Private:'private';
Protect:'protect';
Self:'self';
This:'this';
Super:'super';

Abstract:'abstract';
Extends:'extends';
Implements:'implements';
Interface:'interface';
Trait:'trait';

Package:'package';
Import:'import';
As:'as';

New:'new';
Const:'const';
Var:'var';
Sync:'sync';

Static:'static';

If:'if';
Else:'else';
Do:'do';
While:'while';
For:'for';
Switch:'switch';
Case:'case';
Default:'default';
Break:'break';
Continue:'continue';
Return:'return';
Label:'label';
Goto:'goto';
Try:'try';
Catch:'catch';
Finally:'finally';
Throw:'throw';
Raise:'raise';

Identifier:[a-zA-Z_] [0-9a-zA-Z_]*;
Integer:DecimalInteger
       |HexInteger
       |OctalInteger
       |BinaryInteger
       ;

fragment DecimalInteger:('+'|'-')? [0-9]+;
fragment HexInteger: '0' [xX] [0-9a-zA-Z]+;
fragment OctalInteger:'0' [0-7]+;
fragment BinaryInteger:'0'[bB] [01]+;

FloatLiteral
    :DecimalFloat
   |HexFloat
   |OctalFloat
   |BinaryFloat
    ;

fragment DecimalFloat: ('+'|'-')? [0-9]+ '.' [0-9]*;
fragment HexFloat: '0' [xX] [0-9a-zA-Z]+ '.' [0-9a-zA-Z]+;
fragment OctalFloat: '0' [0-7]+ '.' [0-7]*;
fragment BinaryFloat:'0'[bB] [01]+ '.' [01]*;

BoolLiteral: True
            |False
             ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;














