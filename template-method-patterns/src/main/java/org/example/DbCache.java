package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据库模拟
 */
public class DbCache {
    private static HashMap<String, LoginModel> cache;

    public static void saveUser(LoginModel loginModel) {
        if (cache == null) {
            cache = new HashMap<>();
        }
        cache.put(loginModel.getUserId(), loginModel);
    }

    public static LoginModel getUser(String userId) {
        if (!cache.isEmpty() && cache != null && cache.containsKey(userId)) {
            return cache.get(userId);
        } else {
            return null;
        }
    }

    public static void printAll() {
        for (Map.Entry entry : cache.entrySet()
        ) {
            System.out.println(entry.getValue().toString());
        }
    }
}
