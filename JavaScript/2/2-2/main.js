// 「myfunc」という関数を用意
function myfunc() {
    // idが「target」の要素を取得して、変数changeに代入
    let change = document.getElementById('target');

    // textContentを使って「こんにちは」で書き変える
    change.textContent = 'こんにちは！';
}
let elems = document.getElementsByTagName('h1');
//HTMLを上から順番に探した時に、最初に見つかったh1タグが0番の要素として取得できる。
console.log(elems[0]);
console.log(elems[1]);