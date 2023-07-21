let box = document.getElementById('box');
let btn = document.getElementById('btn');

//ボタンが押されたら、背景色を赤にする
btn.addEventListener('click', function(){
    box.style.backgroundColor = 'red';
}, false);