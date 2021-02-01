<template>
  <div class="myregister">
    <el-card style="width: 400px">
      <div class="clearfix">
        <span>注册</span>
      </div>
      <table>
        <tr>
          <td>用户名</td>
          <td>
            <el-input v-model="username" placeholder="请输入用户名"></el-input>
          </td>
        </tr>
        <tr>
          <td>密码</td>
          <td>
            <el-input v-model="password" type="password" placeholder="请输入密码"></el-input>
            <!-- @keydown.enter.native="doLogin"当按下enter键的时候也会执行doLogin方法-->
          </td>
        </tr>
        <tr>
          <!-- 占两行-->
          <td colspan="2">
            <!-- 点击事件的两种不同的写法v-on:click和 @click-->
            <!--<el-button style="width: 300px" type="primary" v-on:click="doLogin">登录</el-button>-->
            <el-button style="width: 350px" type="primary" v-on:click="doRegister">注册</el-button>
          </td>
        </tr>
      </table>
    </el-card>
  </div>
</template>

<script>
export default {
name: "Register",
  data() {
    return {
      username: null,
      password: null
    }
  },
  methods: {
    doRegister() {

    }
  }
}
</script>

<style scoped>
  .myregister {
    margin-top: 250px;
    top: 0;
    left: 38%;
    right: 0;
    bottom: 0;
    position: absolute;
  }
</style>
