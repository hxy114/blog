<template>
  <section>
    <!--是否登录-->
    <login-welcome />

    <!--今日赠言-->
    <tip-card />

    <!--资源推介-->
    <other-res>

    </other-res>
  </section>
</template>

<script>
import TipCard from '@/views/card/Tip'
import OtherRes from '@/views/card/OtherRes'
import LoginWelcome from '@/views/card/LoginWelcome'
export default {
  name: 'CardBar',
  components: { LoginWelcome, TipCard ,OtherRes}
}
</script>

<style scoped>
other-res{
    margin-top: 30px; 
}
</style>