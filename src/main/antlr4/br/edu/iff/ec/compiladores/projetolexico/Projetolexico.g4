grammar Projetolexico;

CRIAR_FICHA : 'CRIAR_FICHA';
CLASSE: 'CLASSE';
LVL: 'LVL';
RACA: 'RACA';
NOME:'NOME';
IMAGEM:'IMAGEM';
DESC:'DESC';

RACAS:('Humano'|'Anao' |'Elfo' | 'Goblin' | 'Minotauro' | 'Gnomo' | 'Satanas');
CLASSES:('Guerreiro'|'Ladino' | 'Cacador' | 'Mago' | 'Assassino'| 'Clerigo' | 'Bardo' | 'Barbaro' | 'Capetante');

WS: (' '|'\t'|'\r'|'\n')->skip;
DELIMITADOR:':';
NOME_USUARIO: '"' ~('"'|'\n')* '"';
LEVEL: ('0'..'9')*;
ABRECHAV: '{';
FECHACHAV:'}';
NOME_IMAGEM: (('a' ..'z') ( 'a' ..'z' | 'A' ..'Z' | '0' ..'9')*) '.png';
DESCR: '"' ~('"'|'\n')* '"';

inicial: CRIAR_FICHA ABRECHAV
            IMAGEM ':' NOME_IMAGEM
            NOME ':'NOME_USUARIO
            RACA ':'RACAS
            CLASSE ':'CLASSES
            LVL ':'LEVEL
            DESC ':'DESCR
FECHACHAV EOF;

