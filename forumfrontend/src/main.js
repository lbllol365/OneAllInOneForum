import Vue from 'vue'
import './plugins/axios'
import App from './App.vue'
import router from './router'
import './plugins/element.js'
import store from './store'

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

router.beforeEach((to, from, next) => {
  console.log("进入函数");
  if(to.meta.requireLogin) {
    console.log("检查token前");
    if(store.state.token) {
      console.log("有Token");
      next();
    } else {
      next({
        path: '/user/login',
        query: {redirect: to.fullPath}
      })
    }
  } else {
    console.log("Next!!");
    next();
  }
})
