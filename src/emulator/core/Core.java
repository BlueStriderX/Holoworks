package emulator.core;

class Instance {
    public bool remove = false;
}

class CoreTools {
    public int createInstance() { //used to create an emulation instance when a program is executed in a microcontroller block
        int ID = 0;

        return ID;
    }

    public void removeInstance(int ID) { //removes an instance after it finishes execution (hlt marks it as finished)
        //
    }
}

public class Core {
    public void init() {
        //
    }

    public void update() {
        //
    }
    
    public CoreTools tools = new CoreTools();
}
