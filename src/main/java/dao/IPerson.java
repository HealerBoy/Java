package dao;

import bean.Person;

public interface IPerson {
    Person findPersonById(int id);
}
