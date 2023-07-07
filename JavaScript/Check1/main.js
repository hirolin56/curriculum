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
    constructor(gasoline, number){
        this.gasoline = gasoline;
        this.number = number;
    }
    
    getNumGas(){
        console.log('ガソリンは' + this.gasoline + 'です。ナンバーは' + this.number + 'です。');
    }
}

let car = new Car('○○', '△△');
let a = car.getNumGas();