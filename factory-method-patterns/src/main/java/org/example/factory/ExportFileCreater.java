package org.example.factory;

import org.example.api.ExportFileApi;

public abstract class ExportFileCreater {
    public void exprot(String single) {
        boolean export = creator(single).export();
        System.out.println(export);
    }

    public abstract ExportFileApi creator(String single);
}
