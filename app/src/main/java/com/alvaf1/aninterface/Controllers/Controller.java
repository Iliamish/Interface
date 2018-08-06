package com.alvaf1.aninterface.Controllers;

import com.alvaf1.aninterface.Classes.MyInterface;

import java.util.Timer;
import java.util.TimerTask;

public class Controller {

public void Tick(final MyInterface myInterface) {
    new Timer().schedule(new TimerTask() {
        @Override
        public void run() {
            myInterface.Update();
        }
    }, 1000);
}
}
