package org.example;

import java.util.List;

public interface LogOperateApi {
    List<LogModel> readLogFile();

    void writeLogFile(List<LogModel> list);
}
