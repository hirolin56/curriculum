let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装する
function isEven(){
    for(let i = 0; i < numbers.length; i++){
        let num = numbers[i];
        if (num % 2 === 0) {
            console.log(num + 'は偶数です。');
        }
    }
}
isEven();

class Car{
    
    getNumGas(){
        console.log('ガソリンは○○です。ナンバーは△△です。');
    }
}

let car = new Car();
car.getNumGas();