package com.insurgencedev.ecojobsaddon;

import com.insurgencedev.ecojobsaddon.listeners.EcoJobsEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "EcoJobsAddon", version = "1.0.0", author = "InsurgenceDev", description = "EcoJobs Support")
public class EcoJobsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        registerEvent(new EcoJobsEventListener());
    }
}
