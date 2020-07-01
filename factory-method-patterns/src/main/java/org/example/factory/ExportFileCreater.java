package org.example.factory;

import org.example.api.ExportFileApi;

public abstract class ExportFileCreater {
    public void exprot(String single) {
        creator(single).export();
    }

    public abstract ExportFileApi creator(String single);
}
