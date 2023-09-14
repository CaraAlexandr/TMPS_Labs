package com.example.solid;

import com.example.solid.interfaces.CageCleaner;

public class CrazyPerson implements CageCleaner {
    @Override
    public void cleanCage(String size) {
        System.out.println("I'll just set this" + size + "on fire...🔥🔥🔥🔥🔥🔥");
    }
}
