

public class Character implements Moving {

    Character(){
        life = 1;
        canAttack = false;
        isBig = false;
    }

    public int life; //최대 3, 최소 0
    public boolean canAttack; //기본값 false
    public boolean isBig = false; //기본값 false

    public void moveLeft(){

    }

    public void moveRight() {

    }
    public void moveJump() {}
    public void moveDown() {}
    public void attack() {}
    public void fallen() {}
    public void meetMonster() {} //: 피격
    public void mushroom() {
        this.isBig = true;
    } //: 버섯 아이템 먹었을 때 변화
    public void fireflower(){
        this.isBig = true;
        this.canAttack = true;
    } // 파이러플라워 먹었을때 변화
    public void obtainCoin(){}
    public void obtainStarcoin() {}
    public void hitBlock() {}
    public void changeScore(int addScore){}
    public void killMonster(){}
}
