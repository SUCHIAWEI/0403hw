import javax.print.DocFlavor;

public class 卡通1 extends person{
    private String  magic;
    private String  scaredthing;

    public 卡通1(String cartoonname1,String name1,String sex1,String magic1 ,String scaredthing1){
        super(cartoonname1, name1, sex1);
        this.setMagic(magic1);
        this.setScaredthing(scaredthing1);
    }

    public void setMagic (String magic1){this.magic=magic1;}

    public String getMagic() {
        return magic;
    }

    public void setScaredthing (String scaredthing1){this.scaredthing=scaredthing1;}

    public String getScaredthing() {
        return scaredthing;
    }
}
