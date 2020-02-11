package net.dovtech.holoworks.blocks;

import api.element.block.Block;
import api.listener.type.ServerListener;
import org.schema.game.client.controller.manager.ingame.PlayerGameControlManager;
import org.schema.game.client.controller.manager.ingame.structurecontrol.StructureControllerManager;
import org.schema.game.client.data.PlayerControllable;
import org.schema.game.common.controller.PlayerUsableInterface;
import org.schema.game.common.data.player.ControllerStateUnit;
import org.schema.game.common.data.player.PlayerCharacter;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.common.data.world.SimpleTransformableSendableObject;
import org.schema.game.server.data.element.ServerWorld;
import org.schema.schine.ai.AiEntityStateInterface;
import org.schema.schine.network.objects.NetworkEntity;
import org.schema.schine.network.server.ServerController;

public class DataStreamer extends Block {
    private enum systemEnum {
        REACTOR,
        REACTOR_CHAMBER,
        SHIELD_RECHARGE,
        SHIELD_CAPACITY,
        WEAPON_COMPUTER,
    }
    private systemEnum systemType;

    public DataStreamer() {
        super(3301, "DATA_STREAMER");
    }

    @ServerListener
    public void onPlaceBlock(PlayerState player, Block block) {
        if(block.getID() == this.getID()) {

        }
    }
}
