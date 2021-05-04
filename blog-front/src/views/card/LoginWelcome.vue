<template>
  <el-card class="box-card" shadow="never">
    <div slot="header">
      <span> 发帖</span>
    </div>
    <div>
       <b-button type="is-danger"  @click="clickEvent"> 发表想法</b-button>

    </div>
  </el-card>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
  name: 'LoginWelcome',
  data() {
    return {}
  },
  methods:{
    clickEvent(){
      if(this.token!=null&&this.token!=''){

      }
      else{
        alert("未登录，请先登录")
        this.$router.push( '/login' )
      }
    }
  },
    computed: {
    ...mapGetters([
      'token'
    ])
  }

}
</script>

<style scoped>
</style>