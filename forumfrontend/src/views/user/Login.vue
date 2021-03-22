<template>
  <div class="mylogin">
    <el-card style="width: 400px">
      <div class="clearfix">
        <span>登录</span>
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
            <el-input type="password" v-model="password" placeholder="请输入密码"></el-input>
            <!-- @keydown.enter.native="doLogin"当按下enter键的时候也会执行doLogin方法-->
          </td>
        </tr>
        <tr>
          <!-- 占两行-->
          <td colspan="2">
            <!-- 点击事件的两种不同的写法v-on:click和 @click-->
            <!--<el-button style="width: 300px" type="primary" v-on:click="doLogin">登录</el-button>-->
            <el-button style="width: 350px" type="primary" v-on:click="doLogin">登录</el-button>
          </td>
        </tr>
      </table>
    </el-card>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      username: null,
      password: null
    }
  },
  methods: {
    doLogin() {
      axios.post()
    }
  }
}
</script>

<style scoped>
.mylogin {
  margin-top: 250px;
  top: 0;
  left: 38%;
  right: 0;
  bottom: 0;
  position: absolute;
}
</style>
