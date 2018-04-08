package com.coderedd.adhdapt.model;

import android.app.Activity;

public class MeditationTool implements ITool
{
    private Activity _targetActivity;
    private int _name;
    private int _icon;
    private int _background;

    @Override
    public Activity targetActivity() { return _targetActivity; }
    @Override
    public int nameResource() { return _name; }
    @Override
    public int iconResource() { return _icon; }
    @Override
    public int backgroundResource() { return _background; }
}
