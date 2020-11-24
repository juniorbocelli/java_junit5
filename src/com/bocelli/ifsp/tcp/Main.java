package com.bocelli.ifsp.tcp;

import com.bocelli.ifsp.tcp.model.Shop;
import com.bocelli.ifsp.tcp.views.ViewMain;

import java.io.IOException;

public class Main {

    private static Shop shop;
    private static Main instance;

    public Main() {
        instance = this;
    }

    public static Main getInstance() {
        return instance;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        shop = new Shop();
        ViewMain viewMain = new ViewMain();
        viewMain.mainMenu();
    }

    public static Shop getShop() {
        return shop;
    }
}
