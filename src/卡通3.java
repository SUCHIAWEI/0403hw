public class 卡通3 extends person{
    private String  animal;
    private String  toys;

    public 卡通3(String cartoonname1,String name1,String sex1,String animal1 ,String toys1){
        super(cartoonname1, name1, sex1);
        this.setAnimal(animal1);
        this.setToys(toys1);
    }

    public void setAnimal (String animal1){this.animal=animal1;}

    public String getAnimal() {
        return animal;
    }

    public void setToys (String toys1){this.toys=toys1;}

    public String getToys() {
        return toys;
    }

}
