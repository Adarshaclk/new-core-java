package com.java.restruntException.services;

import com.java.restruntException.dto.RestrauntDto;

public abstract class RestrauntImplimentation implements RestrauntInterface{
    @Override
    public boolean validate(RestrauntDto restrauntDto) {
        
        return false;
    }
}
