package com.macro.cloud.controller;

import com.macro.cloud.api.CommonResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther macrozheng
 * @description 测试接口
 * @date 2023/12/21
 * @github https://github.com/macrozheng
 */
@RequestMapping("/message")
@RestController
public class MessageController {

    @GetMapping("/read")
    @PreAuthorize("hasAuthority('message.read')")
    public CommonResult<String> read() {
        return CommonResult.success("read message");
    }

    @GetMapping("/write")
    @PreAuthorize("hasAuthority('message.write')")
    public CommonResult<String> write() {
        return CommonResult.success("write message");
    }

    @GetMapping("/delete")
    @PreAuthorize("hasAuthority('delete')")
    public CommonResult<String> delete() {
        return CommonResult.success("delete message");
    }

    @GetMapping("/update")
    @PreAuthorize("hasAuthority('update')")
    public CommonResult<String> update() {
        return CommonResult.success("update message");
    }

}


