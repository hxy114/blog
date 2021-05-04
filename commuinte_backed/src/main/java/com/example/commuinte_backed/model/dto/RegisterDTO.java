package com.example.commuinte_backed.model.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Data
public class RegisterDTO {

    @NotEmpty(message = "请输入账号")
    @Length(min = 2, max = 15, message = "长度在2-15")
    private String name;

    @NotEmpty(message = "请输入密码")
    @Length(min = 6, max = 20, message = "长度在6-20")
    private String pass;

    @NotEmpty(message = "请再次输入密码")
    @Length(min = 6, max = 20, message = "长度在6-20")
    private String checkPass;

    @NotEmpty(message = "请输入电子邮箱")
    @Email(message = "邮箱格式不正确")
    private String email;

    @NotEmpty(message = "请输入电话号码")
    @Pattern(regexp="^1(3|4|5|6|7|8)\\d{9}$", message="电话号码错误")
    private String mobile;

    @NotEmpty(message = "请输入职业")
    @Length(min = 2, max = 20, message = "长度在6-20")
    private String bio;


    @NotEmpty(message = "请输入昵称")
    @Length(min = 2, max = 15, message = "长度在2-15")
    private String alias;


}
