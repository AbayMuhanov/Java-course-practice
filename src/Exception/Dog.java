package Exception;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводот надет");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура идём гулять " + name + " очень рад");
        } else {
throw  new DogIsNotReadyException("Сабака "+ name + "не готова к проулке! Проверьте экипировку");
        }
    }
}
