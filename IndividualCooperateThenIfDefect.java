package pl.edu.pw.elka.prm2t.lab5;

import java.util.HashMap;

public class IndividualCooperateThenIfDefect extends Individual{

    private final HashMap<Long, Boolean> memory = new HashMap<>();

    @Override
    public boolean willCooperate(Individual other) {
        System.out.println(memory.getOrDefault(other.id, false));
        return memory.getOrDefault(other.id, true);
    }

    @Override
    protected void rememberInteraction(Individual other, boolean otherAction) {
        memory.put(other.id, otherAction);
    }

    @Override
    public String getName() {
        return asString();
    }

    public String asString(){
        return "LOLO";
    }
}
