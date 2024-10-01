import java.util.*;
public class Animal {
    String family = "";
    String name = "";
    int age ;
    boolean isMammal ;
    Animal[] animals;
    public Animal(){

    }
    public Animal(String family,String name,int age,boolean isMammel){
        this.family = "cats";
        this.name = "simba";
        this.age = 15;
        this.isMammal =true;
    }

    public void  displayZoo() {
        System.out.println("family:"+family+" "+"name:"+name+" "+"age:"+age+" "+"isMammal:"+isMammal);
    }
    @Override
    public String toString() {
        return "Animal{" +"family='" + family + '\'' + ", name='" + name + '\'' + ", age=" + age + ", isMammal=" + isMammal + '}';
    }
}


