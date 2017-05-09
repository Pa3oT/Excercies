package main.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
    public void findDuplicateChars(String str){

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        for(Character ch : dupMap.keySet()){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }

    public boolean isDublicateChar(String string) {
        if(string.length() > 256) {
            return true;
        }

        boolean[] booleans = new boolean[256];
        for(int i = 0; i < string.length(); i ++) {
            int value = string.charAt(i);
            if(booleans[value]) {
                return true;
            }
            booleans[value] = true;
        }
        return false;
    }

    public static void main(String a[]){
        DuplicateCharInString dcs = new DuplicateCharInString();
        dcs.findDuplicateChars("Java2Novice");
        System.out.println(dcs.isDublicateChar("oNovice"));
    }
}
