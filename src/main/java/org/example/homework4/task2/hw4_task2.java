package org.example.homework4.task2;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
public class hw4_task2 {
    public static void main(String[] args) {
    //String s = "()[]{}";
    //String s = "()";
    //String s = "(]";
    String s = "((){[]})";

    System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        boolean validity = true;

        if (s.length() % 2 != 0){//проверка, что все скобки теоретически парные
            validity = false;
        }

        else {
            String[] tempSymb = s.split("");
            ArrayList<String> symbols = new ArrayList<String>(Arrays.asList(tempSymb));
            //System.out.println("initial: " + symbols);

            while (symbols.size() >= 1 && validity == true) {
                if (symbols.get(0).equals("}") || symbols.get(0).equals(")") || symbols.get(0).equals("]")) {
                    validity = false;
                }

                if (symbols.get(0).equals("(")){
                    int position = symbols.size() - 1;
                    boolean found = false;
                    while (position > 0 && found == false){
                        if (symbols.get(position).equals(")")){
                            symbols.remove(position);
                            symbols.remove(0);
                            found = true;
                        }
                        position--;
                    }
                    if (found == false){
                        validity = false;
                    }
                } else if (symbols.get(0).equals("{")) {
                    int position = symbols.size() - 1;
                    boolean found = false;
                    while (position > 0 && found == false){
                        if (symbols.get(position).equals("}")){
                            symbols.remove(position);
                            symbols.remove(0);
                            found = true;
                        }
                        position--;
                    }
                    if (found == false){
                        validity = false;
                    }
                } else if (symbols.get(0).equals("[")) {
                    int position = symbols.size() - 1;
                    boolean found = false;
                    while (position > 0 && found == false){
                        if (symbols.get(position).equals("]")){
                            symbols.remove(position);
                            symbols.remove(0);
                            found = true;
                        }
                        position--;
                    }
                    if (found == false){
                        validity = false;
                    }
                }
                //System.out.println(symbols);
                //System.out.println(validity);
            }
        }

        return validity;
    }
}
