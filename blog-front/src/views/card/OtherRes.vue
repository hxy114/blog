<template>
  <div class="block">
    <el-card class="box-card" shadow="never">
    <div slot="header">
      <span> 资源网站</span>
    </div>
    <div>
      <el-carousel height="150px">
      <el-carousel-item v-for="(item,index) in list" :key="index">
        <a :href="item.link" target="_blank"><img :src="item.description" :alt="item.title" height="123" width="300"></a>
      </el-carousel-item>
    </el-carousel>
    </div>
  </el-card>
    
  </div>
</template>

<script>
import { getOtherRes } from '@/api/otherres'
export default {
  name: 'OtherRes',
  data() {
    
    return {
      list: []
    }
  },
  created() {
    this.fetchList()
  },
  methods: {
   
    fetchList() {
      getOtherRes().then((response) => {
        const { data } = response
        this.list = data
      })
    }
  }
}
</script>


<style scoped>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
     background-color: #99a9bf;
  }
  
  .el-carousel__item:nth-child(2n+1) {
     background-color: #d3dce6;
  }
  .block{
      margin-top: 18px;
  }
</style>>
  
