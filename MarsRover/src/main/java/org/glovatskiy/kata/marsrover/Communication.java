package org.glovatskiy.kata.marsrover;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Communication {

    static Logger logger = Logger.getLogger("org.glovatskiy.kata.marsrover.Communication");
    private Communication() {}

    public static void say(String sentence){
        logger.log(Level.INFO, sentence);
    }

}
