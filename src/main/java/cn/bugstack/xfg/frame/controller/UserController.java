package cn.bugstack.xfg.frame.controller;

import cn.bugstack.xfg.frame.common.Result;
import cn.bugstack.xfg.frame.domain.res.UserRes;
import cn.bugstack.xfg.frame.domain.vo.UserInfo;
import cn.bugstack.xfg.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * http://localhost:9091/queryUserInfo
     */
    @RequestMapping("queryUserInfo")
    public UserRes queryUserInfo() {
        try {
            log.info("查询用户信息");
            Thread.sleep(new Random().nextInt(50));
            List<UserInfo> userInfoList = userService.queryUserList();
            return UserRes.builder().userInfos(userInfoList).result(Result.buildSuccess()).build();
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            return UserRes.builder().result(Result.buildSuccess()).build();
        }
    }

}
