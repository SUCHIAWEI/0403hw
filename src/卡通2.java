public class 卡通2 extends person{

        private String  weapon;
        private String  atk;

        public 卡通2(String cartoonname1,String name1,String sex1,String weapon1 ,String atk1){
            super(cartoonname1, name1, sex1);
            this.setWeapon(weapon1);
            this.setAtk(atk1);
        }

        public void setWeapon (String weapon1){this.weapon=weapon1;}

        public String getWeapon() {
            return weapon;
        }

        public void setAtk (String atk1){this.atk=atk1;}

        public String getAtk() {
            return atk;
        }
    }

