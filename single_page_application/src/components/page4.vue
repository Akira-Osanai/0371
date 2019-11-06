<template>
  <section id="Contact">
    <fieldset>
      <h2>メンバーの連絡先</h2>
      <form action="https://docs.google.com/forms/d/e/1FAIpQLSchHAQkVBX9Wa6lpusqElRbysfeZjbl8KDmEylil7sH37Rekw/formResponse">
        <legend><label for="email">メールアドレス</label></legend>
        <input id="email" type="email" name="entry.716617738" placeholder="example@mail.co.jp">
        <legend><label for="msg">お問い合わせ内容</label></legend>
        <textarea id="msg" name="name" placeholder="お気軽にお問い合わせください。"></textarea>
        <button id="btn" type="submit" name="button" value="送信">送信</button>
      </form>
    </fieldset>
  </section>
</template>

<script>

</script>

<style>
/* ------------------  Contact  ----------------------*/
#Contact {
  padding-top: 2rem;
  width: 50rem;
  margin: 10rem auto 3rem auto;
  border: .5rem double #000;
  border-radius: 3rem;
}

#Contact h2 {
  width: 30rem;
  padding-bottom: 1rem;
  margin: 0 auto 2rem auto;
  border-bottom: .2rem dotted #000;
  border-radius: .8rem;
  text-align: center;
}

form {
  padding: 2rem;
  display: grid;

}

legend::before {
  content: "< ";
}

legend {
  text-align: center;
  font-size: 2rem;
}

legend::after {
  content: " >";
}

#email {
  margin: 1rem;
  margin-top: 0;
  padding: .5rem 1rem;
  border: 1px solid #000;
}

#msg {
  margin: 1rem;
  margin-top: 0;
  padding: .5rem 1rem;
  border: 1px solid #000;
}

#btn {
  height: 4rem;
  width: 7rem;
  margin: 0 auto;
  margin-top: 1rem;
  background-color: #bbf;
  border-radius: 1rem;
  text-shadow: 0 .5rem 2rem #fff;
  transition: all .3s ease 0s;
}

#btn:hover {
  background-color: #00f;
  color: #fff;
}

</style>
