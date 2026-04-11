package org.example.beans_with_annotations;

public class MyRepository
{
    MyService myService;

    public MyService getMyService() {
        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public void callServiceMethod()
    {
        myService.printDateTime();
    }


}
