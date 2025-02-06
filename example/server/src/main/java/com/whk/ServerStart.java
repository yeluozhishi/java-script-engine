package com.whk;

import com.whk.script.ITestScript;
import script.ScannerClassException;
import script.ScriptHolder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class ServerStart {
    public static void main(String[] args) throws IOException, ScannerClassException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 开发模式下，此处启动无法加载脚本代码类，需要从script中启动。
        ScriptHolder.INSTANCE.init(true, new String[]{}, "com.whk.script");
        int result = ScriptHolder.INSTANCE.getScript(ITestScript.class).plus(5, 6);
        System.out.println(result);
    }
}
