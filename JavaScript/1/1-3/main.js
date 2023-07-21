// 問1：次の条件を、論理演算子を使って表してください。
let a = 10;
let b = 15;
let x = 10;
let y = 0;

if(a !== 10){
    console.log("true");
}

if(b >= 10 && b < 20 && b % 2 === 0){
    console.log("true");
}

// 問2：以下の条件を満たすように、記述してください
if(x >= 10 && x <= 20){
    console.log("成功です");
}else {
    console.log("失敗です");
}

// 問3：以下の条件を満たすように、記述してください
if(y % 2 === 0){
    console.log("偶数です");
}else if(y % 2 === 1){
    console.log("奇数です");
}