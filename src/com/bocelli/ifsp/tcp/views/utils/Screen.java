package com.bocelli.ifsp.tcp.views.utils;

import java.io.IOException;

public class Screen {
    public static void clean() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
}
