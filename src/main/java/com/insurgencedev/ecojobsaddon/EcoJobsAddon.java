package com.insurgencedev.ecojobsaddon;

import com.insurgencedev.ecojobsaddon.listeners.EcoJobsEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;
import org.insurgencedev.insurgenceboosters.libs.fo.Common;

@IBoostersAddon(name = "EcoJobsAddon", version = "1.0.3", author = "InsurgenceDev", description = "EcoJobs Support")
public class EcoJobsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadAblesStart() {
        if (Common.doesPluginExist("EcoJobs")) {
            registerEvent(new EcoJobsEventListener());
        }
    }
}
