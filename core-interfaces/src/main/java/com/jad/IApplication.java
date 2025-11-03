package com.jad;


public interface IApplication {
    void manageOrder(UserAction userAction);

    IDataManager getDataManager();
}
