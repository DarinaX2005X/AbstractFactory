public class Main {
    public static void main(String[] args) {
        TechFactory appleFactory = new AppleFactory();
        TechFactory lenovoFactory = new LenovoFactory();
        TechFactory sonyFactory = new HuaweiFactory();

        createAndDisplayProducts(appleFactory);
        createAndDisplayProducts(lenovoFactory);
        createAndDisplayProducts(sonyFactory);
    }

    public static void createAndDisplayProducts(TechFactory factory) {
        Phone phone = factory.createPhone();
        Laptop laptop = factory.createLaptop();
        Earbuds earbuds = factory.createEarbuds();

        phone.create();
        laptop.create();
        earbuds.create();
    }
}

interface Phone {
    void create();
}

interface Laptop {
    void create();
}

interface Earbuds {
    void create();
}

interface TechFactory {
    Phone createPhone();
    Laptop createLaptop();
    Earbuds createEarbuds();
}

class ApplePhone implements Phone {
    private String model;
    private int cost;
    private int memory;

    public ApplePhone(String model, int cost, int memory) {
        this.model = model;
        this.cost = cost;
        this.memory = memory;
    }

    public void create() {
        System.out.println("Creating an Apple phone:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge" +
                "\nMemory: " + memory + "\n");
    }
}

class AppleLaptop implements Laptop {
    private String model;
    private int cost;
    private int memory;

    public AppleLaptop(String model, int cost, int memory) {
        this.model = model;
        this.cost = cost;
        this.memory = memory;
    }

    public void create() {
        System.out.println("Creating an Apple laptop:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge" +
                "\nMemory: " + memory + "\n");
    }
}

class AppleEarbuds implements Earbuds {
    private String model;
    private int cost;

    public AppleEarbuds(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public void create() {
        System.out.println("Creating an Apple earbuds:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge\n");
    }
}

class AppleFactory implements TechFactory {
    public Phone createPhone() {
        return new ApplePhone("iPhone 14", 469000, 256);
    }

    public Laptop createLaptop() {
        return new AppleLaptop("MacBook Pro M1", 999990, 512);
    }

    public Earbuds createEarbuds() {
        return new AppleEarbuds("AirPods Pro 2", 199990);
    }
}

class LenovoPhone implements Phone {
    private String model;
    private int cost;
    private int memory;

    public LenovoPhone(String model, int cost, int memory) {
        this.model = model;
        this.cost = cost;
        this.memory = memory;
    }

    public void create() {
        System.out.println("Creating a Lenovo phone:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge" +
                "\nMemory: " + memory + "\n");
    }
}

class LenovoLaptop implements Laptop {
    private String model;
    private int cost;
    private int memory;

    public LenovoLaptop(String model, int cost, int memory) {
        this.model = model;
        this.cost = cost;
        this.memory = memory;
    }

    public void create() {
        System.out.println("Creating a Lenovo laptop:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge" +
                "\nMemory: " + memory + "\n");
    }
}

class LenovoEarbuds implements Earbuds {
    private String model;
    private int cost;

    public LenovoEarbuds(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public void create() {
        System.out.println("Creating a Lenovo earbuds:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge\n");
    }
}

class LenovoFactory implements TechFactory {
    public Phone createPhone() {
        return new LenovoPhone("Lenovo A7010", 64695, 32);
    }

    public Laptop createLaptop() {
        return new LenovoLaptop("Lenovo IdeaPad S3", 183992, 512);
    }

    public Earbuds createEarbuds() {
        return new LenovoEarbuds("Lenovo LivePods LP1", 6990);
    }
}

class HuaweiPhone implements Phone {
    private String model;
    private int cost;
    private int memory;

    public HuaweiPhone(String model, int cost, int memory) {
        this.model = model;
        this.cost = cost;
        this.memory = memory;
    }

    public void create() {
        System.out.println("Creating a Huawei phone:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge" +
                "\nMemory: " + memory + "\n");
    }
}

class HuaweiLaptop implements Laptop {
    private String model;
    private int cost;
    private int memory;

    public HuaweiLaptop(String model, int cost, int memory) {
        this.model = model;
        this.cost = cost;
        this.memory = memory;
    }

    public void create() {
        System.out.println("Creating a Huawei laptop:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge" +
                "\nMemory: " + memory + "\n");
    }
}

class HuaweiEarbuds implements Earbuds {
    private String model;
    private int cost;

    public HuaweiEarbuds(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public void create() {
        System.out.println("Creating a Huawei earbuds:" +
                "\nModel: " + model +
                "\nCost: " + cost + " tenge\n");
    }
}

class HuaweiFactory implements TechFactory {
    public Phone createPhone() {
        return new HuaweiPhone("Xperia 5", 315990, 128);
    }

    public Laptop createLaptop() {
        return new HuaweiLaptop("HUAWEI MateBook D15", 259990, 256);
    }

    public Earbuds createEarbuds() {
        return new HuaweiEarbuds("Huawei FreeBuds 5i", 34990);
    }
}