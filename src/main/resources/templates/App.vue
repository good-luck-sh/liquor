<template>
  <div>
    <Header />
    <Content />
    <Footer />

  </div>
</template>

<script>
import Header from './common/Header.vue';
import Content from './common/Content.vue';
import Footer from './common/Footer.vue';

export default ({
  name:'App',
  components:{
      Header,
      Content,
      Footer
    }
})
</script>


<style>
  
</style>
