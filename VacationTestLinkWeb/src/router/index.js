import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home,
      children:[
      	{ path:'/HelloWorld', name:'新世界', component: HelloWorld },
        { path:'/HelloWorld2', name:'新世界2', component: HelloWorld }
      ]
    }
  ]
})
