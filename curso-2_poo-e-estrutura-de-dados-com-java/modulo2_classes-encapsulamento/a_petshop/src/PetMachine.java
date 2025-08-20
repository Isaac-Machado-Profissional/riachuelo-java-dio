public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        this.water -= 10; // A cada banho, retira -10 litros de água
        this.shampoo -= 2; // A cada banho, retira -2 litros de shampoo

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo.");
    };

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo. ");
            return;
        }

        water += 2;


    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo. ");
            return;
        }

        shampoo += 2;

    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja! Para colocar o pet é necessário limpá-la.");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet" + this.pet.getName() + " está na máquina neste momento.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {

        this.clean = this.pet.isClean(); // A máquina está limpa se o cachorro sair limpo
        System.out.println("O pet " + this.pet.getName() + " está limpo e foi retirado da máquina.");
        this.pet = null;

    }

    public void wash() {
        this.water -= 3; // A cada lavada da máquina, retira -3 litros de água
        this.shampoo -= 1; // A cada banho, retira -1 litros de shampoo
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }




}
