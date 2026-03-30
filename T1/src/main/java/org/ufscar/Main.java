package org.ufscar;

public class Main
{
    public static void main(String[] args)
    {
        AlgumaLexico lex = new AlgumaLexico(args[0]);

        Token t = null;

        while ((t = lex.ProximoToken()) != null)
        {
            System.out.print(t);
        }
    }
}