package main.strings;

import java.util.ArrayList;

public class Parser {
    String inputString = "(zzzz (аааа \"bbbb1 bbbb2\" (ccccc \"dddd1 dddd2\" (eeeee)) ffff (gggg hhhh) iiiii jjjj))";
    String commandLine;
    int pos;

    public Parser(String in,String com){
        this.inputString=in;
        this.commandLine=com;
        this.pos=0;
    }

    public String parse() {
        return getDevicesList().toString();
    }

    private ArrayList getDevicesList() {
        ArrayList result=getBracketBlock();
        return result;
    }

    private ArrayList getBracketBlock() {
        ArrayList buffer = new ArrayList();
        String token = "";
        Boolean IS_STRING = false;
        char [] chr = this.inputString.toCharArray();
        while( pos<inputString.length()-1) {

            if(chr[pos]==' ' && !IS_STRING) {
                if(!token.equals("") && !token.equals(" ") && !token.equals("  ")) {
                    buffer.add(token.trim());
                    token="";
                    pos++;
                    continue;
                }
            }
            if(chr[pos]==')' && !IS_STRING) {
                if(!token.equals("") && !token.equals(" ")) buffer.add(token);
                break;
            }
            if(chr[pos]=='(') {
                pos++;
                buffer.add(getBracketBlock());
                pos++;
                continue;
            }
            if(chr[pos]=='\"') IS_STRING=!IS_STRING;

            token+=chr[pos];
            pos++;
        }
        return buffer;
    }
}
