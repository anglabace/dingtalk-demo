package com.wjc.demo.event.handle;

import com.alibaba.fastjson.JSONObject;
import com.wjc.demo.common.constant.Constant;
import com.wjc.demo.event.CallbackEventHandle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ProjectName: demo
 * @Package: com.wjc.demo.event.handle
 * @ClassName: UserAddOrgEvent
 * @Description: user_add_org 的事件处理
 * @Author: wangjc
 * @CreateDate: 2020/1/7 0007 13:22
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 0007 13:22
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
@Component("userAddOrg")
@Slf4j
public class UserAddOrgEventHandle implements CallbackEventHandle {

    @Override
    public String callbackHandle(Map<String, String> map) {
        log.info("用户添加 回调成功: {}" , JSONObject.toJSONString(map));
        return Constant.CALLBACK_SUCCESS;
    }
}
