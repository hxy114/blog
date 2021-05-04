<template>
<div>
    <p>
        西安电子科技大学
    </p>
 <el-link type="info" v-for="(item,index) in list" :key='index' :href="item.link"> {{item.title}}|</el-link>
</div>
 
</template>

<script>
import { getList } from '@/api/promote'
export default {
  name: 'Promotion',
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
      getList().then((response) => {
        const { data } = response
        this.list = data
      })
    }
  }
}
</script>

<style scoped>

</style>
