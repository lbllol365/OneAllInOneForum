import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/pages',
    name: 'pages',
    component: () => import('../views/Pages'),
    children: [{
      path: 'main',
      component: () => import('../views/Resources')
    }]
  },
  {
    path: '/test',
    name: 'test',
    component: () => import('../views/Main2')
  },
  {
    path: '/sidebar',
    name: 'sidebar',
    component: () => import('../components/SideBar')
  }
]

const router = new VueRouter({
  routes
})

export default router
