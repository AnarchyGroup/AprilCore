package net.blockhost.aprilcore;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class AprilCore extends JavaPlugin {
    @Override
    public void onEnable() {

    }

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event) {
        Random rand = ThreadLocalRandom.current();
        PotionEffectType[] values = PotionEffectType.values();
        event.getPlayer().addPotionEffect(
                new PotionEffect(values[rand.nextInt(values.length)],
                rand.nextInt(1000),
                rand.nextInt(3)));
    }
}
