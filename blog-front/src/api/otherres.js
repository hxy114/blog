import request from '@/utils/request'

// 获取推广
export function getOtherRes() {
  return request(({
    url: '/otherres/all',
    method: 'get'
  }))
}
