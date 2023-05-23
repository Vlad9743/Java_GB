package org.example.homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Notebook {
    String mark;
    String manufacturer;
    String cpu;
    Integer ram;
    Integer hddVolume;
    String color;


    public Notebook() {
    }

    public Notebook(String mark, String manufacturer, String cpu, int ram, int hddVolume, String color) {
        this.mark = mark;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.ram = ram;
        this.hddVolume = hddVolume;
        this.color = color;
    }


    @Override
    public String toString() {
        return  mark + " |      " +
                manufacturer + "      | " +
                cpu + " | " +
                ram + " | " +
                hddVolume + " | " +
                color;
    }

    public boolean matchChecker(HashMap<Integer, String> filter){
        boolean match = true;
        for(Map.Entry<Integer, String> entry : filter.entrySet()){
            String matchField = "";
            switch (entry.getKey()){
                case 1:
                    //matchField = mark;
                    if(!mark.equals(entry.getValue())){
                        match = false;
                    }
                    break;
                case 2:
                    //matchField = manufacturer;
                    if(!manufacturer.equals(entry.getValue())){
                        match = false;
                    }
                    break;
                case 3:
                    //matchField = cpu;
                    if(!cpu.equals(entry.getValue())){
                        match = false;
                    }
                    break;
                case 4:
                    //matchField = ram.toString();
                    if(ram < Integer.valueOf(entry.getValue())){
                        match = false;
                    }
                    break;
                case 5:
                    //matchField = hddVolume.toString();
                    if(hddVolume < Integer.valueOf(entry.getValue())){
                        match = false;
                    }
                    break;
                case 6:
                    matchField = color;
                    break;
            }
            //if(!matchField.equals(entry.getValue()))
              //  match = false;

        }
        return match;
    }
}
