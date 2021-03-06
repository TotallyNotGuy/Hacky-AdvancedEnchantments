package me.egg82.ae.api.enchantments;

import java.util.UUID;
import me.egg82.ae.api.AdvancedEnchantment;
import me.egg82.ae.api.AdvancedEnchantmentTarget;

public class AerialEnchantment extends AdvancedEnchantment {
    public AerialEnchantment() {
        super(UUID.randomUUID(), "aerial", "Aerial", false, 1, 5);
        targets.add(AdvancedEnchantmentTarget.WEAPON);
        conflicts.add(AdvancedEnchantment.CHARGING);
    }
}
