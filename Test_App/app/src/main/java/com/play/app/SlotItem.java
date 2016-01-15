package com.play.app;

/**
 * Created by Accolite- on 1/13/2016.
 */
public class SlotItem {

    SlotItem(String slot1,String slot2, boolean slot1Booked, boolean slot2Booked, boolean slot1Selected, boolean slot2Selected)
    {
        this.slot1=slot1;
        this.slot2=slot2;
        this.slot1Booked=slot1Booked;
        this.slot2Booked=slot2Booked;
        this.slot1Selected=slot1Selected;
        this.slot2Selected=slot2Selected;
        this.slot1Time=SlotsUtils.getInstance().getSlotTime(Integer.parseInt(slot1));
        this.slot2Time=SlotsUtils.getInstance().getSlotTime(Integer.parseInt(slot2));
    }

    SlotItem(){

    }

    private String slot1;

    private String slot2;

    private String slot1Time;

    private String slot2Time;

    private boolean slot1Booked;

    private boolean slot2Booked;

    private boolean slot1Selected;

    private boolean slot2Selected;


    public boolean isSlot1Booked() {
        return slot1Booked;
    }

    public void setSlot1Booked(boolean slot1Booked) {
        this.slot1Booked = slot1Booked;
    }

    public boolean isSlot2Booked() {
        return slot2Booked;
    }

    public void setSlot2Booked(boolean slot2Booked) {
        this.slot2Booked = slot2Booked;
    }

    public boolean isSlot1Selected() {
        return slot1Selected;
    }

    public void setSlot1Selected(boolean slot1Selected) {
        this.slot1Selected = slot1Selected;
    }

    public boolean isSlot2Selected() {
        return slot2Selected;
    }

    public void setSlot2Selected(boolean slot2Selected) {
        this.slot2Selected = slot2Selected;
    }

    public String getSlot1() {
        return slot1;
    }

    public void setSlot1(String slot1) {
        this.slot1 = slot1;
    }

    public String getSlot2() {
        return slot2;
    }

    public void setSlot2(String slot2) {
        this.slot2 = slot2;
    }
}
