<template>
  <transition name="modal">
      <div class="modal-mask">
          <div class="modal-wrapper">
              <div class="modal-container">
                  <div class="modal-header">
                      <slot name="header">로그인</slot>
                  </div>
                  <div class="modal-body">
                      <slot name="body">
                          <form class="">
                          <label for="">이메일 아이디</label>
                          <input type="email" name="email" id="email">
                          <label for="">비밀번호</label>
                          <input type="password" name="password" id="password">
                          </form>
                      </slot>
                  </div>
                  <div class="modal-footer">
                      <slot name="footer">
                          <div>
                            <button class="modal-default-button" type="submit" @click="formSubmit">로그인</button>
                            <button class="modal-default-button" @click="$emit('close')">닫기</button>
                          </div>
                           <div class="login_api" id="kakao-login">
                               <img src="../assets/kakao_login.png" alt="kakaologin" @click="kakaologin()"/>
                           </div>
                           <div class="login_api">
                               <a href=""></a>
                           </div>
                      </slot>
                  </div>
              </div>
          </div>
      </div>
  </transition>
</template>


<script>
import UserService from '../service/userService/UserService'
export default {
    name:'LoginModal',
    data(){
      return{
          user:{
              email:'',
              password:''
          }
      }
    },
    methods:{
       kakaologin(){
          const params = {
              redirectUri:'http://localhost:8081/kakaologin'
          }
          window.Kakao.Auth.authorize(params)
       },
       formSubmit(){
           UserService.getUser(this.user)
           .then(response => {
               alert(response.data.user.email)
               this.$router.push('/product/ProductList');
           }).catch(()=>alert("로그인 중 오류가 발생했습니다."))
       }
    }
 
}
</script>

<style>
    
</style>