package com.huihui.sxt;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author huihui
 * @create 2021-10-16-20:47
 */
public class Music {
    public Music() throws FileNotFoundException, JavaLayerException {

        Player player;
        String str = System.getProperty("user.dir") + "/Supermario/src/Music/music.wav";
        BufferedInputStream name = new BufferedInputStream(new FileInputStream(str));
        player = new Player(name);
        player.play();
    }
}
