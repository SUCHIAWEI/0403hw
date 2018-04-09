
public class person {

        private String cartoonname;
        private String name;
        private String sex ;

        public person(String cartoonname1,String name1,String sex1) {
            setName(name1);
            setSex(sex1);
            setCartoonname(cartoonname1);

        }


    public void setCartoonname (String cartoonname1){

        if (cartoonname1.length() > 30) {
            cartoonname = cartoonname1.substring(0, 30);
            System.out.println("error names are so long");

        } else {
            cartoonname = cartoonname1;
        }
    }
    public String getCartoonname() {
        return cartoonname;
    }

        public void setName (String name1){

            if (name1.length() > 30) {
                name = name1.substring(0, 30);
                System.out.println("error names are so long");

            } else {
                name = name1;
            }
        }
        public String getName() {
        return name;
    }
        public void setSex(String sex1) {
            this.sex = sex1;


        }

        public String getSex() {
            return sex;

        }


    }

