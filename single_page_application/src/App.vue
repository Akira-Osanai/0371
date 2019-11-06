<template>
  <div id="app">
    <div id="header">
      <nav id="Menu" class="navbar navbar-expand-lg navbar-light">
      <div class="header-logo">
        <h1>IT&Web研究会</h1>
        <p>秋田コア ビジネスカレッジ サークル</p>
      </div>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
        aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <router-link class="nav-link" to="/"><i class="fa fa-home fa-fw" aria-hidden="true"></i>Home<span class="sr-only"></span></router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/page2"><i class="fa fa-users fa-fw" aria-hidden="true"></i>Member</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/page3"><i class="fa fa-file fa-fw" aria-hidden="true"></i>Portfolio</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/page4"><i class="fa fa-envelope fa-fw" aria-hidden="true"></i>Contact</router-link>
          </li>
        </ul>
      </div>
    </nav>
    </div>
    <router-view/>
    <footer>
    <p>&copy; 2019 秋田コア ビジネスカレッジ IT&Web研究会</p>
  </footer>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>

html{
  font-size:62.5%;
  /*1rem == 10px*/
}
body{
  font-family: 'Lato', 'Noto Sans JP', '游ゴシック Medium', '游ゴシック体', 'Yu Gothic Medium', YuGothic, 'ヒラギノ角ゴ ProN', 'Hiragino Kaku Gothic ProN', 'メイリオ', Meiryo, 'ＭＳ Ｐゴシック', 'MS PGothic', sans-serif;
  font-size:1.6rem;
  width: 100%;
}

body,h1,h2,h3,h4,h5,h6,p,ul,ol,dl,dt,dd{
  margin:0;
  padding:0;
}

img{
  display:block;
}

i {
  margin-right: .3rem;
}
/* ------------------  Menu  ----------------------*/
#Menu {
  position: fixed;
  top: 0;
  width: 100%;
  transition: all .5s ease 0s;
  background-color: rgba(255, 255, 255, .8);
  box-shadow: 0 0 1rem -0.5rem rgba(0, 0, 0, 0.8);
}

@media screen and (min-width: 992px) {
  #Menu {
     padding: 0 14rem;
  }
}

#Menu h1, #Menu p {
  margin-left: 2rem;
  text-shadow: 0 0 1rem #fff;
}

@media screen and (min-width: 768px) {
  #Menu h1, #Menu p {
    margin-left: 5rem;
  }
}

#Menu h1 {
  font-size: 1.6rem;
}

#Menu p {
  font-size: 1rem;
}

#Menu button {
  border-radius: .8rem;
  background-color: rgba(255, 255, 255, 1);
  height: 5rem;
  width: 5rem;
}

#Menu ul {
  display: flex;
  margin-right: 2rem;
}

#Menu li {
  list-style: none;
}

#Menu a {
  margin: 0 auto;
  display: inline-block;
  text-align: left;
  padding: 1rem;
  padding-left: 44%;
  color: #000;
  line-height: 3rem;
  text-align: center;
  text-decoration: none;
  text-shadow: 0 0 1rem #fff;
}

#Menu a:hover {
  color: #fff;
  text-shadow: 0 0 1rem #000;
}

@media screen and (min-width: 992px) {
  #Menu a {
    text-align: center;
    padding-left: 3rem;
  }
}

/* ------------------  footer  ----------------------*/
footer {
  position: fixed;
  bottom: 0;
  width: 100%;
  background: #000;
}

footer p {
  color: #fff;
  text-align: center;
  padding-top: 1rem;
  padding-bottom: 1rem;
}

</style>
