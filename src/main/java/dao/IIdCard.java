package dao;

import bean.IdCard;

public interface IIdCard {
    //一对一查询
    IdCard findCodeById(int id);
}
