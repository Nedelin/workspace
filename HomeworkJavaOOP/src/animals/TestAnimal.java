package animals;

public class TestAnimal {

	public static void main(String[] args) {
		Frog frog = new Frog(10,"Ivan",Gender.Male);
        Cat cat = new Cat(10,"Asen",Gender.Female);
        Dog dog = new Dog(10,"Pesho", Gender.Male);
        Kitten kitten = new Kitten(10, "Mimi", Gender.Female);
        Tomcat tomcat = new Tomcat(10, "Max", Gender.Male);

        Animal[] animals ={frog,cat, dog, kitten,tomcat};

        for(Animal animal: animals){
            if(animal instanceof Frog){
                System.out.println(frog.getName());
                System.out.println(frog.getAge());
                System.out.println(frog.animalSound());
            }
            if(animal instanceof Cat){
                System.out.println(cat.getName());
                System.out.println(cat.getAge());
                System.out.println(cat.animalSound());
            }
            if(animal instanceof Dog){
                System.out.println(dog.getName());
                System.out.println(dog.getAge());
                System.out.println(dog.animalSound());
            }
            if(animal instanceof Kitten){
                System.out.println(kitten.getName());
                System.out.println(kitten.getAge());
                System.out.println(kitten.animalSound());
            }
            if(animal instanceof Tomcat){
                System.out.println(tomcat.getName());
                System.out.println(tomcat.getAge());
                System.out.println(tomcat.animalSound());
            }
        }
    }
}