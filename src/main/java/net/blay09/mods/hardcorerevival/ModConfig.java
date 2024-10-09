package net.blay09.mods.hardcorerevival;

import net.minecraftforge.common.config.Config;

@Config(modid = HardcoreRevival.MOD_ID)
@Config.LangKey("config.hardcorerevival")
public class ModConfig {

	@Config.Name("Max Death Ticks")
	@Config.Comment("The time in ticks in which a player can still be rescued from death.")
	@Config.LangKey("config.hardcorerevival.maxDeathTicks")
	public static int maxDeathTicks = 20 * 60 * 2;

	@Config.Name("Rescue Respawn Health")
	@Config.Comment("The amount of health to respawn with when a player was rescued, out of 20.")
	@Config.LangKey("config.hardcorerevival.rescueRespawnHealth")
	public static int rescueRespawnHealth = 1;

	@Config.Name("Rescue Respawn Food Level")
	@Config.Comment("The food level to respawn with when a player was rescued, out of 20.")
	@Config.LangKey("config.hardcorerevival.rescueRespawnFoodLevel")
	public static int rescueRespawnFoodLevel = 5;

	@Config.Name("Team Up Compatibility")
	@Config.Comment("This makes Team Up's chat features work on the death screen as well.")
	@Config.LangKey("config.hardcorerevival.teamUpIntegration")
	public static boolean teamUpIntegration = true;

	@Config.Name("Ping Compatibility")
	@Config.Comment("This adds a 'Send Ping' button to the death screen.")
	@Config.LangKey("config.hardcorerevival.pingIntegration")
	public static boolean pingIntegration = true;

	@Config.Name("Send Ping on Death")
	@Config.Comment("Requires Ping Compatibility to be enabled. Automatically sends a ping upon your death.")
	@Config.LangKey("config.hardcorerevival.autoPingOnDeath")
	public static boolean autoPingOnDeath = true;

	@Config.Name("Max Rescue Distance")
	@Config.Comment("The distance at which a player can rescue another.")
	@Config.LangKey("config.hardcorerevival.maxRescueDist")
	public static float maxRescueDist = 5f;

	@Config.Name("Rescue Ticks")
	@Config.Comment("The time in ticks it takes to rescue a player.")
	@Config.LangKey("config.hardcorerevival.rescueTime")
	public static int rescueTime = 40;

	@Config.Name("Glow on Death")
	@Config.Comment("If true, knocked out players will glow, making them visible through blocks.")
	@Config.LangKey("config.hardcorerevival.glowOnDeath")
	public static boolean glowOnDeath = true;

	@Config.Name("Hardcore Only")
	@Config.Comment("Mod only does things when the current world has hardcore enabled.")
	public static boolean hardcoreOnly = true;

	// These would be cool but they'd require coremod hacks and it's not worth it:

//	@Config.Name("Allow Unarmed Melee when knocked out")
//	@Config.Comment("Whether knocked out players can still perform unarmed melee attacks.")
//	public static boolean allowUnarmedMelee = true;
//
//	@Config.Name("Allow Bows when knocked out")
//	@Config.Comment("Whether knocked out players can still fire arrows.")
//	public static boolean allowBows = true;
}
