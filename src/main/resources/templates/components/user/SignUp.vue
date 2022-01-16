<template>
   <transition name="modal">
      <div class="modal-mask">
          <div class="modal-wrapper">
              <div class="modal-container">
                  <div class="modal-header">
                      <slot name="header">회원가입</slot>
                  </div>
                  <div class="modal-body">
                      <slot name="body">
                          <form class="row row-cols-lg-auto g-3 align-items-center justify-content-end">
                          <label for=""></label>
                          <input type="email" name="" id="">
                          <label for=""></label>
                          <input type="password" name="" id="">
                          </form>
                      </slot>
                  </div>
                  <div class="modal-footer">
                      <slot name="footer">
                            어쩌고
                            <button class="modal-default-button" type="submit"></button>
                            <button class="modal-default-button" @click="$emit('close')"></button>
                      </slot>
                  </div>
              </div>
          </div>
      </div>
  </transition>
</template>

<script>
export default {
    name:'SignUp'
}
</script>

<style>

</style>