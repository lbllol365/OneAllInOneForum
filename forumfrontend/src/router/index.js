import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)



const routes = [
  {
    path: '/',
    component: () => import('../views/Welcome')

  },
  {
    path: '/pages',
    name: 'pages',
    component: () => import('../components/Pages'),
    children: [
      {
        path: 'resources',
        mata: {
          requireLogin: true,
        },
        component: () => import('../views/function/Resources')
      },
      {
        path: 'chatroom',
        meta: {
          requireLogin: true,
        },
        component: () => import('../views/function/ChatRoom')
      },
      {
        path: 'forum',
        meta: {
          requireLogin: true,
        },
        component: () => import('../views/function/Forum')
      }
    ]
  },
  {
    path: '/user',
    name: 'user',
    component: () => import('../components/User'),
    children: [
      {
        path: 'login',
        component: () => import('../views/user/Login')
      },
      {
        path: 'register',
        component: () => import('../views/user/Register')
      }
    ]
  }
]

const router = new VueRouter({
  routes
})

export default router
