/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author d.sinyatkin
 */
/**
 * 
 * 
 * 
 * 
 * метод getPairWithIP получает массив строк, из которых выбирает строки,
 * содержащие IP-адреса, разбивает такие строки на пары - IP и все, что идет в
 * строке за этим IP и возвращает HashMap, заполненный такими парами
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class ParseIP {
    
    public Map<String,String> getPairWithIP(String inStr){
        
        String[] lines = inStr.split("\n"); // разбиваем построчно
        
        Map<String,String> mapIP = new HashMap<String, String>();
        
        Pattern patternIP = Pattern.compile(   //шаблон для поиска в строке IP-адреса 
            "(?<!\\d|\\d\\.)" +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])" +
            "(?!\\d|\\.\\d)");
        
        for (String line : lines) {
            
            Matcher m = patternIP.matcher(line);
            String findIP = m.find() ? m.group(): null;
            
            if ((findIP != null) && (checkIP(findIP))) {
                String sParams = line.substring(line.indexOf(findIP)+findIP.length()).trim();
                mapIP.put(findIP, sParams);// загоняем в HashMap;
                System.out.println(findIP+ " " + sParams);
            }

        }
        return mapIP;
    }

    public String[] splitInputToLines(String inStr ){
        String[] lines = inStr.split("\n"); // разбиваем построчно
        return lines;
    }
    
    public boolean checkIP(String ipForCheck){
        //проверяем - может залез какой-нибудь левый IP 
        return Boolean.TRUE;
    }
    
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map <String,String> mapIpWithParams = new HashMap<String,String>();
        ParseIP app = new ParseIP();
        String inputStr = " fgfg      \n    "
                                                    + "        192.168.101.122 INIT PVM\n     123.123.123.123 fgfdghffggfg\n dsfsdfdsfsdfds";
        mapIpWithParams = app.getPairWithIP(inputStr);
    }
    
}
