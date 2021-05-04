import { loginByUserName ,getUserInfo} from '@/api/auth/auth'
import { getToken, setToken } from '@/utils/auth'
import { loginByEmail } from '@/api/auth/auth'
const state = {
  token: getToken(), // token
  user: '', // 用户对象
}

const mutations = {
  SET_TOKEN_STATE: (state, token) => {
    state.token = token
  },
  SET_USER_STATE: (state, user) => {
    state.user = user
  }
}

const actions = {
  // 用户登录
  loginByUserName({ commit }, userInfo) {
    console.log(userInfo)
    const { name, pass, rememberMe } = userInfo
    return new Promise((resolve, reject) => {
      loginByUserName({ username: name.trim(), password: pass, rememberMe: rememberMe }).then(response => {
        const { data } = response
        commit('SET_TOKEN_STATE', data.token)
        setToken(data.token)
        resolve()
      }).catch(error => {
        reject(error)
      })
    })
  },
  loginByEmail({ commit }, userInfo) {
    console.log(userInfo)
    const { email, pass, rememberMe } = userInfo
    return new Promise((resolve, reject) => {
      loginByEmail({ email: email.trim(), password: pass, rememberMe: rememberMe }).then(response => {
        const { data } = response
        commit('SET_TOKEN_STATE', data.token)
        setToken(data.token)
        resolve()
      }).catch(error => {
        reject(error)
      })
    })
  },
  getInfo({ commit, state }) {
    return new Promise((resolve, reject) => {
      getUserInfo().then(response => {
        const { data } = response
        if (!data) {
          commit('SET_TOKEN_STATE', '')
          commit('SET_USER_STATE', '')
          removeToken()
          resolve()
          reject('Verification failed, please Login again.')
        }
        commit('SET_USER_STATE', data)
        console.log(data)
        resolve(data)
      }).catch(error => {
        reject(error)
      })
    })
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}