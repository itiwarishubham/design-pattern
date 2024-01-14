package com.design.pattern.singleton;

public class ConfigurationManager {

    private static ConfigurationManager configurationManager;
    private ConfigurationManager(){

    }

    public static ConfigurationManager getConfigurationManager(){
        if(configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}
