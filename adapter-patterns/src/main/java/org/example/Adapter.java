package org.example;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements DbLogOperateApi {
    private LogOperateApi fileLog;

    public Adapter(LogOperateApi logOperateApi) {
        this.fileLog = logOperateApi;
    }

    @Override
    public void createLog(LogModel lm) {
        ArrayList<LogModel> logs = new ArrayList<>();
        logs.add(lm);
        fileLog.writeLogFile(logs);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = new ArrayList<>();
        list.add(lm);
        fileLog.writeLogFile(list);
    }

    @Override
    public boolean deleteLog(String logId) {
        System.out.println("删除日志");
        return true;
    }

    @Override
    public List<LogModel> getAllLog() {
        List<LogModel> logs = fileLog.readLogFile();
        return logs;
    }
}
