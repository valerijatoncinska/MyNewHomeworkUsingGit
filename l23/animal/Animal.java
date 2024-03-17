package MyNewHomeworkUsingGit.l23.animal;

class Animal {
    String name;
    int age;
    String breed;

    @Override
    public boolean equals(Object obj){
        if (this == obj)
        return true;
        if (obj == null || getClass() != obj.getClass());
        return false;
    }

    public boolean animal(Object obj){
        Animal animal = (Animal) obj;
        return age == animal.age && (
                name == null ? animal.name == null : name.equals(animal.name)
        );
    }

    @Override
    public int hashCode (){
        int result = name != null ? name.hashCode() : 0; result = Integer.parseInt(31 * result + age + breed);
        return result;
    }

    public Animal (String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    protected void makesSound (){
        System.out.println(this.name + " makes a random sound\n");
    }
}
