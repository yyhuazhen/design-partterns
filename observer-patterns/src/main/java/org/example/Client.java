package org.example;

/**
 * 观察者模式本质：触发联动
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //创建目标对象
        SubjectImpl subject = new SubjectImpl();
        //创建观察者
        Observer a = new ObserverImpl("A");
        Observer b = new ObserverImpl("B");
        Observer c = new ObserverImpl("C");
        //订阅目标对象
        subject.attach(a,b,c);
        subject.setSubjectStatus("我变了");
        subject.notifies();
        subject.dttach(a,b);
        subject.setSubjectStatus("我把不听话的A,B 拉黑了");
        subject.notifies();
    }
}
