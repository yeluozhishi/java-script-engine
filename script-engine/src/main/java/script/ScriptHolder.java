package script;

import lombok.Getter;
import script.scriptInterface.IScript;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Getter
public enum ScriptHolder {
    INSTANCE;

    private ScriptEngine scriptEngine;

    public void init(boolean dev, String[] scriptPath, String packageName) throws IOException, ScannerClassException, InvocationTargetException, InstantiationException, IllegalAccessException {
        scriptEngine = new ScriptEngine(dev, scriptPath, packageName);
        scriptEngine.reload();
    }

    public <T extends IScript> T getScript(Class<T> key) {
        return scriptEngine.getScript(key);
    }

}
