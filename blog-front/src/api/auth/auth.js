import request from '@/utils/request'

export function userRegister(userDTO) {
  return request({
    url: '/ums/user/register',
    method: 'post',
    data: userDTO
  })
}

// 前台用户登录
export function loginByUserName(data) {
  return request({
    url: '/ums/user/loginbyusername',
    method: 'post',
    data
  })
}


export function loginByEmail(data) {
  return request({
    url: '/ums/user/loginbyemail',
    method: 'post',
    data
  })
}

export function getUserInfo() {
  return request({
    url: '/ums/user/info',
    method: 'get'
  })
}

