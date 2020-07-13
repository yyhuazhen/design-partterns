package org.example;

import java.io.*;
import java.util.List;

public class FileLogOperateApiImpl implements LogOperateApi {
    private String logFilePath = "AdapterLog.log";

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream objIn = null;
        File file = new File(logFilePath);
        try {
            if (file.exists()) {
                objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(logFilePath))));
                list = (List<LogModel>) objIn.readObject();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objIn != null) {
                    objIn.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    @Override
    public void writeLogFile(List<LogModel> list) {
        ObjectOutputStream objOut = null;
        try {
            if (!list.isEmpty()) {
                objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(logFilePath))));
                objOut.writeObject(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
