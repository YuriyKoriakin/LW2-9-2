package com.brainacad.oop.teststring2;

/**
 * Created by Yuriy on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "TomCat";//In method main() declare two local variables “myStr1” and “myStr2” of string
        String unicStr = "";
     // type and assign a value “Cartoon” for first string and ”Tomcat” for second.
        StringBuilder unicLetters = new StringBuilder();
        // Write cod to display all of the letters, which are present in the first word, but absent in the second.
        char[] arr1 = myStr1.toCharArray();
        char[] arr2 = myStr2.toCharArray();
        for(char element1 : arr1){
            boolean uniq = true;
            for (char element2 : arr2){
                if(element1 == element2){
                    uniq = false;
                    break;
                }
            }
            if(uniq){
                unicLetters.append(element1);
            }
        }
        System.out.println(unicLetters);
    }
}