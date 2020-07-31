package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ObserverImpl implements Observer {
    private String observerName;

    @Override
    public void update(Subject subject) {
        SubjectImpl subjectImpl = (SubjectImpl) subject;
        String subjectStatus = subjectImpl.getSubjectStatus();
        System.out.println(observerName+"观察的目标对象状态发生改变:" + subjectStatus);
    }
}
