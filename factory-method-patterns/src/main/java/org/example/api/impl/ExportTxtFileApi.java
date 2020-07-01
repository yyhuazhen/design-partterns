package org.example.api.impl;

import org.example.api.ExportFileApi;

public class ExportTxtFileApi implements ExportFileApi {
    @Override
    public boolean export() {
        System.out.println("导出TXT格式文件");
        return true;
    }
}
