package com.play.app;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Accolite- on 1/13/2016.
 */
public class SlotsUtils {
    private static SlotsUtils slotsUtils;
    private HashMap <String,String> slotsMap;
    private SlotsUtils()
    {

    }
    public static SlotsUtils getInstance()
    {
        if(slotsUtils==null)
        {
            slotsUtils= new SlotsUtils();
            slotsUtils.setSlotsMap();
            return slotsUtils;
        }
        else
            return  slotsUtils;
    }
    public ArrayList<SlotItem> getSlotItemsList(ArrayList<Integer> bookedList, int openHour,int closeHour)
    {   if(bookedList==null)
        return null;
        ArrayList<SlotItem> slotItemsList = new ArrayList<SlotItem>();
        for(int i=openHour;i<=closeHour;i+=2)
        {   boolean slot1Booked=false;
            boolean slot2Booked=false;
            if(bookedList.contains(i))
            slot1Booked=true;
            if(bookedList.contains(i+1))
            slot2Booked=true;
            SlotItem slotItem = new SlotItem(i+"",i+1+"",slot1Booked,slot2Booked,false,false);
            slotItemsList.add(slotItem);
        }
        return slotItemsList;
    }
    private void setSlotsMap()
    {
        slotsMap= new HashMap<String,String>();
        String am="AM";
        String pm="PM";
        String foreString=am;
        for(int i=0;i<48;i++)
        {
            if(i==24) {
                foreString=pm;
            }
                if(i%2==0){
                    slotsMap.put((i+1)+"",i/2+" "+foreString+" - "+i/2+":30 "+foreString);
                }
                else
                {
                    slotsMap.put((i+1)+"",(i)/2+":30 "+foreString+" - "+(i+1)/2+" "+foreString);
                }

        }
    }
    public String getSlotTime(int slot)
    {
        return slotsMap.get(slot+"");
    }
}
