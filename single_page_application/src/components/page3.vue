<template>
  <section id="Portfolio">
    <h2>ポートフォリオサイト紹介</h2>

      <ul class="item-list">
        <li class="item-box">
          <h3>メンバー1のポートフォリオサイト</h3>
          <img class="portfolio-img" src="../assets/ps1.jpg" alt="">
          <p></p>
        </li>

        <li class="item-box">
          <h3>メンバー2のポートフォリオサイト</h3>
          <img class="portfolio-img" src="../assets/ps1.jpg" alt="">
          <p></p>
        </li>

        <li class="item-box">
          <h3>メンバー3のポートフォリオサイト</h3>
          <img class="portfolio-img" src="../assets/ps1.jpg" alt="">
          <p></p>
        </li>

        <li class="item-box">
          <h3>メンバー4のポートフォリオサイト</h3>
          <img class="portfolio-img" src="../assets/ps1.jpg" alt="">
          <p></p>
        </li>

        <li class="item-box">
          <h3>メンバー5のポートフォリオサイト</h3>
          <img class="portfolio-img" src="../assets/ps1.jpg" alt="">
          <p></p>
        </li>

        <li class="item-box">
          <h3>メンバー6のポートフォリオサイト</h3>
          <img class="portfolio-img" src="../assets/ps1.jpg" alt="">
          <p></p>
        </li>
      </ul>
  </section>
</template>

<script>
</script>

<style>
/* ------------------  Portfolio  ----------------------*/
#Portfolio {
  width: 140rem;
  margin: 8rem auto 3rem auto;
  gap: 1rem;
  background-color: #eee;
  box-shadow: 0 0 2rem -0.5rem rgba(0, 0, 0, 0.8);
  border: 2.5rem solid #000;
  border-radius: 3rem;
}

#Portfolio h2 {
  width: 35rem;
  margin: 0 auto 2rem auto;
  padding-top: 3rem;
  padding-bottom: 1rem;
  border-bottom: .2rem dotted #000;
  border-radius: .8rem;
  text-align: center;
}

#Portfolio .portfolio-img {
  height: 20rem;
  width: 20rem;
  margin: 0 auto;
  margin-bottom: 1rem;
  text-align: center;
  object-fit: cover;
  transition: all .5s ease 0s;
}

#Portfolio .portfolio-img:hover {
  box-shadow: 0 0 2rem -0.5rem rgba(0, 0, 0, 0.5);
}

</style>
