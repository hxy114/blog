<template>
<div class="columns py-6">
    <div class="column is-half is-offset-one-quarter">
        <el-card shadow="never">
        <div slot="header" class="has-text-centered has-text-weight-bold">
  <el-tabs v-model="activeName" @tab-click="handleClick">
    <el-tab-pane label="账号登录" name="first"><login-by-user-name></login-by-user-name></el-tab-pane>
    <el-tab-pane label="邮箱登录" name="second"><login-by-email></login-by-email></el-tab-pane>
    
  </el-tabs>
  </div>
  </el-card>
    </div>
  </div>
</template>
<script>
import LoginByUserName from "@/views/auth/LoginByUserName"
import LoginByEmail from "@/views/auth/LoginByEmail"
  export default {
    data() {
      return {
        activeName: 'first'
      };
    },
    components:{LoginByUserName,LoginByEmail},
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      }
    }
  };
</script>