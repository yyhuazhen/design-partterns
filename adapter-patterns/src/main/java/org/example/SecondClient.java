package org.example;

import java.util.List;

public class SecondClient {
    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogId("123456");
        logModel.setOperateTime("2020-07-14");
        logModel.setOperateUser("小明");
        logModel.setContent("这是一个测试存入数据库中的日志");
        Adapter adapter = new Adapter(new FileLogOperateApiImpl());
        adapter.createLog(logModel);
        List<LogModel> allLog = adapter.getAllLog();
        for (LogModel log : allLog
        ) {
            System.out.println(log.toString());
        }
        DbLogOperateApi dbLog = new DbLogOperateApiImpl();
        dbLog.createLog(logModel);
        List<LogModel> logs = dbLog.getAllLog();
        for (LogModel log : logs
        ) {
            System.out.println(log.toString());
        }
    }
}
