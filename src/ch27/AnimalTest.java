package ch27;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args){

        Animal animal=new Animal();
        Animal animalH=new Human(); // 업 캐스팅
        Animal animalT=new Tiger();
        Animal animalE=new Eagle();

        Human human=new Human();
        animal=human;
        animal.move();
        Human human1=(Human) animal; // 다운 캐스팅


        ArrayList<Animal> animalList=new ArrayList<>();
        animalList.add(animal);
        animalList.add(animalH);
        animalList.add(animalT);
        animalList.add(animalE);

        testDownCasting(animalList);


    }

    public static void testDownCasting(ArrayList<Animal> list){

        for(int i=0;i<list.size();i++){
            Animal animal=list.get(i);

            if(animal instanceof Human){
                Human human=(Human) animal; // 다운캐스팅
                human.readBooks();
            }else if(animal instanceof Tiger){
                Tiger tiger=(Tiger) animal;
                tiger.hunting();
            }else if(animal instanceof Eagle){
                Eagle eagle=(Eagle) animal;
                eagle.flying();
            }else{
                System.out.println("error");
            }
        }

    }

}
