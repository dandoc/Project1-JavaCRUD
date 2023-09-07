package com.mycom.word;

public interface ICRUD {
    public Object add();
    public int delete(Object obj);
    public int update(Object obj);
    public void selectOne(int id);
}
