package jp.ac.uryukyu.ie.e215724;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    
    /**
     * HPを取得するゲッター
     * @return　EnemyのHP
     */
    public int getHitPoint(){
        return hitPoint;
    }
    /**
     * 攻撃値を取得するゲッター
     * @return　Enemyの攻撃値
     */
    public int getAttack(){
        return attack;
    }
    
    /**
     * 名前を設定するセッター
     * @param name 設定したい名前
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * HPを設定するセッター
     * @param hitPoint 設定したいHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    /**
     * 攻撃値を設定するセッター
     * @param attack　設定したい攻撃値
     */
    public void setAttack(int attack){
        this.attack = attack;
    }
    /**
     * 生存状態を設定するセッター
     * @param dead 設定したい生存状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

}

