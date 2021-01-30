<template>
  <div class="sideBarContainer" >
    <el-aside width="100%" style="background-color: rgb(238, 241, 246)">
      <el-menu :default-openeds="['1']" router>
        <el-submenu index="1">
          <template slot="title"><i class="el-icon-message"></i>导航一</template>
          <el-menu-item-group>
            <template slot="title">主页面区</template>
            <el-menu-item index="/pages/resources">资源区</el-menu-item>
            <el-menu-item index="/pages/chatroom">聊天室</el-menu-item>

          </el-menu-item-group>
        </el-submenu>
      </el-menu>
    </el-aside>
  </div>
</template>

<script>
export default {
  name: "SideBar"
}
</script>

<style scoped>

</style>
