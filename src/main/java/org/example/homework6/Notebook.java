package org.example.homework6;

import java.util.HashMap;
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
                    if(!mark.equals(entry.getValue())){
                        match = false;
                    }
                    break;
                case 2:
                    if(!manufacturer.equals(entry.getValue())){
                        match = false;
                    }
                    break;
                case 3:
                    if(!cpu.equals(entry.getValue())){
                        match = false;
                    }
                    break;
                case 4:
                    if(ram < Integer.valueOf(entry.getValue())){
                        match = false;
                    }
                    break;
                case 5:
                    if(hddVolume < Integer.valueOf(entry.getValue())){
                        match = false;
                    }
                    break;
                case 6:
                    if(!color.equals(entry.getValue())){
                        match = false;
                    }
                    break;
            }
        }
        return match;
    }
}
