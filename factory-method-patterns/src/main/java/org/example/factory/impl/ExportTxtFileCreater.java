package org.example.factory.impl;

import org.example.api.ExportFileApi;
import org.example.api.impl.ExportDbFileApiImpl;
import org.example.api.impl.ExportTxtFileApi;
import org.example.factory.ExportFileCreater;

public class ExportTxtFileCreater extends ExportFileCreater {
    @Override
    public ExportFileApi creator(String single) {
        if (single.equals("rdb")) {
            return new ExportDbFileApiImpl();
        } else {
            return new ExportTxtFileApi();
        }
    }
}
