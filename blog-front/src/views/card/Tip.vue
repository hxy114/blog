<template>
  <div >
      <el-card class="box-card" shadow="never">
          <div>
      <el-collapse v-model="activeNames" @change="handleChange">
  <el-collapse-item title="鸡汤" name="1">
     <div>
      <div class="has-text-left block">
       {{ tip.content }}
      </div>
      <div class="has-text-right mt-5 block">
        ——{{ tip.author }}
      </div>
    </div>
  </el-collapse-item>
  </el-collapse>
  </div>
  </el-card>
  </div>
</template>

<script>
import {getTodayTip} from '@/api/tip'
export default {
  name: 'Tip',
  data() {
    return {
      tip: {},
      activeNames: ['0']
    }
  },
  created() {
    this.fetchTodayTip()
  },
  methods: {
       handleChange(val) {
        console.log(val);
      },
    fetchTodayTip() {
      getTodayTip().then(response => {
        const { data } = response
        this.tip = data
      })
    } 
  }
}
</script>

<style scoped>
</style>