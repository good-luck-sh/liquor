<template>
  <main>
    <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active" data-bs-interval="1000">
      <img src="../assets/그림사진.jpg" class="d-block w-100" alt="traditionalphoto">
    </div>
    <div class="carousel-item" data-bs-interval="1000">
      <img src="../assets/양곡장.jpg" class="d-block w-100" alt="makingalchol">
    </div>
    <div class="carousel-item" data-bs-interval="1000">
      <img src="../assets/동동주.jpg" class="d-block w-100" alt="dongdongju">
    </div>
    <div class="carousel-item" data-bs-interval="1000">
      <img src="../assets/술.jpg" class="d-block w-100" alt="bottol">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
  </main>
</template>

<script>
export default {
  name: 'Home',
  components: {

  }
}
</script>
<style scoped>
  img{
    width: 100%;
    height: 50%;
  }
</style>