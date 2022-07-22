import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/login'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  mode: 'history', //去掉链接的#号
  base: '/', //去掉链接的/杠
  routes: [
    { //重定向
      path: '/',
      redirect: 'login',
    },
    { //重定向
      path: '/login',
      name: 'login',
      component: Login
    },
    { //重定向
      path: '/HelloWorld',
      name: 'hello',
      component: HelloWorld
    }
  ]
})
