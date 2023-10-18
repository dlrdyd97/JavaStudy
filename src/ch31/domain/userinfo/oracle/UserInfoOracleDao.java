package ch31.domain.userinfo.oracle;

import ch31.domain.userinfo.UserInfo;
import ch31.domain.userinfo.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    public void insertUserInfo(UserInfo userInfo){
        System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId() );
    }

    public void updateUserInfo(UserInfo userInfo){
        System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
    }

    public void deleteUserInf(UserInfo userInfo){
        System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
    }

}
