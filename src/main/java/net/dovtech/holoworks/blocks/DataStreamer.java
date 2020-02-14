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
        switch(systemType) {
		    case REACTOR: {break;}
		    case REACTOR_CHAMBER: {break;}
		    case SHIELD_RECHARGE: {break;}
		    case SHIELD_CAPACITY: {break;}
		    case WEAPON_COMPUTER: {break;}
		    case THRUSTER: {break;}
		    case AI_MODULE: {
		        Entity target = controllingEntity.getAI().getCurrentTarget();
		        return (target == null)? "No Target" : ("SPEED: " + target.getSpeed());
		    }
		    default: return null;
        }
    }
}
