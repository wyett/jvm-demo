package com.wyett.classloaderdemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/2 17:19
 * @description: TODO
 */

public class ApplicationClassloaderDemo {
    public static void main(String[] args) {
        String appClassloaderPath = System.getProperty("java.class.path");
        List<String> appClassPath = Arrays.asList(appClassloaderPath.split(";"));
        for (String path : appClassPath) {
            System.out.println(path);
        }
    }
}

/**
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\charsets.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\deploy.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\access-bridge-64.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\cldrdata.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\dnsns.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\jaccess.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\jfxrt.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\localedata.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\nashorn.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunec.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunjce_provider.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunmscapi.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\sunpkcs11.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext\zipfs.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\javaws.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\jce.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\jfr.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\jfxswt.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\jsse.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\management-agent.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\plugin.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\resources.jar
 * D:\Program Files\Java\jdk1.8.0_231\jre\lib\rt.jar
 * E:\mycode\mygit\jvm-demo\target\classes
 * D:\Program Files\JetBrains\IntelliJ IDEA 2019.2.4\lib\idea_rt.jar
 */
