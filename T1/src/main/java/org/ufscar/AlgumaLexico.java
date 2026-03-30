package org.ufscar;

public class AlgumaLexico
{
    LeitorDeArquivosTexto ldat;

    public AlgumaLexico(String arquivo)
    {
        ldat = new LeitorDeArquivosTexto(arquivo);
    }

    public Token ProximoToken()
    {
        return null;
    }

    private Token OperadorAritmetico()
    {
        int charactereLido = ldat.LerProximoCaractere();
        char c = (char)charactereLido;

        if(c == '*') {
            return new Token(TipoToken.OpAritMult, ldat.GetLexema());
        }else if(c == '/') {
            return new Token(TipoToken.OPAritDiv, ldat.GetLexema());
        }else if(c == '+') {
            return new Token(TipoToken.OPAritSoma, ldat.GetLexema());
        }else if(c == '-') {
            return new Token(TipoToken.OpAritSub, ldat.GetLexema());
        }else{
            return null;
        }
    }

    private Token Delimitador()
    {
        int charactereLido = ldat.LerProximoCaractere();
        char c = (char)charactereLido;

        if(c == ':') {
            return new Token(TipoToken.Delim, ldat.GetLexema());
        }else{
            return null;
        }
    }

    private Token OperadorRelacional()
    {
        int charactereLido = ldat.LerProximoCaractere();
        char c = (char)charactereLido;

        if (c == '<'){
            c = (char)ldat.LerProximoCaractere();
            if(c == '>'){
                return new Token(TipoToken.OpRelDif, ldat.GetLexema());
            }else if(c == '=') {
                return new Token(TipoToken.OpRelMenorIgual, ldat.GetLexema());
            }else{
                ldat.RetrocederPonteiro();
                return new Token(TipoToken.OpRelMenor, ldat.GetLexema());
            }
        }else if (c == '='){
            return new Token(TipoToken.OpRelIgual, ldat.GetLexema());
        }else if (c == '>') {
            c = (char) ldat.LerProximoCaractere();
            if (c == '=') {
                return new Token(TipoToken.OpRelMaiorIgual, ldat.GetLexema());
            } else {
                ldat.RetrocederPonteiro();
                return new Token(TipoToken.OPRelMaior, ldat.GetLexema());
            }
        }else{
            return null;
        }
    }

    private Token Parenteses()
    {
        int charactereLido = ldat.LerProximoCaractere();
        char c = (char)charactereLido;

        if(c == '(') {
            return new Token(TipoToken.AbrePar, ldat.GetLexema());
        }else if (c == ')'){
            return new Token(TipoToken.FechaPar, ldat.GetLexema());
        }else{
            return null;
        }
    }

    private Token Numeros()
    {
        int estado = 1;

        while (true)
        {
            char c = (char)ldat.LerProximoCaractere();

            if(estado == 1)
            {
                if(Character.isDigit(c)) estado = 2;
                else return null;
            }
            else if(estado == 2)
            {
                if(c == '.')
                {
                    c = (char) ldat.LerProximoCaractere();

                    if(Character.isDigit(c)) estado = 3;
                    else return null;
                }
                else if(!Character.isDigit(c))
                {
                    ldat.RetrocederPonteiro();
                    return new Token(TipoToken.NumInt, ldat.GetLexema());
                }
            }
            else if(estado == 3)
            {
                if(!Character.isDigit(c))
                {
                    ldat.RetrocederPonteiro();
                    return new Token(TipoToken.NumReal, ldat.GetLexema());
                }
            }
        }
    }

    private Token Variavel()
    {
        int estado = 1;

        while (true)
        {
            char c = (char)ldat.LerProximoCaractere();

            if(estado == 1)
            {
                if(Character.isLetter(c)) estado = 2;
                else return null;
            }
            else if(estado == 2)
            {
                if(!Character.isLetterOrDigit(c))
                {
                    ldat.RetrocederPonteiro();
                    return new Token(TipoToken.Var, ldat.GetLexema());
                }
            }
        }
    }

    private Token Cadeia()
    {
        int estado = 1;

        while (true) {
            char c = (char) ldat.LerProximoCaractere();

            if (estado == 1)
            {
                if(c == '\'') estado = 2;
                else return null;
            }
            else if(estado == 2)
            {
                if(c == '\n') return null;
                if(c == '\'') return new Token(TipoToken.Cadeia, ldat.GetLexema());
                else if(c=='\\') estado = 3;
            }
            else if(estado == 3)
            {
                if(c=='\n') return null;
                else estado = 2;
            }
        }
    }

    private Token EspacosEComentarios()
    {
        return null;
    }

    private Token PalavrasChave()
    {
        return null;
    }

    private Token Fim()
    {
        int charactereLido = ldat.LerProximoCaractere();

        if(charactereLido == -1) return new Token(TipoToken.Fim, "Fim");

        return null;
    }
}
