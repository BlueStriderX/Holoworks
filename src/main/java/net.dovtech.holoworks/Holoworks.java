package net.dovtech.holoworks;

import api.DebugFile;
import api.mod.StarMod;

public class Holoworks extends StarMod {
    static Holoworks inst;
    public Holoworks() {
        inst = this;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.modName = "Holoworks";
        DebugFile.log("Enabled.", this);
    }
}