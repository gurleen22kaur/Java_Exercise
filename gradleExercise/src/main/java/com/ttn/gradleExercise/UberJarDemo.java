package com.ttn.gradleExercise;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by gurleen on 6/10/18.
 */
public class UberJarDemo {
    public static void main(String[] args) {
            System.out.println(" Join Strings using separator >>>" +
                    StringUtils.join(new String[] { "AB", "CD", "EF" }, "YES"));
        }
}

