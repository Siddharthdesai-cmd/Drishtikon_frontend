package objectRepo;

import java.util.HashMap;
import java.util.Map;

public class FlutterFinder {
    public Map<String, Object> byValueKey(String key) {
        Map<String, Object> args = new HashMap<>();
        args.put("finderType", "ByValueKey");
        args.put("keyValueString", key);
        args.put("keyValueType", "String");
        return args;
    }

    public Map<String, Object> byText(String text) {
        Map<String, Object> args = new HashMap<>();
        args.put("finderType", "ByText");
        args.put("text", text);
        return args;
    }

    public Map<String, Object> byTooltip(String tooltip) {
        Map<String, Object> args = new HashMap<>();
        args.put("finderType", "ByTooltipMessage");
        args.put("text", tooltip);
        return args;
    }
}

 
