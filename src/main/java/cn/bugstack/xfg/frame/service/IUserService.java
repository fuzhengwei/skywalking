package cn.bugstack.xfg.frame.service;

import cn.bugstack.xfg.frame.domain.req.UserReq;
import cn.bugstack.xfg.frame.domain.vo.UserInfo;

import java.util.List;

public interface IUserService {

    List<UserInfo> queryUserList();

    UserInfo queryUserInfo(String uId);

}
