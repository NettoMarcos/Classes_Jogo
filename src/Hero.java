public class Hero {
    private String name;
    private Integer age;
    private String tipe;

    public Hero(String name, int age, String tipe){
        this.name = name;
        this.age = age;
        this.tipe = tipe;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getTipe() {
        return tipe;
    }
    public String atack() {

        String atack = "";

        if (tipe.equals("Guerreiro")) {
             atack = "espada";
        } else if (tipe.equals("Mago")) {
             atack = "magia";
        } else if (tipe.equals("Monge")) {
             atack = "artes marciais";
        } else if (tipe.equals("Ninja")) {
             atack = "shuriken";
        }
        return atack;
    }
    public String toString(){
        return tipe + " atacou usando " + atack();
    }
}
