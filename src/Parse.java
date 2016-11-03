
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d.sinyatkin
 */
public class Parse {
    
    private Pattern myPattern;
    
    public Pattern getMyPattern() {
        return myPattern;
    }
    public void setMyPattern(Pattern myPattern) {
        this.myPattern = myPattern;
    }
        
    public Pattern compilePattern(String pattern){
        setMyPattern(Pattern.compile(pattern));
        return getMyPattern();
    }

    
    public String doMatcher(String line){
        Matcher m = getMyPattern().matcher(line);
     //   return = m.find() ? m.group(): null;
     return "";
    }
    
}
