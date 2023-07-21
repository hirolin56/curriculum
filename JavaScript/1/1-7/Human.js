//Humanクラスを作成
class Human {
    //コンストラクタ（yamadaと25という値を受け取るための処理を書く）
    constructor(name, height, weight, gender, age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }
    //歩くメソッド(関数)作成
walk(){
    console.log(`身長${this.height}cm、体重${this.weight}kg, ${this.name}という${this.gender}が歩きました`);
    }
}
//Humanクラスをインスタンス化して、yamadaを作成
let yamada = new Human('yamada', 170, 60, '男', 30);
yamada.walk();
//「鈴木」オブジェクト作成
let suzuki = new Human('suzuki', 180, 70, '男', 35);