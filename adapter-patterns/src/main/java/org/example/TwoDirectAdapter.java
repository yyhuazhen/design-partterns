package org.example;

import java.util.ArrayList;
import java.util.List;

/*
 * 双向适配器
 * */
public class TwoDirectAdapter implements LogOperateApi, DbLogOperateApi {
    private LogOperateApi logOperateApi;
    private DbLogOperateApi dbLogOperateApi;

    public TwoDirectAdapter(LogOperateApi logOperateApi, DbLogOperateApi dbLogOperateApi) {
        this.logOperateApi = logOperateApi;
        this.dbLogOperateApi = dbLogOperateApi;
    }

    @Override
    public List<LogModel> readLogFile() {
        return dbLogOperateApi.getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        for (LogModel model : list
        ) {
            dbLogOperateApi.createLog(model);
        }
    }

    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = new ArrayList<>();
        list.add(lm);
        logOperateApi.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> logModels = logOperateApi.readLogFile();
        for (LogModel log : logModels
        ) {
            if(lm.getLogId().equals(log.getLogId())){
                log = lm;
            }
        }
    }

    @Override
    public boolean deleteLog(String logId) {
        List<LogModel> logModels = logOperateApi.readLogFile();
        for (int i = 0; i <logModels.size() ; i++) {
            if(logId.equals(logModels.get(i).getLogId())){
                logModels.remove(i);
            }
        }
        return true;
    }

    @Override
    public List<LogModel> getAllLog() {
        return logOperateApi.readLogFile();
    }
}
