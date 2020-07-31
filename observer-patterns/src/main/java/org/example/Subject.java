package org.example;

/**
 * 目标对象（通知）
 */
public interface Subject {
    void attach(Observer... observer);

    void dttach(Observer... observer);

    void notifies();
}
