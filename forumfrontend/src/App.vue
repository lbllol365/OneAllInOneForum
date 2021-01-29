<template>
  <div id="app">
    <el-container>
      <el-aside id="mysidebar" width="200px" style="background-color: rgb(238, 241, 246)">
        <SideBar></SideBar>
      </el-aside>
      <el-container>
        <el-header id="myheader" style="text-align: right; font-size: 12px">
          <router-link tag="el-button" to="/pages/main">main</router-link>
          <router-link tag="el-button" to="/test">test</router-link>
        </el-header>
        <el-main id="mymain">
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>

import SideBar from "@/components/SideBar";
export default {
  name: 'app',
  components: {
    SideBar

  }
}
</script>

<style>
#app {
  height: 100%;
  position: absolute;
  top: 0px;
  left: 0px;
  width: 100%;
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#mysidebar {
  box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
}

#myheader {
  box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
}

#mymain {
  box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
}
</style>
