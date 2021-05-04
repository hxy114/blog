<template>
  <div>
    <div class="box">{{billboard.content}}</div>
    <el-container>
  
  
    <el-aside width="25%"><card-bar></card-bar></el-aside>
    <el-container>
      <el-main> 
        <TopicList>
        </TopicList>  
    </el-main>
      <el-footer></el-footer>
    </el-container>
  
</el-container>
<footer class="footer">
  <div class="content has-text-centered">
    <Promotion>
      </Promotion> 
    <p>
      <strong>blog by A8</strong> 
    </p>
  </div>
</footer>
  </div>
   

</template>

<script>
// @ is an alias to /src

import {getBillboard} from '@/api/billboard'
import CardBar from "@/views/card/CardBar"
import PostList from "@/views/post/Index"
import Tip from "@/views/card/Tip"
import Promotion from "@/views/Promotion"
export default {
  name: 'Home',
  components:{CardBar,TopicList:PostList,Tip,Promotion},
  data(){
    return {
      billboard:{
        
      }
    }
  },
  created() {
    this.fetchBillboard()
  },
  methods: {
    async fetchBillboard() {
      getBillboard().then((value) => {
        const { data } = value
        
        this.billboard = data
        }
      )
    }
  }
}
</script>

<style scoped>
.footer{
  margin: 50px;
}
</style>

