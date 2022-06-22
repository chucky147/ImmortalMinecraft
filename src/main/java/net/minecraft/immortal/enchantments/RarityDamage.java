package net.minecraft.immortal.enchantments;

public enum RarityDamage {
    LEGENDARY (5.0f),
    EPIC (3.0f),
    RARE (1.8f),
    UNCOMMON (1.2f);

    private final float attackMultiplier;

    public float getAttackMultiplier() {
        return attackMultiplier;
    }

    RarityDamage(float attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
    }
}
