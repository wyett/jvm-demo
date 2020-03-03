package com.wyett.tools;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/3 17:03
 * @description: TODO
 */

// cast object to TheSomeClassLoadedByDiffCLassLoader
public class TheSomeClassLoadedByDiffCLassLoader {
    private TheSomeClassLoadedByDiffCLassLoader theSomeClassLoadedByDiffCLassLoader;

    public void setTheSomeClassLoadedByDiffCLassLoader(Object theSomeClassLoadedByDiffCLassLoader) {
        this.theSomeClassLoadedByDiffCLassLoader =
                (TheSomeClassLoadedByDiffCLassLoader) theSomeClassLoadedByDiffCLassLoader;
    }
}
