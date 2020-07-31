package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SubjectImpl implements Subject {
    private List<Observer> observerList =new ArrayList<>();
    private String subjectStatus;

    @Override
    public void attach(Observer... observer) {
        for (Observer ob:observer
             ) {
            observerList.add(ob);
        }
    }

    @Override
    public void dttach(Observer... observer) {
        for (Observer ob:observer
        ) {
            observerList.remove(ob);
        }
    }

    @Override
    public void notifies() {
        for (Observer observer : observerList
        ) {
            observer.update(this);
        }
    }
}
