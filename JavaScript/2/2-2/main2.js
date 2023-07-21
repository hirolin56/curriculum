let boxs = document.getElementsByName('box');
for (let i = 0; i < boxs.length; i++){
    console.log(boxs[i]);
}

let boxes = document.getElementsByClassName('box');
//for文を使っても良いのですが、ここでは単純に一つずつ出力している
console.log(boxes[0]);
console.log(boxes[1]);
console.log(boxes[2]);
