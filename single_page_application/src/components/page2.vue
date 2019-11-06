<template>
    <section id="Member" class="member-container">
    <h2>メンバー紹介</h2>
    <ul class="item-list">
      <li class="item-box no1">
        <img class="member-img" src="../assets/ic1.png" alt="">
        <h3>顧問の先生</h3>
        <p>
          Webをめちゃくちゃ愛するひよこ。<br>
          なんでもかんでもWebで解決しようとする師匠。<br>
          熱血指導についていける者のみが真のWebデザイナーになれるのだ。
        </p>
      </li>

      <li class="item-box">
        <img class="member-img ic2" src="../assets/ic2.jpg" alt="">
        <h3>Akira Osanai</h3>
        <p>
          情報システム科1年 IT・アプリコース<br><br>
          <b>サークルリーダー。</b><br>普段は真面目だが、根はサイコパス。<br>
          今のところ無遅刻＆無欠席！<br><br>
          このサイトを作業時間2日程度で作った人です。
        </p>
      </li>

      <li class="item-box">
        <img class="member-img" src="../assets/ic3.png" alt="">
        <h3>メンバー2</h3>
        <p>
          さすらいのWebひよこ。<br>
          ネガティブオーラを身に纏っているが、実は誰よりも熱意が強い。<br>
          調子のいいときは秒間10タイピングくらいする「速打ちひよこ」の異名も持つ。
        </p>
      </li>

      <li class="item-box">
        <img class="member-img" src="../assets/ic4.png" alt="">
        <h3>メンバー3</h3>
        <p>
          雪が降ると冬眠モードに入るひよこ。<br>
          どうやら体温が低くなると活動を停止してしまうようだ。<br>
          ぼーっとしてきたら、PCの排熱ファンの近くに行くことで、睡眠を回避する。
        </p>
      </li>

      <li class="item-box">
        <img class="member-img" src="../assets/ic5.png" alt="">
        <h3>メンバー4</h3>
        <p>
          ひよこっぽくないひよこ。<br>
          なぜかフランス語とタガログ語とドイツ語を話せる。<br>
          そして常に4速歩行。謎である。
        </p>
      </li>

      <li class="item-box">
        <img class="member-img" src="../assets/ic6.png" alt="">
        <h3>メンバー5</h3>
        <p>
          Pythonを自由自在に操るひよこ。<br>
          機械学習もWebスクレイピングもなんでもござれ。<br>
          お化け屋敷巡りという変わった趣味を持っている。
        </p>
      </li>

      <li class="item-box">
        <img class="member-img" src="../assets/ic7.png" alt="">
        <h3>メンバー6</h3>
        <p>
          サークル内で一番マッスルなひよこ。<br>
          お客さんとのトラブルは必ず解決してくれるので重宝されている。<br>
          最近は熱帯魚の飼育にハマっているらしい。
        </p>
      </li>
    </ul>
  </section>

</template>

<script>
</script>

<style>
/* ------------------  Member  ----------------------*/
#Member {
  width: 140rem;
  margin: 10rem auto 3rem auto;
  padding: 3rem;
  border: .3rem dotted #000;
  border-radius: 3rem;
}

#Member h2 {
  width: 20rem;
  padding-bottom: 1rem;
  margin: 0 auto 2rem auto;
  border-bottom: .2rem dotted #000;
  border-radius: .8rem;
  text-align: center;
}

#Member .no1 {
  background-color: #ff3;
  border-radius: 3rem;
}

/* ------------------  item-list  ----------------------*/
.item-list {
  display: grid;
  gap: 1rem;
  grid-template-columns: repeat(auto-fit, minmax(40rem, 1fr));
  padding: 0;
}

.item-list .item-box {
  padding: 3rem;
  list-style: none;
  text-align: center;
  background-color: #eee;
  border-radius: 3rem;
}

.item-list .item-box h3 {
  margin-top: 1rem;
  margin-bottom: 1rem;
}

.item-list .item-box .member-img {
  height: 10rem;
  width: 10rem;
  margin: 0 auto;
  margin-bottom: 1rem;
  text-align: center;
}

/* ------------------  icon  ----------------------*/
.ic2 {
  border-radius: 50%;
}
</style>
