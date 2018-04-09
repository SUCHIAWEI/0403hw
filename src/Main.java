public class Main {

    public static void main(String[] args) {
	卡通1 ch1 = new  卡通1("多啦A夢","小叮噹","男生","百寶袋","老鼠");
    卡通2 ch2 = new  卡通2("犬夜叉","阿離","女生","弓箭","3200");
    卡通3 ch3 = new  卡通3("蠟筆小新","野元新之助","男生","小白","動感超人");
        System.out.println("卡通"+":"+ch1.getCartoonname()+"\t"+"角色名"+":"+ch1.getName()+"\t\t"+"性別"+":"+ch1.getSex()+"\t\t"+"魔法"+":"+ch1.getMagic()+"\t"+"害怕的東西"+":"+ch1.getScaredthing()+"\t");
        System.out.println("卡通"+":"+ch2.getCartoonname()+"\t"+"角色名"+":"+ch2.getName()+"\t\t"+"性別"+":"+ch2.getSex()+"\t\t"+"武器"+":"+ch2.getWeapon()+"\t\t"+"攻擊力"+":"+ch2.getAtk()+"\t");
        System.out.println("卡通"+":"+ch3.getCartoonname()+"\t"+"角色名"+":"+ch3.getName()+"\t"+"性別"+":"+ch3.getSex()+"\t\t"+"寵物"+":"+ch3.getAnimal()+"\t\t"+"玩具"+":"+ch3.getToys()+"\t");

    }
}
