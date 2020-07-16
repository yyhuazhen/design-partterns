package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LogModel logModel = new LogModel();
        logModel.setLogId("123456");
        logModel.setOperateTime("2020-07-14");
        logModel.setOperateUser("小明");
        logModel.setContent("这是一个测试日志");
        LogOperateApi api = new FileLogOperateApiImpl();
        List<LogModel> models = new ArrayList<LogModel>();
        models.add(logModel);
        api.writeLogFile(models);
        List<LogModel> list = api.readLogFile();
        if (!list.isEmpty()) {
            for (LogModel model : list) {
                System.out.println(model.getContent());
            }
        }
    }
}
