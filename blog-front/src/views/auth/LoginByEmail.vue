<template>
  
        
          <el-form
            v-loading="loading"
            :model="ruleForm"
            status-icon
            :rules="rules"
            ref="ruleForm"
            label-width="100px"
            class="demo-ruleForm"
          >
              <el-form-item label="邮箱" prop="email">
              <el-input v-model="ruleForm.email" autocomplete="off" />
            </el-form-item>

            <el-form-item label="密码" prop="pass">
              <el-input
                type="password"
                v-model="ruleForm.pass"
                autocomplete="off"
              ></el-input>
            </el-form-item>

            <el-form-item label="记住" prop="delivery">
              <el-switch v-model="ruleForm.rememberMe" ></el-switch>
            </el-form-item>

            <el-form-item>
              <el-button type="primary" @click="submitForm('ruleForm')"
                >登录</el-button
              >
              <el-button @click="resetForm('ruleForm')">重置</el-button>
               <el-button @click="toregister">注册</el-button>
                <el-button @click="back">返回主页</el-button>
            </el-form-item>
          </el-form>
       
     
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      redirect: undefined,
      loading: false,
      ruleForm: {
        email: "",
        pass: "",
        rememberMe: true,
      },
      rules: {
        email: [
          { required: true, message: '请输入邮箱地址', trigger: 'blur' },
          {
            type: 'email',
            message: '请输入正确的邮箱地址',
            trigger: ['blur', 'change']
          }
        ],
        pass: [
          { required: true, message: "请输入密码", trigger: "blur" },
          {
            min: 6,
            max: 20,
            message: "长度在 6 到 20 个字符",
            trigger: "blur",
          },
        ],
      },
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          this.loading = true;
          this.$store
            .dispatch("user/loginByEmail", this.ruleForm)
            .then(() => {
              this.$message({
                message: "恭喜你，登录成功",
                type: "success",
                duration: 2000,
              });
              setTimeout(() => {
                this.loading = false;
                this.$router.push({ path: this.redirect || "/" });
              }, 0.1 * 1000);
            })
            .catch(() => {
              this.loading = false;
            });
        } else {
          return false;
        }
      });
    },
    toregister(){
        this.$router.push( '/register' )
    },
    back(){
        this.$router.push( '/' )
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
  },
};
</script>

<style scoped>
</style>