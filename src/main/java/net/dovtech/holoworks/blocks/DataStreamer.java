package net.dovtech.holoworks.blocks;

import api.element.block.Block;
import api.entity.Entity;

public class DataStreamer extends Block {
    private enum system {
        REACTOR,
        REACTOR_CHAMBER,
        SHIELD_RECHARGE,
        SHIELD_CAPACITY,
        WEAPON_COMPUTER,
        THRUSTER,
        AI_MODULE
    }
    private system systemType;

    public DataStreamer() {
        super(3301, "DATA_STREAMER");
    }

    //Todo:Figure out how to detect if the block is placed and what blocks are next to it.

    public String readData(Entity controllingEntity) {
        String dataString = null;
        
        //How about...
        
        /* switch(systemType) {
		    case REACTOR: {break;}
		    case REACTOR_CHAMBER: {break;}
		    case SHIELD_RECHARGE: {break;}
		    case SHIELD_CAPACITY: {break;}
		    case WEAPON_COMPUTER: {break;}
		    case THRUSTER: {break;}
		    case AI_MODULE: {
		        Entity target = controllingEntity.getAI().getCurrentTarget();
		        return (target == null)? "No Target" : ("SPEED: " + target.getSpeed()); //Ternary operators are great
		    }
		    default: return null;
        } */
        
        //That eliminates the need for the string but no code will be executed afterwards if all cases have a return
        //Also, removing the breaks allows the next case to be checked
        //I'm not sure if the if/else will be faster, but there shouldn't be much of a difference
        //ps objects returned by functions can be directly accessed, but it can look ugly in some cases

        if(systemType == system.REACTOR) {

        } else if(systemType == system.REACTOR_CHAMBER) {

        } else if(systemType == system.SHIELD_RECHARGE) {

        } else if(systemType == system.SHIELD_CAPACITY) {

        } else if(systemType == system.WEAPON_COMPUTER) {

        } else if(systemType == system.THRUSTER) {

        } else if(systemType == system.AI_MODULE) {
            EntityAI ai = controllingEntity.getAI();
            Entity target = ai.getCurrentTarget();
            if(target == null) {
                dataString = "No Target";
            } else {
                dataString = "SPEED: " + target.getSpeed();
            }
        }

        return dataString;
    }
}
