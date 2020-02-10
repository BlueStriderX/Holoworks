package net.dovtech.holoworks.blocks;

import api.element.Recipe;
import api.element.block.Block;

public class DataStreamer extends Block {
    public DataStreamer() {
        super(3301, "DATA_STREAMER");

        //Recipe Stuff
        Recipe recipe = new Recipe();
        recipe.setIngredients();
        this.setRecipe();
    }


}
