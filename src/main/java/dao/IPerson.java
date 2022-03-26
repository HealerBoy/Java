package dao;

import bean.Person;

public interface IPerson {
    //一对一查询
    Person findPersonById(int id);
}
