import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: ()=>import('@/views/Home')
  },
  {
    path: '/register',
    name: 'register',
    component: () => import('@/views/auth/Register'),
    meta: { title: '注册' }
  },
  {
    name: 'login',
    path: '/login',
    component: () => import('@/views/auth/Login'),
    meta: { title: '登录' }
  },
  {
    name: 'loginByUserName',
    path: '/loginByUserName',
    component: () => import('@/views/auth/LoginByUserName'),
    meta: { title: '登录' }
  },
  {
    path: '/404',
    name: '404',
    component: () => import('@/views/error/404'),
    meta: {title: '404-NotFound'}
  },
  {
    path: '*',
    redirect: '/404',
    hidden: true
  }
  
  
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
