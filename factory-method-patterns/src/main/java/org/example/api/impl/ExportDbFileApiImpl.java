package org.example.api.impl;

import org.example.api.ExportFileApi;

public class ExportDbFileApiImpl implements ExportFileApi {
    @Override
    public boolean export() {
        System.out.println("导出数据库中数据文件");
        return true;
    }
}
