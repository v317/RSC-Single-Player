package org.nemotech.rsc.external.definition.extra;

public class ItemUnIdentHerbDef {
    
    /**
     * How much experience identifying gives
     */
    public int exp;
    /**
     * The id of the herb this turns into
     */
    private int newId;
    /**
     * Herblaw level required to identify
     */
    public int requiredLvl;

    public int getExp() {
        return exp;
    }

    public int getLevelRequired() {
        return requiredLvl;
    }

    public int getNewId() {
        return newId;
    }

}