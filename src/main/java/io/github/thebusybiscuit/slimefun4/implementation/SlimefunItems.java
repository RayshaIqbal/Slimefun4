package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /*		 Items 		*/
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack(
            "PORTABLE_CRAFTER",
            HeadTexture.PORTABLE_CRAFTER,
            "&6Portable workbench",
            "&a&o一portable workbench",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack(
            "PORTABLE_DUSTBIN", HeadTexture.TRASH_CAN, "&6Portable trash can", "&rEasily eliminate excess items", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack(
            "ENDER_BACKPACK", HeadTexture.ENDER_BACKPACK, "&6Ender Backpack", "&a&oPortable ender chest", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack(
            "MAGIC_EYE_OF_ENDER", Material.ENDER_EYE, "&6&lEye of Magical Ender", "&4&lRequires full set of Ender Armor", "", "&7&eRight click &7 to shoot an ender pearl");
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack(
            "BROKEN_SPAWNER", Material.SPAWNER, "&cDamaged monster spawner", "&7Type: &b<Type>", "", "&cDamaged, needs to be repaired in ancient altar");
    public static final SlimefunItemStack REPAIRED_SPAWNER =
            new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "&bRepaired monster spawner", "&7Type: &b<type>");
    public static final SlimefunItemStack INFERNAL_BONEMEAL =
            new SlimefunItemStack("INFERNAL_BONEMEAL", Material.BONE_MEAL, "&4Hell bone meal", "", "&cAccelerates the growth rate of nether warts");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack(
            "TAPE_MEASURE",
            "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65",
            "&6tape measure",
            "",
            "&eShift + Right click &7Set measurement starting point",
            "&eRight click &7Measure distance");

    /*		 Gadgets 		*/
    public static final SlimefunItemStack GOLD_PAN =
            new SlimefunItemStack("GOLD_PAN", Material.BOWL, "&6 gold pan", "&a&oVarious minerals can be obtained", "", "&7&eRight click&7 to pan for gold in the gravel");
    public static final SlimefunItemStack NETHER_GOLD_PAN =
            new SlimefunItemStack("NETHER_GOLD_PAN", Material.BOWL, "&4Nether Gold Plate", "", "&7&eRight click&7 to pan for gold from the soul sand");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack(
            "PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&r&lparachute", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack GRAPPLING_HOOK =
            new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "&6抓钩", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SOLAR_HELMET =
            new SlimefunItemStack("SOLAR_HELMET", Material.IRON_HELMET, "&bsolar helmet", "", "&a&oCharge items and equipment you're holding");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&b布");
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack(
            "REINFORCED_CLOTH", Material.PAPER, "&bReinforced fabric", "", "&fThis kind of cloth, after being reinforced with lead", "&f, can prevent you from the negative effects of radiation.");
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack("CAN", HeadTexture.TIN_CAN, "&rtin can");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack(
            "NIGHT_VISION_GOGGLES", Material.LEATHER_HELMET, Color.BLACK, "&anight vision glasses", "", "&9+night vision effect");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack(
            "ELYTRA_CAP", Material.LEATHER_HELMET, Color.PURPLE, "&5 elytra cap", "", "&7 enables you to fly with elytra", "&7Will not fall down and turn into meat paste");
    public static final SlimefunItemStack FARMER_SHOES =
            new SlimefunItemStack("FARMER_SHOES", Material.LEATHER_BOOTS, Color.YELLOW, "&efarmer's boots", "", "&6&o can prevent you from trampling on farmland");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack(
            "INFUSED_MAGNET",
            HeadTexture.MAGNET,
            "&amagnet",
            "",
            "&rMagnets infused with magic",
            "&rAbility to move nearby items",
            "&rPut it in your backpack",
            "",
            "&7Hold &eShift&7 to absorb surrounding items");
    public static final SlimefunItemStack RAG = new SlimefunItemStack(
            "RAG",
            Material.PAPER,
            "&crag",
            "",
            "&aLevel 1 Medical Supply",
            "",
            "&r restores 2 points of blood volume",
            "&rCan extinguish the fire on the body",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack(
            "BANDAGE",
            Material.PAPER,
            "&c bandage",
            "",
            "&A2 level medical supplies",
            "",
            "&rRestore 4 points of blood volume",
            "&rCan extinguish the fire on the body",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack(
            "SPLINT", Material.STICK, "&cSplint", "", "&a1grade medical supply", "", "&rRestore 2 HP points", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack(
            "VITAMINS",
            Material.NETHER_WART,
            "&cvitamin",
            "",
            "&a3grade medical supply",
            "",
            "&rRestore 4 points of blood volume",
            "&rCan extinguish the fire on the body",
            "&rCure the negative effects of poison/wither/radiation",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack(
            "MEDICINE",
            Material.POTION,
            Color.RED,
            "&cdrugs",
            "",
            "&aLevel 3 Medical Supply",
            "",
            "&rRestore 4 points of blood volume",
            "&r can extinguish the fire in the body",
            "&rCure the negative effects of poison/wither/radiation",
            "",
            "&7&eright click&7 drink");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS =
                new SlimefunItemStack("MAGICAL_ZOMBIE_PILLS", Material.NETHER_WART, "&6Resurrection Pill", "", "&eright-click to instantly cure &7zombie villagers/piglins");

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FLASK_OF_KNOWLEDGE", Material.GLASS_BOTTLE, "&cBottle of Knowledge", "", "&rAllows you to store experience in a bottle", "&7Requires &a1 levels");
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE =
                new SlimefunItemStack("FILLED_FLASK_OF_KNOWLEDGE", Material.EXPERIENCE_BOTTLE, "&abottle of knowledge");
    /*		Backpacks		*/
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack(
            "SMALL_BACKPACK",
            HeadTexture.BACKPACK,
            "&esmall backpack",
            "",
            "&7 size: &e9",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack(
            "MEDIUM_BACKPACK",
            HeadTexture.BACKPACK,
            "&eOrdinary backpack",
            "",
            "&7Size: &e18",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack(
            "LARGE_BACKPACK",
            HeadTexture.BACKPACK,
            "&e medium backpack",
            "",
            "&7Size: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack(
            "WOVEN_BACKPACK",
            HeadTexture.BACKPACK,
            "&ewoven backpack",
            "",
            "&7Size: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack(
            "GILDED_BACKPACK",
            HeadTexture.BACKPACK,
            "&e gold-plated backpack",
            "",
            "&7size: &e45",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack(
            "RADIANT_BACKPACK",
            HeadTexture.BACKPACK,
            "&egleaming backpack",
            "",
            "&7Size: &e54 (large box)",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack(
            "BOUND_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "&cSoul-bound backpack",
            "",
            "&7size: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack COOLER = new SlimefunItemStack(
            "COOLER",
            HeadTexture.COOLER,
            "&bSmall freezer",
            "&rCan store juices and smoothies",
            "&rWhen the small freezer is in your inventory",
            "&rThe food inside will be consumed automatically when you are hungry",
            "",
            "&7size: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack(
            "RESTORED_BACKPACK",
            HeadTexture.RESTORED_BACKPACK,
            "&eBackpack Restorer",
            "",
            "&7Recover the items in your lost backpack",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
            
    /*		 Jetpacks		*/
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack(
            "DURALUMIN_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Electric Jetpack &7-&eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7thrust: &c0.35",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack(
            "SOLDER_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9electric jetpack &7- &eII",
            "",
            LoreBuilder.material("solder"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Thrust: &c0.4",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack(
            "BILLON_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9electric jetpack &7- &eIII",
            "",
            LoreBuilder.material("silver copper alloy"),
            LoreBuilder.powerCharged(0, 45),
            "&8\u21E8 &7thrust: &c0.45",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack(
            "STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9electric jetpack &7- &eIV",
            "",
            LoreBuilder.material("steel"),
            LoreBuilder.powerCharged(0, 60),
            "&8\u21E8 &7thrust: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9electric jetpack &7- &eV",
            "",
            LoreBuilder.material("damascus steel"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8&7Thrust: &c0.55",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9electric jetpack&7- &eVI",
            "",
            LoreBuilder.material("Reinforced alloy"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7 Thrust: &c0.6",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack(
            "CARBONADO_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.BLACK,
            "&9electric jetpack &7- &eVII",
            "",
            LoreBuilder.material("black diamond"),
            LoreBuilder.powerCharged(0, 150),
            "&8\u21E8 &7 thrust: &c0.7",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack(
            "ARMORED_JETPACK",
            Material.IRON_CHESTPLATE,
            "&9armored jetpack",
            LoreBuilder.material("steel"),
            "",
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7thrust: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Jetboots		*/
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack(
            "DURALUMIN_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9jet boots &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7speed: &a0.35",
            "&8\u21E8 &7Accuracy: &c50%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack(
            "SOLDER_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9jet boots &7- &eII",
            "",
            LoreBuilder.material("solder"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7speed: &a0.4",
            "&8\u21E8 &7Accuracy: &660%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack(
            "BILLON_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9jet boots &7- &eIII",
            "",
            LoreBuilder.material("silver copper alloy"),
            LoreBuilder.powerCharged(0, 40),
            "&8\u21E8 &7speed: &a0.45",
            "&8\u21E8 &7Accuracy: &665%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack(
            "STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9jet boots &7- &eIV",
            "",
            LoreBuilder.material("steel"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7 speed: &a0.5",
            "&8\u21E8 &7Accuracy: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9 jet boots&7- &eV",
            "",
            LoreBuilder.material("damascus steel"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7speed: &a0.55",
            "&8\u21E8 &7Accuracy: &a75%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9jet boots &7- &eVI",
            "",
            LoreBuilder.material("Reinforced alloy"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7speed: &a0.6",
            "&8\u21E8 &7Accuracy: &c80%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack(
            "CARBONADO_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "&9jet boots &7- &eVII",
            "",
            LoreBuilder.material("black diamond"),
            LoreBuilder.powerCharged(0, 125),
            "&8\u21E8 &7speed: &a0.7",
            "&8\u21E8 &7Accuracy: &c99.9%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack(
            "ARMORED_JETBOOTS",
            Material.IRON_BOOTS,
            "&9Armored jet boots",
            "",
            LoreBuilder.material("steel"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Speed: &a0.45",
            "&8\u21E8 &7Accuracy: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Multi Tools		*/
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack(
            "Duralumin multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack(
            "Solder multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eII",
            "",
            LoreBuilder.material("solder"),
            LoreBuilder.powerCharged(0, 30),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack(
            "Billon multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eIII",
            "",
            LoreBuilder.material("silver copper alloy"),
            LoreBuilder.powerCharged(0, 40),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack(
            "Steel multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eIV",
            "",
            LoreBuilder.material("steel"),
            LoreBuilder.powerCharged(0, 50),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack(
            "Damascus steel multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eV",
            "",
            LoreBuilder.material("damascus steel"),
            LoreBuilder.powerCharged(0, 60),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack(
            "Reinforced alloy multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eVI",
            "",
            LoreBuilder.material("Reinforced alloy"),
            LoreBuilder.powerCharged(0, 75),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack(
            "Carbonado multi tool",
            Material.SHEARS,
            "&9Multi-function tool &7-&eVII",
            "",
            LoreBuilder.material("black diamond"),
            LoreBuilder.powerCharged(0, 100),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Hold &eShift + right click&7 to change modes");

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /*		 Food 		*/
    public static final SlimefunItemStack FORTUNE_COOKIE =
            new SlimefunItemStack("Fortune cookie", Material.COOKIE, "&6fortune cookies", "", "&a&oTell you what will happen in the future :o");
    public static final SlimefunItemStack DIET_COOKIE =
            new SlimefunItemStack("Diet cookie", Material.COOKIE, "&6 slimming cookies", "", "&aA very&olight&r&a cookie");
    public static final SlimefunItemStack MAGIC_SUGAR =
            new SlimefunItemStack("Magic sugar", Material.SUGAR, "&6Magic Candy", "", "&a&oFeel the power of Hermes!");
    public static final SlimefunItemStack MONSTER_JERKY =
            new SlimefunItemStack("Monster jerky", Material.ROTTEN_FLESH, "&6Monster Jerky", "", "&a&oRefreshing and anti-hungry");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack(
            "Apple juice",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&capple juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack(
            "Melon juice",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cwatermelon juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack(
            "Carrot juice",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6 carrot juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack(
            "Pumpkin juice",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6pumpkin juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack(
            "Sweet berry juice",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cberry juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GLOW_BERRY_JUICE = new SlimefunItemStack(
            "Glow berry juice",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6 Glow Berry Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack(
            "Golden apple juice", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0), "&bGolden Apple Juice");

    public static final SlimefunItemStack BEEF_JERKY =
            new SlimefunItemStack("Beef jerky", Material.COOKED_BEEF, "&6Beef Jerky", "", "&rSweep away hunger!");
    public static final SlimefunItemStack PORK_JERKY =
            new SlimefunItemStack("Pork jerky", Material.COOKED_PORKCHOP, "&6Dried Pork", "", "&rSweep away hunger!");
    public static final SlimefunItemStack CHICKEN_JERKY =
            new SlimefunItemStack("Chicken jerky", Material.COOKED_CHICKEN, "&6Jerky chicken", "", "&rSweep away hunger!");
    public static final SlimefunItemStack MUTTON_JERKY =
            new SlimefunItemStack("Mutton's jerky", Material.COOKED_MUTTON, "&6Dried mutton", "", "&rSweep away hunger!");
    public static final SlimefunItemStack RABBIT_JERKY =
            new SlimefunItemStack("Rabbit jerky", Material.COOKED_RABBIT, "&6Rabbit jerky", "", "&rSweep away hunger!");
    public static final SlimefunItemStack FISH_JERKY =
            new SlimefunItemStack("Fish jerky", Material.COOKED_COD, "&6dried fish", "", "&rSweep away hunger!");
    public static final SlimefunItemStack KELP_COOKIE = new SlimefunItemStack("Kelp cookie", Material.COOKIE, "&2kelp cookies");

    /*		Christmas		*/
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack(
            "Christmas milk",
            Color.WHITE,
            new PotionEffect(PotionEffectType.SATURATION, 4, 0),
            "&6 a glass of milk",
            "",
            LoreBuilder.hunger(2.5));
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack(
            "Christmas chocolate milk",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 11, 0),
            "&6chocolate milk",
            "",
            LoreBuilder.hunger(3.5));
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack(
            "Christmas egg still",
            Color.GRAY,
            new PotionEffect(PotionEffectType.SATURATION, 6, 0),
            "&aEggnog",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack(
            "Christmas apple cider",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&ccider",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_COOKIE =
            new SlimefunItemStack("Christmas cookie", Material.COOKIE, ChatUtils.christmas("Christmas cookies"));
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE =
            new SlimefunItemStack("Christmas fruit cake", Material.PUMPKIN_PIE, ChatUtils.christmas("fruit cake"));
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE =
            new SlimefunItemStack("Christmas apple pie", Material.PUMPKIN_PIE, "&rApple Pie");
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack(
            "Christmas hot chocolate",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&6Hot cocoa",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_CAKE =
            new SlimefunItemStack("Christmas cake", Material.PUMPKIN_PIE, ChatUtils.christmas("Christmas cake"));
    public static final SlimefunItemStack CHRISTMAS_CARAMEL =
            new SlimefunItemStack("Christmas caramel", Material.BRICK, "&6 caramel");
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE =
            new SlimefunItemStack("Christmas caramel apple", Material.APPLE, "&6 caramel apples");
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE =
            new SlimefunItemStack("Christmas chocolate apple", Material.APPLE, "&6chocolate apples");
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack(
            "Christmas present",
            HeadTexture.CHRISTMAS_PRESENT,
            ChatUtils.christmas("christmas gift"),
            "&7Gift from &eTheBusyBiscuit &7",
            "&7Recipient: &eyou",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		Easter			*/
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack(
            "Easter egg", HeadTexture.EASTER_EGG, "&rEaster eggs", "&dHappy Easter! Open the gifts and take a look.", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack EASTER_CARROT_PIE =
            new SlimefunItemStack("Carrot pie", Material.PUMPKIN_PIE, "&6Carrot Pie");
    public static final SlimefunItemStack EASTER_APPLE_PIE =
            new SlimefunItemStack("Easter apple pie", Material.PUMPKIN_PIE, "&rApple Pie");

    /*		 Weapons 		*/
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK =
            new SlimefunItemStack("Grandmas walking stick", Material.STICK, "&7Grandma’s crutches");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK =
            new SlimefunItemStack("Grandpas walking stick", Material.STICK, "&7Grandpa’s crutch");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack(
            "Sword of beheading", Material.IRON_SWORD, "&6Sword of Execution", "&7Decapitation II", "", "&rHas a chance to cut off the head of a creature", "&r(increases the chance of dropping wither skulls)");
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack(
            "Blade of vampires", Material.GOLDEN_SWORD, "&cVampire Knife", "&7Life Stealing I", "", "&r45% chance when attacking", "Restores 2 health points to yourself");
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack(
            "Seismic axe", Material.IRON_AXE, "&a earthquake ax", "", "&7&oCreate an earthquake...", "", LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.SHARPNESS, 2);
    }

    /*		Bows		*/
    public static final SlimefunItemStack EXPLOSIVE_BOW =
            new SlimefunItemStack("Explosive bow", Material.BOW, "&cExplosive Bow", "&rIf you are hit by an arrow shot from the Explosive Bow, it will fly into the sky");
    public static final SlimefunItemStack ICY_BOW =
            new SlimefunItemStack("Icy bow", Material.BOW, "&bFrozen Bow", "&rHit by an arrow from this bow", "&rYou will be unable to move due to cold (within 2 seconds)");

    /*		 Tools		*/
    public static final SlimefunItemStack SMELTERS_PICKAXE =
            new SlimefunItemStack("Smelters pickaxe", Material.DIAMOND_PICKAXE, "&6Forge Pickaxe", "&c&lAutomatic smelting", "", "&9 has a luck effect when mining");
    public static final SlimefunItemStack LUMBER_AXE =
            new SlimefunItemStack("Lumber axe", Material.DIAMOND_AXE, "&6Lumberjack", "&a&oCut down the whole tree...");
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT =
            new SlimefunItemStack("Pickaxe of containment", Material.IRON_PICKAXE, "&cMonster Spawner Pickaxe", "", "&9can get the monster spawner");
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "Explosive pickaxe", Material.DIAMOND_PICKAXE, "&eExplosive Pickaxe", "", "&rMining minerals quickly with explosions", "", "&9Supports fortune enchantment");
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL =
            new SlimefunItemStack("Explosive shovel", Material.DIAMOND_SHOVEL, "&eExplosive shovel", "", "&rallows you to dig out a lot of blocks at once");
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack(
            "Pickaxe of the seeker",
            Material.DIAMOND_PICKAXE,
            "&aOre-hunting pickaxe",
            "&rWhen used, it will point out the minerals near you",
            "&rBut it might get damaged",
            "",
            "&7&eright-click&7 to search for minerals around");
    public static final SlimefunItemStack COBALT_PICKAXE =
            new SlimefunItemStack("Cobalt pickaxe", Material.IRON_PICKAXE, "&9Cobalt Pickaxe");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack(
            "Pickaxe of vein mining", Material.DIAMOND_PICKAXE, "&eOre Vein Pickaxe", "", "&rThis pickaxe will dig out", "&rThe minerals of the entire vein...");
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack(
            "Climbing pick", Material.IRON_PICKAXE, "&bClimbing pickaxe", "", "&f allows you to right-click", "&fClimb to the specified surface.", "&fAfter the enchantment efficiency, the climbing speed will increase");

    static {
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.EFFICIENCY, 6);
    }

    /*		 Armor 		*/
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack(
            "Glowstone helmet", Material.LEATHER_HELMET, Color.YELLOW, "&e&lfluorite helmet", "", "&a&o shine like the sun!", "", "&9+ night vision effect");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack(
            "Glowstone chestplate",
            Material.LEATHER_CHESTPLATE,
            Color.YELLOW,
            "&e&lFluorite Breastplate",
            "",
            "&a&o shine like the sun!",
            "",
            "&9+ night vision effect");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack(
            "Glowstone leggings",
            Material.LEATHER_LEGGINGS,
            Color.YELLOW,
            "&e&lFluorstone Leggings",
            "",
            "&a&o shine like the sun!",
            "",
            "&9+ night vision effect");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack(
            "Glowstone boots", Material.LEATHER_BOOTS, Color.YELLOW, "&e&lFluorstone boots", "", "&a&o shine like the sun!", "", "&9+ night vision effect");
    public static final SlimefunItemStack RAINBOW_LEATHER =
            new SlimefunItemStack("Rainbow leather", Material.RABBIT_HIDE, Color.FUCHSIA, "&drainbow leather", "", "&f is used to synthesize rainbow equipment");
    public static final SlimefunItemStack RAINBOW_HELMET = new SlimefunItemStack(
            "Rainbow helmet", Material.LEATHER_HELMET, Color.FUCHSIA, "&d&lRainbow Helmet", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CHESTPLATE = new SlimefunItemStack(
            "Rainbow chestplate", Material.LEATHER_CHESTPLATE, Color.FUCHSIA, "&d&lRainbow Breastplate", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_LEGGINGS = new SlimefunItemStack(
            "Rainbow leggings", Material.LEATHER_LEGGINGS, Color.FUCHSIA, "&d&lRainbow Leggings", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_BOOTS = new SlimefunItemStack(
            "Rainbow boots", Material.LEATHER_BOOTS, Color.FUCHSIA, "&d&lRainbow boots", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack(
            "Ends helmet", Material.LEATHER_HELMET, Color.fromRGB(28, 25, 112), "&5&lEnder Helmet", "", "&a&oMove anywhere");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack(
            "Ender chest plate", Material.LEATHER_CHESTPLATE, Color.fromRGB(28, 25, 112), "&5&lEnder Breastplate", "", "&a&oMove anywhere");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack(
            "Ender leggings", Material.LEATHER_LEGGINGS, Color.fromRGB(28, 25, 112), "&5&lEnder Leggings", "", "&a&oMove anywhere");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack(
            "Ender boots",
            Material.LEATHER_BOOTS,
            Color.fromRGB(28, 25, 112),
            "&5&lEnder Boots",
            "",
            "&a&oMove anywhere",
            "",
            "&9+ No damage when using ender pearls");

    public static final SlimefunItemStack SLIME_HELMET =
            new SlimefunItemStack("Slime helmet", Material.LEATHER_HELMET, Color.LIME, "&a&lSlime Helmet", "", "&a&oResilient feeling");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack(
            "Slime chestplate", Material.LEATHER_CHESTPLATE, Color.LIME, "&a&lSlime Breastplate", "", "&a&oResilient feeling");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack(
            "Slime leggings", Material.LEATHER_LEGGINGS, Color.LIME, "&a&lSlime Leggings", "", "&a&oResilient feeling", "", "&9+ speed");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack(
            "Slime boots",
            Material.LEATHER_BOOTS,
            Color.LIME,
            "&a&lSlime Boots",
            "",
            "&a&oResilient feeling",
            "",
            "&9+ jump boost",
            "&9+ Reduce fall damage");

    public static final SlimefunItemStack CACTUS_HELMET =
            new SlimefunItemStack("Cactus helmet", Material.LEATHER_HELMET, Color.GREEN, "&2 Cactus Helmet");
    public static final SlimefunItemStack CACTUS_CHESTPLATE =
            new SlimefunItemStack("Cactus chestplate", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2 Cactus Breastplate");
    public static final SlimefunItemStack CACTUS_LEGGINGS =
            new SlimefunItemStack("Cactus leggings", Material.LEATHER_LEGGINGS, Color.GREEN, "&2 cactus leggings");
    public static final SlimefunItemStack CACTUS_BOOTS =
            new SlimefunItemStack("Cactus boots", Material.LEATHER_BOOTS, Color.GREEN, "&2 cactus boots");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET =
            new SlimefunItemStack("Damascus steel helmet", Material.IRON_HELMET, "&7 Damascus Steel Helmet");
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE =
            new SlimefunItemStack("Damascus steel chestplate", Material.IRON_CHESTPLATE, "&7 Damascus Steel Breastplate");
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS =
            new SlimefunItemStack("Damascus steel leggings", Material.IRON_LEGGINGS, "&7 Damascus steel leggings");
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS =
            new SlimefunItemStack("Damascus steel boots", Material.IRON_BOOTS, "&7 Damascus Steel Boots");

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET =
            new SlimefunItemStack("Reinforced alloy helmet", Material.IRON_HELMET, "&bReinforced alloy helmet");
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE =
            new SlimefunItemStack("Reinforced alloy chestplate", Material.IRON_CHESTPLATE, "&bReinforced alloy breastplate");
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS =
            new SlimefunItemStack("Reinforced alloy leggings", Material.IRON_LEGGINGS, "&bReinforced alloy leggings");
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS =
            new SlimefunItemStack("Reinforced alloy boots", Material.IRON_BOOTS, "&bReinforced alloy boots");

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Full set of equipment effects:");
        hazmatLore.add(ChatColor.YELLOW + "-Immune to radiation damage");
        hazmatLore.add(ChatColor.YELLOW + "-Immune to bee sting damage");
    }

    public static final SlimefunItemStack SCUBA_HELMET =
            new SlimefunItemStack("Scuba helmet", Material.LEATHER_HELMET, Color.ORANGE, "&cDiving helmet", "", "&7 allows you to breathe underwater");
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack(
            "Hazmat chestplate", Material.LEATHER_CHESTPLATE, Color.ORANGE, "&cchemical protective clothing", "", "&7 allows you to walk in fire and lava");
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack(
            "Hazmat leggings", Material.LEATHER_LEGGINGS, Color.ORANGE, "&cchemical protective leggings", hazmatLore.toArray(new String[0]));
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack(
            "Rubber boots", Material.LEATHER_BOOTS, Color.BLACK, "&cchemical protective boots", hazmatLore.toArray(new String[0]));

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET =
            new SlimefunItemStack("Gilded iron helmet", Material.GOLDEN_HELMET, "&6Gold-plated iron helmet");
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE =
            new SlimefunItemStack("Gilded iron chestplate", Material.GOLDEN_CHESTPLATE, "&6 Gilded Iron Breastplate");
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS =
            new SlimefunItemStack("Gilded iron leggings", Material.GOLDEN_LEGGINGS, "&6 gold-plated iron leggings");
    public static final SlimefunItemStack GILDED_IRON_BOOTS =
            new SlimefunItemStack("Gilded iron boots", Material.GOLDEN_BOOTS, "&6 gilded iron boots");

    public static final SlimefunItemStack GOLDEN_HELMET_12K =
            new SlimefunItemStack("Gold 12 k helmet", Material.GOLDEN_HELMET, "&6Golden Helmet", "&912 carats");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K =
            new SlimefunItemStack("Gold 12 k chestplate", Material.GOLDEN_CHESTPLATE, "&6Gold Breastplate", "&912 carats");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K =
            new SlimefunItemStack("Gold 12 k leggings", Material.GOLDEN_LEGGINGS, "&6Gold Leggings", "&912 carats");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K =
            new SlimefunItemStack("Gold 12 k boots", Material.GOLDEN_BOOTS, "&6gold boots", "&912 carats");

    public static final SlimefunItemStack SLIME_HELMET_STEEL =
            new SlimefunItemStack("Slime steel helmet", Material.IRON_HELMET, "&a&lSlime Helmet", "&7&o has been strengthened", "", "&a&oResilient feeling");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack(
            "Slime steel chestplate", Material.IRON_CHESTPLATE, "&a&lSlime Breastplate", "&7&o has been strengthened", "", "&a&oResilient feeling");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack(
            "Slime steel leggings", Material.IRON_LEGGINGS, "&a&lSlime Leggings", "&7&o has been strengthened", "", "&a&oResilient feeling", "", "&9+ speed");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack(
            "Slime steel boots",
            Material.IRON_BOOTS,
            "&a&lSlime Boots",
            "&7&o has been strengthened",
            "",
            "&a&oResilient feeling",
            "",
            "&9+ jump boost",
            "&9+ Reduce fall damage");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack(
            "Boots of the stomper",
            Material.LEATHER_BOOTS,
            Color.AQUA,
            "&bTramper's Boots",
            "",
            "&9All fall damage you take",
            "&9 will be transferred to nearby creatures/players",
            "",
            "&9+ Reduce fall damage");

    public static final SlimefunItemStack BEE_HELMET =
            new SlimefunItemStack("Bee helmet", Material.GOLDEN_HELMET, "&e&lBee Helmet", " ", "&fbuzz");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack(
            "Bee wings", Material.ELYTRA, "&e&lBee Wings", " ", "&fbuzz", " ", "&9When approaching the ground", "&9 will enable ramp-down mode", " ");
    public static final SlimefunItemStack BEE_LEGGINGS =
            new SlimefunItemStack("Bee leggings", Material.GOLDEN_LEGGINGS, "&e&lBee Leggings", " ", "&fbuzz");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack(
            "Bee boots",
            Material.GOLDEN_BOOTS,
            "&e&lBee boots",
            "&fbuzz",
            "",
            "&e&oIt will be absolutely fine when we take off again",
            "",
            "&9+ jump boost",
            "&9+ Reduce fall damage");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(VersionedEnchantment.UNBREAKING, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(VersionedEnchantment.UNBREAKING, 5);
        damascusEnchs.put(VersionedEnchantment.PROTECTION, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(VersionedEnchantment.UNBREAKING, 9);
        reinforcedEnchs.put(VersionedEnchantment.PROTECTION, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(VersionedEnchantment.UNBREAKING, 6);
        gildedEnchs.put(VersionedEnchantment.PROTECTION, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        slimeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        beeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /*		 Misc 		*/
    public static final SlimefunItemStack MAGIC_LUMP_1 =
            new SlimefunItemStack("Magic lump 1", Material.GOLD_NUGGET, "&6Magic Crystal &7-&eI", "", "&c&oGrade: I");
    public static final SlimefunItemStack MAGIC_LUMP_2 =
            new SlimefunItemStack("Magic lump 2", Material.GOLD_NUGGET, "&6Magic Crystal &7-&eII", "", "&c&oLevel: II");
    public static final SlimefunItemStack MAGIC_LUMP_3 =
            new SlimefunItemStack("Magic lump 3", Material.GOLD_NUGGET, "&6Magic Crystal &7-&eIII", "", "&c&oLevel: III");
    public static final SlimefunItemStack ENDER_LUMP_1 =
            new SlimefunItemStack("Ender lump 1", Material.GOLD_NUGGET, "&5Ender Crystal &7-&eI", "", "&c&oGrade: I");
    public static final SlimefunItemStack ENDER_LUMP_2 =
            new SlimefunItemStack("Ender lump 2", Material.GOLD_NUGGET, "&5End Crystal &7-&eII", "", "&c&oLevel: II");
    public static final SlimefunItemStack ENDER_LUMP_3 =
            new SlimefunItemStack("Ender lump 3", Material.GOLD_NUGGET, "&5End Crystal &7-&eIII", "", "&c&oLevel: III");
    public static final SlimefunItemStack MAGICAL_BOOK_COVER =
            new SlimefunItemStack("Magical book cover", Material.PAPER, "&6Magic Book Cover", "", "&a&o is used in various magic books");
    public static final SlimefunItemStack MAGICAL_GLASS =
            new SlimefunItemStack("Magical glass", Material.GLASS_PANE, "&6Magic Glass", "", "&a&o is used by many magic items");
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack(
            "Synthetic shulker shell", Material.SHULKER_SHELL, "&dartificial latent image shell", "", "&f can be used for crafting on the workbench", "&fJust like a regular shulker shell");
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD =
            new SlimefunItemStack("Basic circuit board", Material.ACTIVATOR_RAIL, "&bBasic circuit board");
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD =
            new SlimefunItemStack("Advanced circuit board", Material.POWERED_RAIL, "&bAdvanced Circuit Board");
    public static final SlimefunItemStack WHEAT_FLOUR = new SlimefunItemStack("Wheat flour", Material.SUGAR, "&rwheat flour");
    public static final SlimefunItemStack STEEL_PLATE = new SlimefunItemStack("Steel plate", Material.PAPER, "&7&lSteel plate");
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack("Battery", HeadTexture.BATTERY, "&6battery");
    public static final SlimefunItemStack CARBON = new SlimefunItemStack("Carbon", HeadTexture.CARBON, "&eCarbon");
    public static final SlimefunItemStack COMPRESSED_CARBON =
            new SlimefunItemStack("Compressed carbon", HeadTexture.COMPRESSED_CARBON, "&cCompressed carbon");
    public static final SlimefunItemStack CARBON_CHUNK =
            new SlimefunItemStack("Carbon chunk", HeadTexture.CARBON, "&4 carbon block");
    public static final SlimefunItemStack STEEL_THRUSTER =
            new SlimefunItemStack("Steel thruster", Material.BUCKET, "&7&lSteel propeller");
    public static final SlimefunItemStack POWER_CRYSTAL =
            new SlimefunItemStack("Power crystal", HeadTexture.POWER_CRYSTAL, "&c&lEnergy Crystal");
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack("Chain", Material.STRING, "&bChain");
    public static final SlimefunItemStack HOOK = new SlimefunItemStack("Hook", Material.FLINT, "&bhook");
    public static final SlimefunItemStack SIFTED_ORE = new SlimefunItemStack("Sifted ore", Material.GUNPOWDER, "&6Screen ore");
    public static final SlimefunItemStack STONE_CHUNK =
            new SlimefunItemStack("Stone chunk", HeadTexture.STONE_CHUNK, "&6 stones");
    public static final SlimefunItemStack LAVA_CRYSTAL =
            new SlimefunItemStack("Lava crystal", HeadTexture.LAVA_CRYSTAL, "&4Magma Crystal");
    public static final SlimefunItemStack SALT = new SlimefunItemStack("Salt", Material.SUGAR, "&rSalt");
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack("Cheese", HeadTexture.CHEESE, "&rcheese");
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack("Butter", HeadTexture.BUTTER, "&rButter");
    public static final SlimefunItemStack DUCT_TAPE =
            new SlimefunItemStack("Duct tape", HeadTexture.DUCT_TAPE, "&8 strong tape", "", "&rYou can use this in an automatic anvil", "&rRepair items");
    public static final SlimefunItemStack HEAVY_CREAM =
            new SlimefunItemStack("Heavy cream", Material.SNOWBALL, "&rHeavy Cream");
    public static final SlimefunItemStack CRUSHED_ORE =
            new SlimefunItemStack("Crushed ore", Material.GUNPOWDER, "&6crushed ore");
    public static final SlimefunItemStack PULVERIZED_ORE =
            new SlimefunItemStack("Pulverized ore", Material.GUNPOWDER, "&6Powdered ore");
    public static final SlimefunItemStack PURE_ORE_CLUSTER =
            new SlimefunItemStack("Pure ore cluster", Material.GUNPOWDER, "&6 pure mineral clusters");
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack(
            "Small uranium",
            HeadTexture.URANIUM,
            "&ca small piece of uranium",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack(
            "Tiny uranium", HeadTexture.URANIUM, "&cA handful of uranium", "", LoreBuilder.radioactive(Radioactivity.LOW));

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack("Magnet", HeadTexture.MAGNET, "&cmagnet");
    public static final SlimefunItemStack NECROTIC_SKULL =
            new SlimefunItemStack("Necrotic skull", HeadTexture.NECROTIC_SKULL, "&cNecrotic skull");
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE =
            new SlimefunItemStack("Essence of afterlife", Material.GUNPOWDER, "&4Essence of the afterlife");
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack(
            "Strange nether goo", Material.PURPLE_DYE, "&5 Weird nether slime", "", "&fA strange substance", "&fcan be obtained in exchange with piglins");
    public static final SlimefunItemStack ELECTRO_MAGNET =
            new SlimefunItemStack("Electro magnet", HeadTexture.MAGNET, "&cElectromagnet");
    public static final SlimefunItemStack HEATING_COIL =
            new SlimefunItemStack("Heating coil", HeadTexture.HEATING_COIL, "&cheating coil");
    public static final SlimefunItemStack COOLING_UNIT =
            new SlimefunItemStack("Cooling unit", HeadTexture.COOLING_UNIT, "&bCooling device");
    public static final SlimefunItemStack ELECTRIC_MOTOR =
            new SlimefunItemStack("Electric motor", HeadTexture.MOTOR, "&celectric motor");
    public static final SlimefunItemStack CARGO_MOTOR =
            new SlimefunItemStack("Engine charge", HeadTexture.CARGO_MOTOR, "&3 Cargo Motor", "", "&7 Important parts for freight network related machines");
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack(
            "Scroll of dimensional teleposition",
            Material.PAPER,
            "&6 Dimensional Teleportation Scroll",
            "",
            "&cThis scroll can be created portable",
            "&cA temporary black hole",
            "&c Teleports all nearby entities to",
            "&cIn another dimension",
            "&cEverything is reversed",
            "",
            "&rThat is to say: let the entity rotate 180°");
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack(
            "Tome of knowledge sharing",
            Material.ENCHANTED_BOOK,
            "&6Masterpiece of Knowledge",
            "&7Master: &bNone",
            "",
            "&eright-click&7 to bind all your research",
            "",
            "",
            "&eright-click&7 to get all research from the previous owner");
    public static final SlimefunItemStack HARDENED_GLASS =
            new SlimefunItemStack("Hardened glass", Material.LIGHT_GRAY_STAINED_GLASS, "&7Tempered glass", "", "&rcan withstand explosions");
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN =
            new SlimefunItemStack("Wither proof obsidian", Material.OBSIDIAN, "&5Anti-Wither Obsidian", "", "&rCan withstand explosions and", "&rWither's attack");
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack(
            "Wither proof glass", Material.PURPLE_STAINED_GLASS, "&5 anti-withering glass", "", "&rCan withstand explosions and", "&rWither's attack");
    public static final SlimefunItemStack REINFORCED_PLATE =
            new SlimefunItemStack("Reinforced plate", Material.PAPER, "&7Reinforced Plate");
    public static final SlimefunItemStack ANCIENT_PEDESTAL =
            new SlimefunItemStack("Ancient pedestal", Material.DISPENSER, "&dancient pedestal", "", "&5Part of an ancient altar");
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack(
            "Ancient altar", Material.ENCHANTING_TABLE, "&dancient altar", "", "&5Build an altar in the world", "&5And use ancient rituals to craft items");
    public static final SlimefunItemStack COPPER_WIRE =
            new SlimefunItemStack("Copper wire", Material.STRING, "&6 copper wire", "", "&6An important part of electronic accessories");
    public static final SlimefunItemStack CRAFTING_MOTOR =
            new SlimefunItemStack("Crafting motor", HeadTexture.CRAFTING_MOTOR, "&6 Synthetic machine motor", "", "&7 Important parts of automatic synthesis machine");

    public static final SlimefunItemStack RAINBOW_WOOL =
            new SlimefunItemStack("Rainbow wool", Material.WHITE_WOOL, "&5rainbow wool", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS =
            new SlimefunItemStack("Rainbow glass", Material.WHITE_STAINED_GLASS, "&5rainbow glass", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CLAY =
            new SlimefunItemStack("Rainbow clay", Material.WHITE_TERRACOTTA, "&5 Rainbow Clay Blocks", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack(
            "Rainbow glass pane", Material.WHITE_STAINED_GLASS_PANE, "&5 rainbow glass plate", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CONCRETE =
            new SlimefunItemStack("Rainbow concrete", Material.WHITE_CONCRETE, "&5Rainbow Concrete", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack(
            "Rainbow glazed terracotta", Material.WHITE_GLAZED_TERRACOTTA, "&5Rainbow Glazed Terracotta Tiles", "", LoreBuilder.RAINBOW);

    private static final String CHRISTMAS = ChatUtils.christmas("<Christmas Edition>");

    public static final SlimefunItemStack RAINBOW_WOOL_XMAS =
            new SlimefunItemStack("Rainbow wool xmas", Material.WHITE_WOOL, "&5Rainbow Wool &7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS =
            new SlimefunItemStack("Rainbow glass xmas", Material.WHITE_STAINED_GLASS, "&5Rainbow Glass &7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS =
            new SlimefunItemStack("Rainbow clay xmas", Material.WHITE_TERRACOTTA, "&5Rainbow Clay Blocks&7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack(
            "Rainbow glass pane xmas", Material.WHITE_STAINED_GLASS_PANE, "&5Rainbow glass plate &7(Christmas version)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS =
            new SlimefunItemStack("Rainbow concrete xmas", Material.WHITE_CONCRETE, "&5Rainbow Concrete &7(Christmas Edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack(
            "Rainbow glazed terracotta xmas", Material.WHITE_GLAZED_TERRACOTTA, "&5Rainbow Glazed Terracotta Tiles &7(Christmas Edition)", "", CHRISTMAS);

    private static final String VALENTINES_DAY = "&d<Valentine's Day Edition>";

    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE =
            new SlimefunItemStack("Rainbow wool valentine", Material.PINK_WOOL, "&5Rainbow Wool &7(Valentine's Day Edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack(
            "Rainbow glass valentine", Material.PINK_STAINED_GLASS, "&5Rainbow Glass &7(Valentine's Day Edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack(
            "Rainbow clay valentine", Material.PINK_TERRACOTTA, "&5Rainbow Clay Blocks&7(Valentine's Day Edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack(
            "Rainbow glass pane valentine", Material.PINK_STAINED_GLASS_PANE, "&5Rainbow Glass Panel &7(Valentine’s Day Edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack(
            "Rainbow concrete valentine", Material.PINK_CONCRETE, "&5Rainbow Concrete &7(Valentine's Day Edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack(
            "Rainbow glazed terracotta valentine",
            Material.PINK_GLAZED_TERRACOTTA,
            "&5Rainbow Glazed Terracotta Tiles &7(Valentine's Day Edition)",
            "",
            VALENTINES_DAY);

    private static final String HALLOWEEN = "&6<Halloween Edition>";

    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN =
            new SlimefunItemStack("Rainbow wool halloween", Material.ORANGE_WOOL, "&5Rainbow Wool &7(Halloween Edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack(
            "Rainbow glass halloween", Material.ORANGE_STAINED_GLASS, "&5Rainbow Glass &7(Halloween Edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack(
            "Rainbow clay halloween", Material.ORANGE_TERRACOTTA, "&5Rainbow Clay Blocks &7(Halloween Edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack(
            "Rainbow glass pane halloween", Material.ORANGE_STAINED_GLASS_PANE, "&5Rainbow glass plate &7(Halloween version)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack(
            "Rainbow concrete halloween", Material.ORANGE_CONCRETE, "&5Rainbow Concrete &7(Halloween Edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack(
            "Rainbow glazed terracotta halloween",
            Material.ORANGE_GLAZED_TERRACOTTA,
            "&5Rainbow Glazed Terracotta Tiles &7(Halloween Edition)",
            "",
            HALLOWEEN);

    /*		锭 		*/
    public static final SlimefunItemStack COPPER_INGOT = new SlimefunItemStack("Copper ingot", Material.BRICK, "&bCopper Ingot");
    public static final SlimefunItemStack TIN_INGOT = new SlimefunItemStack("Tin ingot", Material.IRON_INGOT, "&btin ingot");
    public static final SlimefunItemStack SILVER_INGOT =
            new SlimefunItemStack("Silver ingot", Material.IRON_INGOT, "&bsilver ingot");
    public static final SlimefunItemStack ALUMINUM_INGOT =
            new SlimefunItemStack("Aluminum ingot", Material.IRON_INGOT, "&bAluminum ingot");
    public static final SlimefunItemStack LEAD_INGOT = new SlimefunItemStack("Lead ingot", Material.IRON_INGOT, "&bLead Ingot");
    public static final SlimefunItemStack ZINC_INGOT = new SlimefunItemStack("Zinc ingot", Material.IRON_INGOT, "&bZinc ingot");
    public static final SlimefunItemStack MAGNESIUM_INGOT =
            new SlimefunItemStack("Magnesium ingot", Material.IRON_INGOT, "&bMagnesium ingot");

    /*		Alloy (Carbon + Iron)	*/
    public static final SlimefunItemStack STEEL_INGOT =
            new SlimefunItemStack("Steel ingot", Material.IRON_INGOT, "&bSteel Ingot");
    /*		Alloy (Copper + Tin)	*/
    public static final SlimefunItemStack BRONZE_INGOT = new SlimefunItemStack("Bronze ingot", Material.BRICK, "&bBronze Ingot");
    /*		Alloy (Copper + Aluminum)	*/
    public static final SlimefunItemStack DURALUMIN_INGOT =
            new SlimefunItemStack("Duralumin ingot", Material.IRON_INGOT, "&bduralumin ingot");
    /*		Alloy (Copper + Silver)	*/
    public static final SlimefunItemStack BILLON_INGOT =
            new SlimefunItemStack("Billon ingot", Material.IRON_INGOT, "&bSilver copper alloy ingot");
    /*		Alloy (Copper + Zinc)	*/
    public static final SlimefunItemStack BRASS_INGOT =
            new SlimefunItemStack("Brass ingot", Material.GOLD_INGOT, "&bbrass ingot");
    /*		Alloy (Aluminum + Brass)	*/
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT =
            new SlimefunItemStack("Aluminum brass ingot", Material.GOLD_INGOT, "&bAluminum Brass Ingot");
    /*		Alloy (Aluminum + Bronze)	*/
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT =
            new SlimefunItemStack("Aluminum bronze ingot", Material.GOLD_INGOT, "&bAluminum Bronze Ingot");
    /*		Alloy (Gold + Silver + Copper)	*/
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT =
            new SlimefunItemStack("Corinthian bronze ingot", Material.GOLD_INGOT, "&bCorinthian Bronze Ingot");
    /*		Alloy (Lead + Tin)	*/
    public static final SlimefunItemStack SOLDER_INGOT =
            new SlimefunItemStack("Solder ingot", Material.IRON_INGOT, "&bSolder ingot");
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT =
            new SlimefunItemStack("Damascus steel ingot", Material.IRON_INGOT, "&bDamascus Steel Ingot");
    /*		Alloy (大马士革钢 + 硬铝 + Compressed Carbon + Aluminium Bronze)	*/
    public static final SlimefunItemStack HARDENED_METAL_INGOT =
            new SlimefunItemStack("Hardened metal ingot", Material.IRON_INGOT, "&b&lhardened metal");
    /*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + 大马士革钢)	*/
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT =
            new SlimefunItemStack("Reinforced alloy ingot", Material.IRON_INGOT, "&b&lReinforced alloy ingot");
    /*		Alloy (Iron + Silicon)		*/
    public static final SlimefunItemStack FERROSILICON =
            new SlimefunItemStack("Ferrosilicon", Material.IRON_INGOT, "&bferrosilicon");
    /*		Alloy (Iron + Gold)			*/
    public static final SlimefunItemStack GILDED_IRON =
            new SlimefunItemStack("Gilded iron", Material.GOLD_INGOT, "&6&lGold-plated iron ingot");
    /*		Alloy (Redstone + Ferrosilicon)	*/
    public static final SlimefunItemStack REDSTONE_ALLOY =
            new SlimefunItemStack("Redstone alloy", Material.BRICK, "&cRedstone Alloy Ingot");
    /*		Alloy (Iron + Copper)		*/
    public static final SlimefunItemStack NICKEL_INGOT =
            new SlimefunItemStack("Nickel ingot", Material.IRON_INGOT, "&bNickel Ingot");
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static final SlimefunItemStack COBALT_INGOT =
            new SlimefunItemStack("Cobalt ingot", Material.IRON_INGOT, "&9Cobalt Ingot");

    /*		Gold		*/
    public static final SlimefunItemStack GOLD_4K =
            new SlimefunItemStack("Gold 4 k", Material.GOLD_INGOT, "&rGold Ingot &7(4ct)");
    public static final SlimefunItemStack GOLD_6K =
            new SlimefunItemStack("Gold 6 k", Material.GOLD_INGOT, "&rGold Ingot &7(6ct)");
    public static final SlimefunItemStack GOLD_8K =
            new SlimefunItemStack("Gold 8 k", Material.GOLD_INGOT, "&rGold Ingot &7(8ct)");
    public static final SlimefunItemStack GOLD_10K =
            new SlimefunItemStack("Gold 10 k", Material.GOLD_INGOT, "&rGold Ingot &7 (10 carats)");
    public static final SlimefunItemStack GOLD_12K =
            new SlimefunItemStack("Gold 12 k", Material.GOLD_INGOT, "&rGold Ingot &7 (12 carats)");
    public static final SlimefunItemStack GOLD_14K =
            new SlimefunItemStack("Gold 14 k", Material.GOLD_INGOT, "&rGold Ingot &7(14ct)");
    public static final SlimefunItemStack GOLD_16K =
            new SlimefunItemStack("Gold 16 k", Material.GOLD_INGOT, "&rGold Ingot &7(16 carat)");
    public static final SlimefunItemStack GOLD_18K =
            new SlimefunItemStack("Gold 18 k", Material.GOLD_INGOT, "&rGold Ingot &7 (18 carats)");
    public static final SlimefunItemStack GOLD_20K =
            new SlimefunItemStack("Gold 20 k", Material.GOLD_INGOT, "&rGold Ingot &7(20 carat)");
    public static final SlimefunItemStack GOLD_22K =
            new SlimefunItemStack("Gold 22 k", Material.GOLD_INGOT, "&rGold Ingot &7(22 carat)");
    public static final SlimefunItemStack GOLD_24K =
            new SlimefunItemStack("Gold 24 k", Material.GOLD_INGOT, "&rGold Ingot &7(24 carat)");

    /*		 Dusts 		*/
    public static final SlimefunItemStack IRON_DUST = new SlimefunItemStack("Iron dust", Material.GUNPOWDER, "&6iron powder");
    public static final SlimefunItemStack GOLD_DUST =
            new SlimefunItemStack("Gold dust", Material.GLOWSTONE_DUST, "&6gold powder");
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack("Tin dust", Material.SUGAR, "&6 tin powder");
    public static final SlimefunItemStack COPPER_DUST =
            new SlimefunItemStack("Copper dust", Material.GLOWSTONE_DUST, "&6 copper powder");
    public static final SlimefunItemStack SILVER_DUST = new SlimefunItemStack("Silver dust", Material.SUGAR, "&6silver powder");
    public static final SlimefunItemStack ALUMINUM_DUST =
            new SlimefunItemStack("Aluminum dust", Material.SUGAR, "&6aluminum powder");
    public static final SlimefunItemStack LEAD_DUST = new SlimefunItemStack("Lead dust", Material.GUNPOWDER, "&6 lead powder");
    public static final SlimefunItemStack SULFATE = new SlimefunItemStack("Sulfate", Material.GLOWSTONE_DUST, "&6 sulfate");
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack("Zinc dust", Material.SUGAR, "&6zinc powder");
    public static final SlimefunItemStack MAGNESIUM_DUST =
            new SlimefunItemStack("Magnesium dust", Material.SUGAR, "&6 magnesium powder");
    public static final SlimefunItemStack SILICON = new SlimefunItemStack("Silicon", Material.FIREWORK_STAR, "&6 silicon");
    public static final SlimefunItemStack GOLD_24K_BLOCK =
            new SlimefunItemStack("Gold 24 k block", Material.GOLD_BLOCK, "&r&rGold nugget &7(24 carat)");

    /*		 Gems 		*/
    public static final SlimefunItemStack SYNTHETIC_DIAMOND =
            new SlimefunItemStack("Synthetic diamond", Material.DIAMOND, "&bMan-made diamonds", "", "&rcan be used as a diamond in the workbench");
    public static final SlimefunItemStack SYNTHETIC_EMERALD =
            new SlimefunItemStack("Synthetic emerald", Material.EMERALD, "&bArtificial emerald", "", "&rCan be used to trade with villagers");
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE =
            new SlimefunItemStack("Synthetic sapphire", HeadTexture.SAPPHIRE, "&bArtificial sapphire", "", "&rcan be used as lapis lazuli in the workbench");
    public static final SlimefunItemStack CARBONADO =
            new SlimefunItemStack("Carbonated", HeadTexture.CARBONADO, "&b&lBlack Diamond", "", "&7&o\"Black Diamond\"");
    public static final SlimefunItemStack RAW_CARBONADO =
            new SlimefunItemStack("Raw carbonado", HeadTexture.RAW_CARBONADO, "&bBlack Diamond Raw Ore");

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack(
            "Uranium",
            HeadTexture.URANIUM,
            "&4uranium",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack(
            "Neptune",
            HeadTexture.NEPTUNIUM,
            "&a鎎",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack(
            "Plutonium",
            HeadTexture.PLUTONIUM,
            "&7Plutonium",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack(
            "Boosted uranium",
            HeadTexture.BOOSTED_URANIUM,
            "&2Plutonium-Uranium Mixed Oxide Nuclear Fuel",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    /*		Talisman		*/
    public static final SlimefunItemStack COMMON_TALISMAN =
            new SlimefunItemStack("Common talisman", Material.EMERALD, "&6Common Amulet");
    public static final SlimefunItemStack ENDER_TALISMAN =
            new SlimefunItemStack("Ender talisman", Material.EMERALD, "&5Ender Amulet");

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack(
            "Anvil talisman",
            Material.EMERALD,
            "&aAnvil Amulet",
            "",
            "&fEach amulet prevents",
            "&fA tool was damaged due to insufficient durability.",
            "&f will then be consumed",
            "",
            "&4&lWarning:",
            "&4Due to the complexity of overly powerful tools",
            "&4This amulet cannot repair tools that are too powerful");
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack(
            "Miner talisman", Material.EMERALD, "&aMiner's Amulet", "", "&fWhile this amulet is in your backpack", "&fThere will be a 20% chance of double drops", "&fThe minerals you dug up");
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack(
            "Farmer talisman", Material.EMERALD, "&aFarmer's Amulet", "", "&fWhile this amulet is in your backpack", "&fThere will be a 20% chance of double drops", "&fThe crops you harvested");
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack(
            "Hunter talisman", Material.EMERALD, "&aHunter's Amulet", "", "&fWhile this amulet is in your backpack", "&fThere will be a 20% chance of double drops", "&fdrops from creatures you kill");
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack(
            "Lava talisman",
            Material.EMERALD,
            "&aMagma Walker Amulet",
            "",
            "&fWhile this amulet is in your backpack",
            "&fGet flame protection effect",
            "&fOnly available when you are walking on lava",
            "&f will then be consumed");
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack(
            "Water talisman",
            Material.EMERALD,
            "&aDiver's Amulet",
            "",
            "&fWhile this amulet is in your backpack",
            "&fOnce you are about to drown",
            "&fThe amulet will give you water breathing",
            "&f will then be consumed");
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack(
            "Angel talisman", Material.EMERALD, "&aAngel Amulet", "", "&fWhile this amulet is in your backpack", "&fHas a 75% chance of reducing your fall damage");
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack(
            "Fire talisman", Material.EMERALD, "&aFirefighter Amulet", "", "&fWhile this amulet is in your backpack", "&fWhen you're on fire", "&fGives you fire protection effect", "&f will then be consumed");
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack(
            "Magician talisman", Material.EMERALD, "&aMagician's Amulet", "", "&fWhile this amulet is in your backpack", "&f80% chance when enchanting", "&fGet an additional enchantment");
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack(
            "Traveller talisman",
            Material.EMERALD,
            "&aTraveler's Amulet",
            "",
            "&fWhile this amulet is in your backpack",
            "&f 60% chance when you start sprinting",
            "&f gives you speed effect");
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack(
            "Warrior talisman", Material.EMERALD, "&aWarrior Amulet", "", "&fWhile this amulet is in your backpack", "&fYou will gain the effect of Strength 3 after being attacked.", "&f will then be consumed");
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack(
            "Knight talisman",
            Material.EMERALD,
            "&aKnight's Amulet",
            "",
            "&fWhile this amulet is in your backpack",
            "&fafter you are attacked",
            "&f30% chance of five seconds of health regeneration",
            "&f will then be consumed");
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack(
            "Whirlwind talisman", Material.EMERALD, "&aTornado Amulet", "", "&fWhile this amulet is in your backpack", "&f will have a 60% chance", "&fReflect all projectiles coming towards you");
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack(
            "Wizard talisman",
            Material.EMERALD,
            "&aWizard's Amulet",
            "",
            "&fWhile this amulet is in your backpack",
            "&fGet Fortune 4/5 when you enchant",
            "&fBut it may also degrade the item",
            "&fLevels of other enchantments");
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack(
            "Caveman talisman", Material.EMERALD, "&aCaveman Amulet", "", "&fWhile this amulet is in your backpack", "&fThere is a 50% chance when you mine", "&fGet a moment of urgency");
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack(
            "Wise talisman", Material.EMERALD, "&aWise Man's Amulet", "", "&fWhile this amulet is in your backpack", "&fThe experience gained will have a 20% chance of being doubled.");

    /*		Staves		*/
    public static final SlimefunItemStack STAFF_ELEMENTAL =
            new SlimefunItemStack("Staff elemental", Material.STICK, "&6Elemental Staff");
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack(
            "Staff elemental wind", Material.STICK, "&6Elemental Staff &7-&b&oWind", "", "&7Element: &b&o style", "", "&7&eright click&7 to blow you away");
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack(
            "Staff elemental fire", Material.STICK, "&6Elemental Staff &7-&c&oFire", "", "&7Element: &c&oFire", "", "&cLet the flame purify everything!");
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack(
            "Staff elemental water", Material.STICK, "&6Elemental Staff &7-&1&oWater", "", "&7Element: &1&oWater", "", "&7&eright click&7 to put out the fire on you");
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack(
            "Staff elemental storm",
            Material.STICK,
            "&6Elemental Staff &7-&8&oThunder",
            "",
            "&7Element: &8&o雷",
            "",
            "&eright-click&7 to summon a bolt of lightning",
            LoreBuilder.usesLeft(StormStaff.MAX_USES));

    static {
        STAFF_WIND.addUnsafeEnchantment(VersionedEnchantment.LUCK_OF_THE_SEA, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(VersionedEnchantment.AQUA_AFFINITY, 1);
        STAFF_STORM.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 1);
    }

    /*		 Machines 		*/
    public static final SlimefunItemStack GRIND_STONE =
            new SlimefunItemStack("Grind stone", Material.DISPENSER, "&bWhetstone", "", "&a&oGrind items more efficiently");
    public static final SlimefunItemStack ARMOR_FORGE =
            new SlimefunItemStack("Armor forge", Material.ANVIL, "&6 Armor Forging Bench", "", "&a&o gives you the power to create powerful armors");
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack(
            "Makeshift smeltery", Material.BLAST_FURNACE, "&eSimple smelting furnace", "", "&rSimple version of the smelting furnace", "&rCan only smelt mineral powder into ingots");
    public static final SlimefunItemStack SMELTERY =
            new SlimefunItemStack("Smeltery", Material.FURNACE, "&6 smelting furnace", "", "&aA high-temperature furnace capable of smelting metals");
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack(
            "Ignition chamber", Material.DROPPER, "&4Automatic ignition machine", "&rIn case your smelter loses its flame", "&rAfter putting in the flint and steel", "&rPlace next to the launcher of the smelting furnace");
    public static final SlimefunItemStack ORE_CRUSHER =
            new SlimefunItemStack("Ore crusher", Material.DISPENSER, "&bOre Crusher", "", "&a&oCrush ore and get double the ore dust");
    public static final SlimefunItemStack COMPRESSOR =
            new SlimefunItemStack("Compressor", Material.PISTON, "&bCompressor", "", "&aCompress items");
    public static final SlimefunItemStack PRESSURE_CHAMBER =
            new SlimefunItemStack("Pressure chamber", Material.GLASS, "&bPress", "", "&aCompress more items");
    public static final SlimefunItemStack MAGIC_WORKBENCH =
            new SlimefunItemStack("Magic workbench", Material.CRAFTING_TABLE, "&6Magic Workbench", "", "&dInfuse items with magical energy");
    public static final SlimefunItemStack ORE_WASHER =
            new SlimefunItemStack("Ore washer", Material.CAULDRON, "&6 Ore Washing Machine", "", "&a&o Clean screen ore becomes filtered ore", "&a&oand give you some pebbles");
    public static final SlimefunItemStack TABLE_SAW =
            new SlimefunItemStack("Table saw", Material.STONECUTTER, "&6 table saw", "", "&a&oGet 8 planks from 1 wood", "&a&o(supports all logs)");
    ;
    public static final SlimefunItemStack COMPOSTER =
            new SlimefunItemStack("Compost", Material.CAULDRON, "&aBlender", "", "&a&o can convert various materials over time...");
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
            "Enhanced crafting table", Material.CRAFTING_TABLE, "&eEnhanced Workbench", "", "&a&oAn original workbench", "&a&o cannot withstand the powerful force...");
    public static final SlimefunItemStack CRUCIBLE =
            new SlimefunItemStack("Crucible", Material.CAULDRON, "&cCrucible", "", "&a&o is used to turn items into liquids");
    public static final SlimefunItemStack JUICER =
            new SlimefunItemStack("Juicer", Material.GLASS_BOTTLE, "&aJuicer", "", "&a lets you create delicious juices");

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack(
            "Industrial miner",
            Material.GOLDEN_PICKAXE,
            "&bindustrial mining machine",
            "",
            "&rIndustrial miners are able to mine underneath it 7x7",
            "&rAll minerals within the range.",
            "&rPut coal or other fuel into",
            "&rAdd fuel to the machine's chest.");
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack(
            "Advanced industrial miner",
            Material.DIAMOND_PICKAXE,
            "&cAdvanced Industrial Mining Machine",
            "",
            "&rAdvanced industrial miners can mine 11x11 below it",
            "&rAll minerals in the range.",
            "&rPut fuel or magma into the machine's box",
            "&rAdd fuel to it.",
            "",
            "&a+ Accurate collection");

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    public static final SlimefunItemStack SOLAR_PANEL =
            new SlimefunItemStack("Solar panel", Material.DAYLIGHT_DETECTOR, "&bPhotovoltaic cells", "", "&7 is used to synthesize &bsolar generator &7's important parts");

    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE =
            new SlimefunItemStack("Automated panning machine", Material.BOWL, "&aAutomatic gold mining machine", "", "&a&oUpgraded Gold Screen");
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack(
            "Output chest", Material.CHEST, "&4Item output box", "", "&c&oPlace it next to the base machine's launcher", "The items made by &c&o will be placed in the box");
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR =
            new SlimefunItemStack("Hologram projector", Material.QUARTZ_SLAB, "&bholographic projector", "", "&rProject editable holographic text");

    /*		 Enhanced Furnaces 		*/
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack(
            "Enhanced furnace", Material.FURNACE, "&7Fortified Furnace -&eI", "", "&7Burning speed: &e1x", "&7Fuel efficiency: &e1x", "&7Product doubling multiple: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack(
            "Enhanced furnace 2",
            Material.FURNACE,
            "&7Fortified Furnace -&eII",
            "",
            "&7Burning speed: &e2x",
            "&7Fuel efficiency: &e1x",
            "&7Product doubling multiple: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack(
            "Enhanced furnace 3",
            Material.FURNACE,
            "&7Fortified Furnace -&eIII",
            "",
            "&7Burning speed: &e2x",
            "&7Fuel efficiency: &e2x",
            "&7Product doubling multiple: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack(
            "Enhanced furnace 4",
            Material.FURNACE,
            "&7Fortified Furnace -&eIV",
            "",
            "&7Burning speed: &e3x",
            "&7Fuel efficiency: &e2x",
            "&7Product doubling multiple: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack(
            "Enhanced furnace 5",
            Material.FURNACE,
            "&7Fortified Furnace -&eV",
            "",
            "&7Burning speed: &e3x",
            "&7Fuel efficiency: &e2x",
            "&7Product doubling multiple: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack(
            "Enhanced furnace 6",
            Material.FURNACE,
            "&7Fortified Furnace -&eVI",
            "",
            "&7Burning speed: &e3x",
            "&7Fuel efficiency: &e3x",
            "&7Product doubling multiple: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack(
            "Enhanced furnace 7",
            Material.FURNACE,
            "&7Fortified Furnace -&eVII",
            "",
            "&7Burning speed: &e4x",
            "&7Fuel efficiency: &e3x",
            "&7Product doubling multiple: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack(
            "Enhanced furnace 8",
            Material.FURNACE,
            "&7Fortified Furnace -&eVIII",
            "",
            "&7Burning speed: &e4x",
            "&7Fuel efficiency: &e4x",
            "&7Product doubling multiple: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack(
            "Enhanced furnace 9",
            Material.FURNACE,
            "&7Fortified Furnace -&eIX",
            "",
            "&7Burning speed: &e5x",
            "&7Fuel efficiency: &e4x",
            "&7Product doubling multiple: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack(
            "Enhanced furnace 10",
            Material.FURNACE,
            "&7Fortified Furnace -&eX",
            "",
            "&7Burning speed: &e5x",
            "&7Fuel efficiency: &e5x",
            "&7Product doubling multiple: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack(
            "Enhanced furnace 11",
            Material.FURNACE,
            "&7Fortified Furnace -&eXI",
            "",
            "&7Burning speed: &e5x",
            "&7Fuel efficiency: &e5x",
            "&7Product doubling multiple: &e3x");
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack(
            "Reinforced furnace", Material.FURNACE, "&7 Strengthened Alloy Furnace", "", "&7Burning speed: &e10x", "&7Fuel efficiency: &e10x", "&7Product doubling multiple: &e3x");
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack(
            "Carbonado edged furnace",
            Material.FURNACE,
            "&7 black diamond edge furnace",
            "",
            "&7Burning speed: &e20x",
            "&7Fuel efficiency: &e10x",
            "&7Product doubling multiple: &e3x");

    public static final SlimefunItemStack BLOCK_PLACER =
            new SlimefunItemStack("Block placer", Material.DISPENSER, "&aBlock Placer", "", "&rAll blocks within this emitter", "&r will be placed automatically");

    /*		Soulbound Items		*/
    public static final SlimefunItemStack SOULBOUND_SWORD =
            new SlimefunItemStack("Soulbound sword", Material.DIAMOND_SWORD, "&cSoul-bound Sword");
    public static final SlimefunItemStack SOULBOUND_BOW =
            new SlimefunItemStack("Soulbound bow", Material.BOW, "&cSoulbound Bow");
    public static final SlimefunItemStack SOULBOUND_PICKAXE =
            new SlimefunItemStack("Soulbound pickaxe", Material.DIAMOND_PICKAXE, "&cSoulbound Pickaxe");
    public static final SlimefunItemStack SOULBOUND_AXE =
            new SlimefunItemStack("Soulbound axe", Material.DIAMOND_AXE, "&cSoul-bound Ax");
    public static final SlimefunItemStack SOULBOUND_SHOVEL =
            new SlimefunItemStack("Soulbound shovel", Material.DIAMOND_SHOVEL, "&cSoul-bound shovel");
    public static final SlimefunItemStack SOULBOUND_HOE =
            new SlimefunItemStack("Soulbound hoe", Material.DIAMOND_HOE, "&cSoul-bound hoe");

    public static final SlimefunItemStack SOULBOUND_HELMET =
            new SlimefunItemStack("Soulbound helmet", Material.DIAMOND_HELMET, "&cSoulbound Helmet");
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE =
            new SlimefunItemStack("Soulbound chestplate", Material.DIAMOND_CHESTPLATE, "&cSoulbound Breastplate");
    public static final SlimefunItemStack SOULBOUND_LEGGINGS =
            new SlimefunItemStack("Soulbound leggings", Material.DIAMOND_LEGGINGS, "&cSoulbound Leggings");
    public static final SlimefunItemStack SOULBOUND_BOOTS =
            new SlimefunItemStack("Soulbound boots", Material.DIAMOND_BOOTS, "&cSoul-bound boots");
    public static final SlimefunItemStack SOULBOUND_TRIDENT =
            new SlimefunItemStack("Soulbound trident", Material.TRIDENT, "&cSoul-bound Trident");

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE =
            new SlimefunItemStack("Blank rune", new ColoredFireworkStar(Color.BLACK, "&8Blank Rune"));

    public static final SlimefunItemStack AIR_RUNE =
            new SlimefunItemStack("Ancient rune air", new ColoredFireworkStar(Color.AQUA, "&7Ancient Runes &8&l[&b&lQi&8&l]"));
    public static final SlimefunItemStack WATER_RUNE =
            new SlimefunItemStack("Ancient rune water", new ColoredFireworkStar(Color.BLUE, "&7Ancient Runes &8&l[&1&lWater&8&l]"));
    public static final SlimefunItemStack FIRE_RUNE =
            new SlimefunItemStack("Ancient rune fire", new ColoredFireworkStar(Color.RED, "&7Ancient Runes &8&l[&4&lFire&8&l]"));
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack(
            "Ancient rune earth", new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "&7Ancient Runes &8&l[&c&l地&8&l]"));
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack(
            "Ancient rune ender", new ColoredFireworkStar(Color.PURPLE, "&7Ancient Runes &8&l[&5&lEnder&8&l]"));

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack(
            "Ancient rune rainbow", new ColoredFireworkStar(Color.FUCHSIA, "&7Ancient runes &8&l[&d&lrainbow&8&l]"));
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack(
            "Ancient rune lightning", new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "&7Ancient Runes &8&l[&e&lThunder&8&l]"));
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack(
            "Ancient rune soulbound",
            new ColoredFireworkStar(
                    Color.fromRGB(47, 0, 117),
                    "&7Ancient Runes &8&l[&5&lSoul Binding&8&l]",
                    "&eFirst throw the item you want to bind to the ground",
                    "&eThen throw the rune at the object",
                    "&5 can soul bind &ethat item.",
                    " ",
                    "&eIt is recommended that you use it on &6important &eitems.",
                    " ",
                    "&eBound items will not be dropped after death."));
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack(
            "Ancient rune enchantment",
            new ColoredFireworkStar(
                    Color.fromRGB(255, 217, 25),
                    "&7Ancient Runes &8&l[&6&lEnchanting&8&l]",
                    "&eThrow the rune at the one you've already thrown",
                    "&eItems that need to be enchanted with &6&e",
                    "&eThe item will gain a random enchantment property."));
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack(
            "Ancient rune villagers",
            new ColoredFireworkStar(
                    Color.fromRGB(160, 20, 5),
                    "&7ancient runes &8&l[&4&lvillager&8&l]",
                    "&eRight-click to clear villagers",
                    "&eits occupations and trades list.",
                    "&evillagers will appear after a while",
                    "&eLook for a new job yourself."));

    /*		Electricity			*/
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack(
            "Solar generator",
            Material.DAYLIGHT_DETECTOR,
            "&bsolar generator",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "Solar generator 2",
            Material.DAYLIGHT_DETECTOR,
            "&cAdvanced Solar Generator",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "Solar generator 3",
            Material.DAYLIGHT_DETECTOR,
            "&4 black diamond solar generator",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64));
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "Solar generator 4",
            Material.DAYLIGHT_DETECTOR,
            "&eCharging Solar Generator",
            "",
            "&9Can work at night",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256),
            " (Daytime)",
            LoreBuilder.powerPerSecond(128),
            " (at night)");

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack(
            "Coal generator",
            HeadTexture.GENERATOR,
            "&ccoal generator",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack(
            "Coal generator 2",
            HeadTexture.GENERATOR,
            "&cCoal Generator &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack(
            "Lava generator",
            HeadTexture.GENERATOR,
            "&4 Magma Generator",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack(
            "Lava generator 2",
            HeadTexture.GENERATOR,
            "&4Magma Generator &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack(
            "Electric furnace",
            Material.FURNACE,
            "&celectric stove",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack(
            "Electric furnace 2",
            Material.FURNACE,
            "&cElectric stove &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack(
            "Electric furnace 3",
            Material.FURNACE,
            "&cElectric stove &7-&eIII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 4x",
            LoreBuilder.powerPerSecond(10));

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack(
            "Electric ore grinder",
            Material.FURNACE,
            "&cElectric crusher",
            "",
            "&rThe perfect combination of mineral crusher and grinding stone",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(12));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack(
            "Electric ore grinder 2",
            Material.FURNACE,
            "&cElectric crusher &7(&eII&7)",
            "",
            "&rThe perfect combination of mineral crusher and grinding stone",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 4x",
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack(
            "Electric ore grinder 3",
            Material.FURNACE,
            "&cElectric crusher &7(&eIII&7)",
            "",
            "&fThe perfect combination of mineral crusher and grinding stone",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilder.powerPerSecond(90));
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack(
            "Electric ingot pulverizer",
            Material.FURNACE,
            "&celectric powder grinder",
            "",
            "&rTurn the ingot into powder",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack(
            "Auto drier",
            Material.SMOKER,
            "&e automatic dryer",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack(
            "Auto enchanter",
            Material.ENCHANTING_TABLE,
            "&5 automatic enchanting machine",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack(
            "Auto enchanter 2",
            Material.ENCHANTING_TABLE,
            "&5Automatic Enchanting Machine &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack(
            "Auto disenchanter",
            Material.ENCHANTING_TABLE,
            "&5 automatic evil dispelling machine",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack(
            "Auto disenchanter 2",
            Material.ENCHANTING_TABLE,
            "&5Automatic dispelling machine &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack(
            "Auto anvil",
            Material.IRON_BLOCK,
            "&7 automatic anvil",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Repairable percentage: 10%",
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack(
            "Auto anvil 2",
            Material.IRON_BLOCK,
            "&7 Automatic Anvil Mk.II",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Repairable percentage: 25%",
            LoreBuilder.powerPerSecond(32));
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack(
            "Auto brewer",
            Material.SMOKER,
            "&e automatic brewing machine",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(12));

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack(
            "Book binder",
            Material.BOOKSHELF,
            "&6 Enchanted book integration machine",
            "",
            "&fBind multiple enchanted books to one.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16));

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack(
            "Bio reactor",
            Material.LIME_TERRACOTTA,
            "&2 Biogenerator",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7128 J can be saved",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack MULTIMETER =
            new SlimefunItemStack("Multimeter", Material.CLOCK, "&eMultimeter", "", "&rView the energy stored in the machine");

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack(
            "Small capacitor",
            HeadTexture.CAPACITOR_25,
            "&aSmall energy storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR),
            "&8\u21E8 &e\u26A1 &7128 J can be saved");
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack(
            "Medium capacitor",
            HeadTexture.CAPACITOR_25,
            "&aMedium-sized energy storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(512));
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack(
            "Big capacitor",
            HeadTexture.CAPACITOR_25,
            "&aLarge energy storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(1024));
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack(
            "Large capacitor",
            HeadTexture.CAPACITOR_25,
            "&aGiant energy storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(8192));
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack(
            "Carbonado edged capacitor",
            HeadTexture.CAPACITOR_25,
            "&aBlack diamond edge energy storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(65536));
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "Energized capacitor",
            HeadTexture.CAPACITOR_25,
            "&aUltimate energy storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(524288));

    /*		Robots				*/
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack(
            "Programmable android",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cProgrammable robot &7(normal)",
            "",
            "&8\u21E8 &7Function: None",
            "&8\u21E8 &7Fuel efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack(
            "Programmable android farmer",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cProgrammable robot &7(Farmer)",
            "",
            "&8\u21E8 &7Function: Farming",
            "&8\u21E8 &7Fuel efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack(
            "Programmable android miner",
            HeadTexture.PROGRAMMABLE_ANDROID_MINER,
            "&cProgrammable robot &7(miner)",
            "",
            "&8\u21E8 &7Function: Mining",
            "&8\u21E8 &7Fuel efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack(
            "Programmable android woodcutter",
            HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER,
            "&cProgrammable robot &7(Woodcutter)",
            "",
            "&8\u21E8 &7Function: Logging",
            "&8\u21E8 &7Fuel efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack(
            "Programmable android butcher",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cProgrammable robot &7(Butcher)",
            "",
            "&8\u21E8 &7Function: Slaughter",
            "&8\u21E8 &7Damage: 4",
            "&8\u21E8 &7Fuel efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack(
            "Programmable android fisherman",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cProgrammable robot &7(fisherman)",
            "",
            "&8\u21E8 &7Function: Fishing",
            "&8\u21E8 &7Success probability: 10%",
            "&8\u21E8 &7Fuel efficiency: 1.0x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack(
            "Programmable android 2",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cAdvanced programmable robot &7(normal)",
            "",
            "&8\u21E8 &7Function: None",
            "&8\u21E8 &7Fuel efficiency: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack(
            "Programmable android 2 fisherman",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cAdvanced Programmable Robot &7(Fisherman)",
            "",
            "&8\u21E8 &7Function: Fishing",
            "&8\u21E8 &7Success probability: 20%",
            "&8\u21E8 &7Fuel efficiency: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack(
            "Programmable android 2 farmer",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cAdvanced programmable robot &7(Farmer)",
            "",
            "&8\u21E8 &7Function: Farming",
            "&8\u21E8 &7Fuel efficiency: 1.5x",
            "&8\u21E8 &7Can harvest plants in exotic gardens");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack(
            "Programmable android 2 butcher",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cAdvanced programmable robot &7(Butcher)",
            "",
            "&8\u21E8 &7Function: Slaughter",
            "&8\u21E8 &7Damage: 8",
            "&8\u21E8 &7Fuel efficiency: 1.5x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack(
            "Programmable android 3",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&eLicensable programmable robot &7(normal)",
            "",
            "&8\u21E8 &7Function: None",
            "&8\u21E8 &7Fuel efficiency: 3.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack(
            "Programmable android 3 fisherman",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&eLicensable programmable robot &7(fisherman)",
            "",
            "&8\u21E8 &7Function: Fishing",
            "&8\u21E8 &7Success probability: 30%",
            "&8\u21E8 &7Fuel efficiency: 8.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack(
            "Programmable android 3 butcher",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&eLicensable programmable robot &7(Butcher)",
            "",
            "&8\u21E8 &7Function: Slaughter",
            "&8\u21E8 &7Damage: 20",
            "&8\u21E8 &7Fuel efficiency: 8.0x");

    /*		       GPS		       */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack(
            "Gps transmitter",
            HeadTexture.GPS_TRANSMITTER,
            "&bGPS Transmitter",
            "",
            LoreBuilder.powerBuffer(16),
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack(
            "Gps transmitter 2",
            HeadTexture.GPS_TRANSMITTER,
            "&cAdvanced GPS Transmitter",
            "",
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack(
            "Gps transmitter 3",
            HeadTexture.GPS_TRANSMITTER,
            "&4Black Diamond GPS Transmitter",
            "",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(22));
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack(
            "Gps transmitter 4",
            HeadTexture.GPS_TRANSMITTER,
            "&eCharging GPS Transmitter",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(92));

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack(
            "Gps marker tool", Material.REDSTONE_TORCH, "&bGPS Set Waypoint Tool", "", "&r allows you to place markup tools where", "&rSet a teleport point and name it");
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack(
            "Gps control panel", HeadTexture.GPS_CONTROL_PANEL, "&bGPS Control Panel", "", "&rAllows you to track your GPS satellites", "&rAnd manage existing waypoints");
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack(
            "Gps emergency transmitter",
            HeadTexture.GPS_TRANSMITTER,
            "&cGPS emergency transmitter",
            "",
            "&rWhen you die",
            "&rIf the emergency transmitter is in your backpack",
            "&r will automatically set your death location as the waypoint");

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack(
            "Android interface fuel",
            Material.DISPENSER,
            "&7Robot Interaction Interface &c(Fuel)",
            "",
            "&rWhen the script tells it to do so",
            "&rItems stored in the interactive interface",
            "&r will be put into the robot's fuel tank");
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack(
            "Android interface items",
            Material.DISPENSER,
            "&7Robot interaction interface &9(item)",
            "",
            "&rWhen the script tells it to do this",
            "&rItems stored in the robot's inventory",
            "&r will be put into the interactive interface");

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack(
            "Gps geo scanner", HeadTexture.GEO_SCANNER, "&bGPS Terrain Scanner", "", "&rScan how many natural resources are in a block", "&rFor example &8crude oil");
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack(
            "Portable geo scanner", Material.CLOCK, "&bPortable Resource Scanner", "", "&rScan out the natural resources in the block", "", "&eRight click&7 Scan");
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack(
            "Geo miner",
            HeadTexture.GEO_MINER,
            "&6Natural resource mining machine",
            "",
            "&e mine resources from the block",
            "&e can mine resources that cannot be mined with a mining pickaxe",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            "&c&l! &cMake sure you have a GEO terrain scan");
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack(
            "Oil pump", HeadTexture.OIL_PUMP, "&rCrude oil pump", "", "&7Pump out the crude oil and put it into barrels", "", "&c&l! &cPlease scan the terrain of your area first");
    public static final SlimefunItemStack OIL_BUCKET =
            new SlimefunItemStack("Bucket of oil", HeadTexture.OIL_BUCKET, "&rCrude oil barrel");
    public static final SlimefunItemStack FUEL_BUCKET =
            new SlimefunItemStack("Bucket of fuel", HeadTexture.FUEL_BUCKET, "&rFuel barrel");

    public static final SlimefunItemStack REFINERY =
            new SlimefunItemStack("Refinery", Material.PISTON, "&cRefinery", "", "&rRefining crude oil into fuel oil");
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack(
            "Combustion reactor",
            HeadTexture.GENERATOR,
            "&c Combustion Reactor",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack ANDROID_MEMORY_CORE =
            new SlimefunItemStack("Android memory core", HeadTexture.ENERGY_REGULATOR, "&brobot memory core");

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON =
            new SlimefunItemStack("Gps teleporter pylon", Material.PURPLE_STAINED_GLASS, "&5GPS Signal Tower", "", "&7Teleporter Component");
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack(
            "Gps teleportation matrix",
            Material.IRON_BLOCK,
            "&bGPS transmission matrix",
            "",
            "&rThis is the main part of the GPS transmission",
            "&rThis matrix allows players to teleport to",
            "&rSet waypoint");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack(
            "Gps activation device shared",
            Material.STONE_PRESSURE_PLATE,
            "&rGPS Activation Device &3(Public)",
            "",
            "&rPut it on the transport matrix",
            "&rand press this pedal to select",
            "&rThe waypoint to be teleported");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack(
            "Gps activation device personal",
            Material.STONE_PRESSURE_PLATE,
            "&rGPS activated device &a(private)",
            "",
            "&rPut it on the transport matrix",
            "&rand press this pedal to select",
            "&rThe waypoint to be teleported",
            "",
            "&rThis activation device only allows",
            "&rThe person who placed it uses");
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack(
            "Portable teleporter",
            Material.COMPASS,
            "&bPortable transmitter",
            "",
            "&f allows you to teleport to",
            "&fThe teleport point to be teleported",
            "",
            LoreBuilder.powerCharged(0, 50),
            "",
            "&eright click&7 use");

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack(
            "Elevator plate",
            Material.STONE_PRESSURE_PLATE,
            "&bElevator board",
            "",
            "&rPlace elevator panels on each floor",
            "&rYou will be able to teleport between each level.",
            "",
            "&eRight-click the elevator board&7 to name this floor");

    public static final SlimefunItemStack INFUSED_HOPPER =
            new SlimefunItemStack("Infused hopper", Material.HOPPER, "&5suction funnel", "", "&rAutomatic suction near the funnel", "All items in range &r7x7x7");

    public static final SlimefunItemStack PLASTIC_SHEET =
            new SlimefunItemStack("Plastic sheet", Material.PAPER, "&rPlastic paper");

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack(
            "Heated pressure chamber",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cHeated pressure chamber",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack(
            "Heated pressure chamber 2",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cHeated pressure chamber &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 5x",
            LoreBuilder.powerPerSecond(44));

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack(
            "Electric smeltery",
            Material.FURNACE,
            "&celectric smelting furnace",
            "",
            "&4 only supports alloys, powder cannot be smelted into ingots",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack(
            "Electric smeltery 2",
            Material.FURNACE,
            "&cElectric smelting furnace &7-&eII",
            "",
            "&4 only supports alloys, powder cannot be smelted into ingots",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack(
            "Electric press",
            HeadTexture.ELECTRIC_PRESS,
            "&ecompressor",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack(
            "Electric press 2",
            HeadTexture.ELECTRIC_PRESS,
            "&eCompressor &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack(
            "Electrified crucible",
            Material.RED_TERRACOTTA,
            "&cElectric crucible",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack(
            "Electrified crucible 2",
            Material.RED_TERRACOTTA,
            "&cElectric crucible &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            "&8\u21E8 &e\u26A1 &780 J/s");
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack(
            "Electrified crucible 3",
            Material.RED_TERRACOTTA,
            "&cElectric crucible &7-&eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 4x",
            "&8\u21E8 &e\u26A1 &7120 J/s");

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack(
            "Carbon press",
            Material.BLACK_STAINED_GLASS,
            "&cCarbon Press",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack(
            "Carbon press 2",
            Material.BLACK_STAINED_GLASS,
            "&cCarbon Press &7-&eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack(
            "Carbon press 3",
            Material.BLACK_STAINED_GLASS,
            "&cCarbon Press &7-&eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 15x",
            "&8\u21E8 &e\u26A1 &7180 J/s");

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack(
            "Blistering ingot",
            Material.GOLD_INGOT,
            "&6Foaming Tablets&7(33%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack(
            "Blistering ingot 2",
            Material.GOLD_INGOT,
            "&6Foaming Tablets &7(66%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack(
            "Blistering ingot 3",
            Material.GOLD_INGOT,
            "&6 foaming tablets",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack ENERGY_REGULATOR =
            new SlimefunItemStack("Energy regulator", HeadTexture.ENERGY_REGULATOR, "&6Energy Regulator", "", "&rThe core part of the energy network");
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack(
            "Energy connector",
            HeadTexture.ENERGY_CONNECTOR,
            "&cEnergy Connector",
            LoreBuilder.range(6),
            "",
            "&f is used to connect machines and generators",
            "&fcan connect to nearby energy networks");
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack(
            "Debug fish",
            Material.SALMON,
            "&3How much does this fish cost?",
            "",
            "&eright-click &rany block to view its block data",
            "&eLeft click &rDestroy blocks",
            "&eShift + Left Click &rAny block to clear its block data",
            "&eShift + right click &rPlace a placeholder block");

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack(
            "Nether ice",
            HeadTexture.NETHER_ICE,
            "&eNether Ice",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack(
            "Enriched nether ice",
            HeadTexture.ENRICHED_NETHER_ICE,
            "&eCondensed nether ice",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL =
            new SlimefunItemStack("Nether ice coolant cell", HeadTexture.NETHER_ICE_COOLANT_CELL, "&6Nether Ice Coolant");

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER =
            new SlimefunItemStack("Cargo manager", HeadTexture.CARGO_MANAGER, "&6Shipping Manager", "", "&rCore components of the item transfer network");
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE =
            new SlimefunItemStack("Cargo node", HeadTexture.CARGO_CONNECTOR_NODE, "&7Freight Node &c(Connector)", "", "&rFreight connection pipeline");
    public static final SlimefunItemStack CARGO_INPUT_NODE =
            new SlimefunItemStack("Cargo node input", HeadTexture.CARGO_INPUT_NODE, "&7Freight node &c(input)", "", "&rFreight input pipeline");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE =
            new SlimefunItemStack("Cargo node output", HeadTexture.CARGO_OUTPUT_NODE, "&7Freight node &c(output)", "", "&rFreight output pipeline");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack(
            "Cargo node output advanced", HeadTexture.CARGO_OUTPUT_NODE, "&6Advanced Freight Node &c(output)", "", "&rFreight output pipeline");

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack(
            "Auto breeder",
            Material.HAY_BLOCK,
            "&eautomatic feeding machine",
            "",
            "&rNeed &aOrganic food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/animals");
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack(
            "Produce collector",
            Material.HAY_BLOCK,
            "&bFully automatic collection machine",
            "",
            "&fThis machine can automatically charge",
            "&fAnimal products produced by nearby animals.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32));

    public static final SlimefunItemStack ORGANIC_FOOD =
            new SlimefunItemStack("Organic food", HeadTexture.FILLED_CAN, "&aorganic food", "&7contains &9???");
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food wheat", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7contains &9wheat");
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food carrot", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Carrot");
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food potato", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Potatoes");
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food seeds", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9wheat seeds");
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food beetroot", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9Beets");
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food melon", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9watermelon");
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food apple", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9apples");
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food sweet berries", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9berries");
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food kelp", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9dried kelp");
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food cocoa", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains &9cocoa beans");
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack(
            "Organic food seagrass", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Contains: &9Seaweed");

    public static final SlimefunItemStack FERTILIZER =
            new SlimefunItemStack("Fertilizer", HeadTexture.FILLED_CAN, "&aorganic fertilizer", "&7contains &9???");
    public static final SlimefunItemStack WHEAT_FERTILIZER =
            new SlimefunItemStack("Fertilizer wheat", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7contains &9wheat");
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack(
            "Fertilizer carrot", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Carrot");
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack(
            "Fertilizer potato", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Potatoes");
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack(
            "Fertilizer seeds", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9wheat seeds");
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack(
            "Fertilizer beetroot", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9Beets");
    public static final SlimefunItemStack MELON_FERTILIZER =
            new SlimefunItemStack("Fertilizer melon", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9watermelon");
    public static final SlimefunItemStack APPLE_FERTILIZER =
            new SlimefunItemStack("Fertilizer apple", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9apples");
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack(
            "Fertilizer sweet berries", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9berries");
    public static final SlimefunItemStack KELP_FERTILIZER =
            new SlimefunItemStack("Fertilizer kelp", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9dried kelp");
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack(
            "Fertilizer cocoa", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains &9cocoa beans");
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack(
            "Fertilizer seagrass", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Contains: &9Seaweed");

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "Animal growth accelerator",
            Material.HAY_BLOCK,
            "&bAnimal Growth Accelerator",
            "",
            "&rNeed &aOrganic food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(28));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "Crop growth accelerator",
            Material.LIME_TERRACOTTA,
            "&aCrop Growth Accelerator",
            "",
            "&rNeed &aOrganic fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Radius: 7x7",
            "&8\u21E8 &7Speed: &a3/times",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack(
            "Crop growth accelerator 2",
            Material.LIME_TERRACOTTA,
            "&aCrop Growth Accelerator &7(&eII&7)",
            "",
            "&rNeed &aOrganic fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Radius: 9x9",
            "&8\u21E8 &7Speed: &a4/times",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/s");
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "Tree growth accelerator",
            Material.BROWN_TERRACOTTA,
            "&aTree Growth Accelerator",
            "",
            "&rNeed &aOrganic fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Radius: 9x9",
            "&8\u21E8 &7Speed: &a4/times",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack(
            "Food fabricator",
            Material.GREEN_STAINED_GLASS,
            "&cfood processor",
            "",
            "&rcan produce &aorganic food",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack(
            "Food fabricator 2",
            Material.GREEN_STAINED_GLASS,
            "&cFood Processor &7(&eII&7)",
            "",
            "&rcan produce &aorganic food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 6x",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack(
            "Food composter",
            Material.GREEN_TERRACOTTA,
            "&cfood composter",
            "",
            "&rcan produce &aorganic fertilizers",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack(
            "Food composter 2",
            Material.GREEN_TERRACOTTA,
            "&cFood Composter &7(&eII&7)",
            "",
            "&rcan produce &aorganic fertilizers",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 10x",
            LoreBuilder.powerBuffer(512),
            "&8\u21E8 &e\u26A1 &752 J/s");

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack(
            "Xp collector",
            HeadTexture.EXP_COLLECTOR,
            "&aExperience Collector",
            "",
            "&rCollect nearby experiences and store them",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack REACTOR_COOLANT_CELL =
            new SlimefunItemStack("Reactor collant cell", HeadTexture.COOLANT_CELL, "&breactor coolant");

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack(
            "Nuclear reactor",
            HeadTexture.NUCLEAR_REACTOR,
            "&2 Nuclear Reactor",
            "",
            "&rNeed coolant!",
            "&8\u21E8 &bmust be surrounded by water",
            "&8\u21E8 &bMust work with reactor coolant",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &716384 J can be saved",
            "&8\u21E8 &e\u26A1 &7500 J/s");
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack(
            "Netherstar reactor",
            HeadTexture.NETHER_STAR_REACTOR,
            "&rNetherstar Reactor",
            "",
            "&rRequires Nether Star",
            "&8\u21E8 &bmust be surrounded by water",
            "&8\u21E8 &bMust work with nether ice coolant",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &732768 J can be saved",
            "&8\u21E8 &e\u26A1 &71024 J/s",
            "&8\u21E8 &4 will cause nearby creatures to gain the wither effect");
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack(
            "Reactor access port",
            Material.CYAN_TERRACOTTA,
            "&2Reactor access interface",
            "",
            "&rAllows you to access the reactor through the cargo node",
            "&r can also be used to store",
            "",
            "&8\u21E8 &cMust &e be placed in the third space above the reactor");

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack(
            "Freezer",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&brefrigerator",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack(
            "Freezer 2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&brefrigerator &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack FREEZER_3 = new SlimefunItemStack(
            "Freezer 3",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&brefrigerator &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(42));

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack(
            "Electric gold pan",
            Material.BROWN_TERRACOTTA,
            "&6 Electric gold mining machine",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack(
            "Electric gold pan 2",
            Material.BROWN_TERRACOTTA,
            "&6Electric gold mining machine &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 3x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack(
            "Electric gold pan 3",
            Material.BROWN_TERRACOTTA,
            "&6Electric gold mining machine &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 10x",
            LoreBuilder.powerPerSecond(14));

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack(
            "Electric dust washer",
            Material.BLUE_STAINED_GLASS,
            "&3 Electric Washing Machine",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack(
            "Electric dust washer 2",
            Material.BLUE_STAINED_GLASS,
            "&3Electric washing machine &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack(
            "Electric dust washer 3",
            Material.BLUE_STAINED_GLASS,
            "&3Electric washing machine &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 10x",
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack(
            "Electric ingot factory",
            Material.RED_TERRACOTTA,
            "&celectric ingot casting machine",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 1x",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack(
            "Electric ingot factory 2",
            Material.RED_TERRACOTTA,
            "&cElectric ingot casting machine &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 2x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack(
            "Electric ingot factory 3",
            Material.RED_TERRACOTTA,
            "&cElectric ingot casting machine &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Speed: 8x",
            LoreBuilder.powerPerSecond(40));

    // @Deprecated
    // public static final SlimefunItemStack AUTOMATED_CRAFTING_CHAMBER = new
    // SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6自动合成机", "",
    // LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710
    // J/个物品");

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack(
            "Fluid pump",
            Material.BLUE_TERRACOTTA,
            "&9 fluid pump",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &732 J/squares");
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack(
            "Charging bench",
            Material.CRAFTING_TABLE,
            "&6 charging station",
            "",
            "&rAbility to charge items, such as a jetpack",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7128 J can be saved",
            "&8\u21E8 &e\u26A1 &7Energy loss rate: &c50%");

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack(
            "Vanilla auto crafter",
            HeadTexture.VANILLA_AUTO_CRAFTER,
            "&2Automatic synthesis machine &8(original version)",
            "",
            "&fPlace the machine on any block that can hold items",
            "&f can automatically synthesize anything!",
            "&fCan be synthesized by &eOrdinary workbench &fItems that can be synthesized",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7The cost of synthesizing items is 16 J");
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack(
            "Enhanced auto crafter",
            HeadTexture.ENHANCED_AUTO_CRAFTER,
            "&2Automatic synthesis machine &8(Advanced)",
            "",
            "&fPlace the machine on any block that can hold items",
            "&f can automatically synthesize anything!",
            "&fCan be synthesized &eAdvanced Workbench &fItems that can be synthesized",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7The cost of synthesizing items is 16 J");
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack(
            "Armor auto crafter",
            HeadTexture.ARMOR_AUTO_CRAFTER,
            "&2Automatic synthesis machine &8(Armor forging)",
            "",
            "&fPlace the machine on any block that can hold items",
            "&f will automatically synthesize items that can be synthesized at the armor forging bench.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Synthetic items consume 32 J");

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack(
            "Iron golem assembler",
            Material.IRON_BLOCK,
            "&6Iron puppet assembly machine",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Cooling time: &b30 seconds",
            LoreBuilder.powerBuffer(4096),
            "&8\u21E8 &e\u26A1 &72048 J/an iron puppet");
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack(
            "Wither assembler",
            Material.OBSIDIAN,
            "&5 Wither Assembly Machine",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Cooling time: &b30 seconds",
            "&8\u21E8 &e\u26A1 &74096 J can be saved",
            "&8\u21E8 &e\u26A1 &74096 J/wither");

    public static final SlimefunItemStack TRASH_CAN =
            new SlimefunItemStack("Trash can block", HeadTexture.TRASH_CAN, "&3Trash can", "", "&rYou can put unwanted items here");

    public static final SlimefunItemStack ELYTRA_SCALE =
            new SlimefunItemStack("Elytra scale", Material.FEATHER, "&bElytra scales");
    public static final SlimefunItemStack INFUSED_ELYTRA =
            new SlimefunItemStack("Infused elytra", Material.ELYTRA, "&5 elytra (experience repair)");
    public static final SlimefunItemStack SOULBOUND_ELYTRA =
            new SlimefunItemStack("Soulbound elytra", Material.ELYTRA, "&cElytra (soul bound)");

    public static final SlimefunItemStack MAGNESIUM_SALT =
            new SlimefunItemStack("Magnesium salt", Material.SUGAR, "&cmagnesium salt", "", "&7 is a special fuel that can be used in magnesium generators");
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack(
            "Magnesium generator",
            HeadTexture.GENERATOR,
            "&cmagnesium generator",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(36));

    // 别删
    public static final SlimefunItemStack CRAFTER_SMART_PORT = new SlimefunItemStack(
            "Crafter smart port", Material.LIME_STAINED_GLASS, "&aSynthetic Machine Intelligent Interactive Interface", "", "&5 can allocate the input quantity according to the quantity of materials in the synthesis table", "&5 and has the specified output slot");

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
