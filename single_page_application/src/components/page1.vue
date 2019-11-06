<template>
   <section class="main-container">
    <h1>Welcome to<br>IT&Web Studying Circle</h1>
    <p>即戦力になりうるような技術をゆるく学ぶサークルです。</p>
  </section>
</template>

<script>
</script>

<style>
.main-container {
  height: 100vh;
  width: 100%;
  background-image: url("../assets/bg1.jpg");
  background-size: auto 100%;
  background-position: center;
  background-repeat: no-repeat;
  background-color: #000;
  overflow: hidden;
}

.main-container h1, .main-container p {
  color: #fff;
  text-shadow: 0 1rem 1rem #000;
  text-align: center;
}

.main-container h1 {
  padding-top: 12rem;
  font-size: 4rem;
}

@media screen and (min-width: 576px) {
  .main-container h1 {
    padding-top: 20rem;
    font-size: 5rem;
  }
}

@media screen and (min-width: 992px) {
  .main-container h1 {
    font-size: 7rem;
  }
}

.main-container p {
  margin-top: 6rem;
  font-size: 2rem;
}

@media screen and (min-width: 768px) {
  .main-container p {
    margin-top: 10rem;
    font-size: 3rem;
  }
}
</style>
