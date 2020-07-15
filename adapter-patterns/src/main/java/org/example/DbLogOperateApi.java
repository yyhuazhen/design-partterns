package org.example;

import java.util.List;

public interface DbLogOperateApi {
    void createLog(LogModel lm);

    void updateLog(LogModel lm);

    boolean deleteLog(String logId);

    List<LogModel> getAllLog();
}
