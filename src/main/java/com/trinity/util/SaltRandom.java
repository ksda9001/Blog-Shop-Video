package com.trinity.util;

import java.util.UUID;

public class SaltRandom {
    public String getRandomSalt(){
        return UUID.randomUUID().toString().toUpperCase();
    }
}
