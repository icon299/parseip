/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseip;

import java.util.regex.Pattern;

/**
 *
 * @author d.sinyatkin
 */
public class ParseIP {

    private static String parseStr = "(?<!\\d|\\d\\.)" +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])" +
            "(?!\\d|\\.\\d)";

    private Pattern myPattern;
    
    public Pattern getMyPattern() {
        return myPattern;
    }
    public void setMyPattern(Pattern myPattern) {
        this.myPattern = myPattern;
    }

    public Pattern doPattern(){
        setMyPattern(Pattern.compile(parseStr));
        return getMyPattern();
    }
}
