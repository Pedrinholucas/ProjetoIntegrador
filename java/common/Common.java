/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author pedro
 */
public class Common {
    public static boolean isInteger(String s) {
    if(s.isEmpty()) return false;
    for(int i = 0; i < s.length(); i++) {
        if(i == 0 && s.charAt(i) == '-') {
            if(s.length() == 1) return false;
            else continue;
        }
         System.out.println(Character.digit(s.charAt(i),10));
        if(Character.digit(s.charAt(i),10) < 0) return false;
    }
    return true;
    }
    public static void main(String[] args) {                
    }
}
