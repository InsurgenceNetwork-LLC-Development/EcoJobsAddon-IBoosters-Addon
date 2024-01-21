package com.insurgencedev.ecojobsaddon;

import com.insurgencedev.ecojobsaddon.listeners.EcoJobsEventListener;
import org.bukkit.Bukkit;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "EcoJobsAddon", version = "1.0.1", author = "InsurgenceDev", description = "EcoJobs Support")
public class EcoJobsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Bukkit.getPluginManager().isPluginEnabled("EcoJobs")) {
            registerEvent(new EcoJobsEventListener());
        }
    }
}
