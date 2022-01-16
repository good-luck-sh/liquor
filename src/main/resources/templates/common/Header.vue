<template>
<div id="nav-1">
  <div class="row">
    <div class="col-10"><img src="../assets/main_ko.jpg" alt="korea"/></div>
    <!--User정보있으면 주문하기/장바구니 보이기 없으면 로그인/회원가입 보이게 일단 지금은 UI만 구현 -->
    <div class="col-1"><button class="top"><router-link style="text-decoration: none;" to="./views/ProductList">주문하기</router-link></button></div>
    <div class="col-1"><button class="top" @click="isModalViewed" type="button" >로그인</button></div>
    <div v-show="is_show">
      <LoginModal />
    </div>
  </div>
</div>
 <div id="nav">
    <div class="row row-cols-auto">
      <div>
        <ul>
        <div class="dropdown">
        <li><button class="dropbtn">전통주정</button></li>
          <div class="dropdown-content">
            <ul>
                <li><router-link style="text-decoration: none;" to="/">전체</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">탁주</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">약주/청주</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">과실주</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">증류수</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">리큐르/기타주류</router-link> </li>
              </ul>
            </div>
          </div>
          <li><router-link style="text-decoration: none;" to="/">전통주식</router-link></li>
         <div class="dropdown">
          <li><button class="dropbtn">커뮤니티</button></li>
            <div class="dropdown-content">
              <ul>
                <li><router-link style="text-decoration: none;" to="/">상품후기</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">1:1 문의하기</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">공지사항</router-link> </li>
                <li><router-link style="text-decoration: none;" to="/">이 술은말야</router-link> </li>
              </ul>
            </div>
        </div>
        <li><router-link style="text-decoration: none;" to="/">지역별검색하기</router-link> </li>
        <li><router-link style="text-decoration: none;" to="/">나에게 맞는 술 찾기</router-link> </li>
        <li><router-link style="text-decoration: none;" to="/">전통주정이란?</router-link></li>
      </ul>
    </div>
    </div>
  </div>
  
</template>

<script>
import LoginModal from '../common/LoginModal.vue';

export default {
  components: { LoginModal },
  name:'Header',
  component:{
    LoginModal
  },
  data(){
    return{
      is_show:false
    }
  },
  methods:{
    isModalViewed:function(){
      this.is_show = !this.is_show
    }
  }
}
</script>


<style scoped>
.dropdown {
  position: relative;
  display: inline-block;
}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 130px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
.dropdown-content a {
  color: black;
  padding: 15px 10px;
  text-decoration: none;
  display: block;
}
.dropdown-content a:hover {background-color: #ddd;}
.dropdown:hover .dropdown-content {display: block;}
.dropdown:hover .dropbtn {background-color: #3e8e41;}
.dropbtn {
  background-color: #ffff;
  color: black;
  margin:0px;
  padding:3px;
  font-size: 15px;
   float: left;
  border: none;
}
ul {
    list-style: none;
    margin: 0;
    padding: 0;
}
li {
    margin:0px;
    padding:10px;
    border: 0;
    float: left;
    font-size: 15px;
}
img{
  width: 200px;
  height: 60px;
  margin: 10px;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding:5px;
}
#nav-1{
  padding: 5px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #14213d;
}
.top{
  border: 1px solid #ffffff;
  font-size: 10px;
  text-align: center;
  border-radius: 50px;
  background-color: #ffffff;
}
</style>