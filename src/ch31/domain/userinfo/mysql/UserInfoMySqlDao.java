package ch31.domain.userinfo.mysql;

import ch31.domain.userinfo.UserInfo;
import ch31.domain.userinfo.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInf(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());


    }
}
