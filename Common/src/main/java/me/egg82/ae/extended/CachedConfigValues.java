package me.egg82.ae.extended;

import java.util.Locale;

public class CachedConfigValues {

    private CachedConfigValues() {}

    private boolean debug = false;
    public boolean getDebug() { return debug; }

    private boolean reWeight = false;
    public boolean getReWeight() { return reWeight; }

    private boolean noPreview = false;
    public boolean getNoPreview() { return noPreview; }

    private Locale language = Locale.US;
    public Locale getLanguage() { return language; }

    private double enchantChance = 0.0d;
    public double getEnchantChance() { return enchantChance; }

    private double curseChance = 0.0d;
    public double getCurseChance() { return curseChance; }

    private boolean bypassUnbreaking = true;
    public boolean getBypassUnbreaking() { return bypassUnbreaking; }

    private boolean particles = true;
    public boolean getParticles() { return particles; }

    private double lootEnchantChance = 0.00045d;
    public double getLootEnchantChance() { return lootEnchantChance; }

    private double lootCurseChance = 0.00126;
    public double getLootCurseChance() { return lootCurseChance; }

    public static CachedConfigValues.Builder builder() { return new CachedConfigValues.Builder(); }

    public static class Builder {
        private final CachedConfigValues values = new CachedConfigValues();

        private Builder() {}

        public CachedConfigValues.Builder debug(boolean value) {
            values.debug = value;
            return this;
        }

        public CachedConfigValues.Builder reWeight(boolean value) {
            values.reWeight = value;
            return this;
        }

        public CachedConfigValues.Builder noPreview(boolean value) {
            values.noPreview = value;
            return this;
        }

        public CachedConfigValues.Builder language(Locale value) {
            values.language = value;
            return this;
        }

        public CachedConfigValues.Builder enchantChance(double value) {
            values.enchantChance = value;
            return this;
        }

        public CachedConfigValues.Builder curseChance(double value) {
            values.curseChance = value;
            return this;
        }

        public CachedConfigValues.Builder bypassUnbreaking(boolean value) {
            values.bypassUnbreaking = value;
            return this;
        }

        public CachedConfigValues.Builder particles(boolean value) {
            values.particles = value;
            return this;
        }

        public CachedConfigValues.Builder lootEnchantChance(double value) {
            values.lootEnchantChance = value;
            return this;
        }

        public CachedConfigValues.Builder lootCurseChance(double value) {
            values.lootCurseChance = value;
            return this;
        }

        public CachedConfigValues build() { return values; }
    }
}
