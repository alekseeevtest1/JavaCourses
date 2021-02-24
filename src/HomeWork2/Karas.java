package HomeWork2;

public class Karas extends Fish {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public byte getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(byte weight) {
        super.setWeight(weight);
    }

    @Override
    public float getMoney() {
        return super.getMoney();
    }

    @Override
    public void setMoney(float money) {
        if (isNoHead()){
            super.setMoney(money + 25);

        }else {
            super.setMoney(money);
        }
    }

    @Override
    public boolean isNoHead() {
        return super.isNoHead();
    }

    @Override
    public void setNoHead(boolean noHead) {
        super.setNoHead(noHead);
    }


}
