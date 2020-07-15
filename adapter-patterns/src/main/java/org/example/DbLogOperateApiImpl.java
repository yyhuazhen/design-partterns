package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DbLogOperateApiImpl implements DbLogOperateApi {
    private HashMap<String, LogModel> cache = new HashMap<>();

    @Override
    public void createLog(LogModel lm) {
        cache.put(lm.getLogId(), lm);
    }

    @Override
    public void updateLog(LogModel lm) {
        cache.put(lm.getLogId(), lm);
    }

    @Override
    public boolean deleteLog(String logId) {
        if (cache.containsKey(logId)) {
            cache.remove(logId);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public List<LogModel> getAllLog() {
        Collection<LogModel> values = cache.values();
        List<LogModel> logs = values.stream().collect(Collectors.toList());
        return logs;
    }
}
