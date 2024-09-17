package net.blay09.mods.hardcorerevival.config;

import com.google.common.collect.Lists;
import net.blay09.mods.balm.api.config.*;
import net.blay09.mods.hardcorerevival.HardcoreRevival;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Set;

@Config(HardcoreRevival.MOD_ID)
public class HardcoreRevivalConfigData implements BalmConfigData {

    @Comment("The time in ticks in which a player can still be rescued from death. 20 ticks are one second. Set to 0 to disable the timer.")
    @Synced
    public int ticksUntilDeath = 20 * 60 * 2;

    @Comment("If true, the timer until death continues even if the player logs out.")
    public boolean continueTimerWhileOffline = false;

    @Comment("The time in ticks it takes to rescue a player. 20 ticks are one second.")
    @Synced
    public int rescueActionTicks = 40;

    @Comment("The amount of health to respawn with when a player was rescued, out of 20.")
    public int rescueRespawnHealth = 1;

    @Comment("The food level to respawn with when a player was rescued, out of 20.")
    public int rescueRespawnFoodLevel = 5;

    @ExpectedType(String.class)
    @Comment("Effects applied to a player when rescued, in the format \"effect|duration|amplifier\"")
    public List<String> rescueRespawnEffects = Lists.newArrayList("minecraft:hunger|600|0", "minecraft:weakness|1200|0");

    @Comment("The distance at which a player can rescue another.")
    @Synced
    public double rescueDistance = 5;

    @Comment("If true, knocked out players will glow, making them visible through blocks.")
    public boolean glowOnKnockout = true;

    @Comment("If true, knocked out players are still able to punch nearby enemies.")
    @Synced
    public boolean allowUnarmedMelee = false;

    @Comment("If true, knocked out players are still able to fire bows.")
    @Synced
    public boolean allowBows = false;

    @Comment("If true, knocked out players are still able to fire pistols from Mr Crayfish's Gun Mod.")
    @Synced
    public boolean allowPistols = false;

    @Comment("Set to false to remove the Accept your Fate button and force players to wait out the timer.")
    @Synced
    public boolean allowAcceptingFate = true;

    @Comment("If true, Hardcore Revival will not be active in singleplayer.")
    public boolean disableInSingleplayer = false;

    @Comment("If true, Hardcore Revival will not be active when playing alone in multiplayer.")
    public boolean disableInLonelyMultiplayer = false;

    @Comment("The damage sources that kill a player instantly, without a K.O. period.")
    @ExpectedType(ResourceLocation.class)
    public Set<ResourceLocation> instantDeathSources = Set.of(new ResourceLocation("lava"));
}
