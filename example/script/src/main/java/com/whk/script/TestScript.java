package com.whk.script;

import script.annotation.Script;

@Script
public class TestScript implements ITestScript {
    @Override
    public int plus(int i, int i1) {
        return i + i1;
    }
}
