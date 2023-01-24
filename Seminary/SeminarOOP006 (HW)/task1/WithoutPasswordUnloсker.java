package task1;

public class WithoutPasswordUnloсker implements PhoneUnloсker {

    @Override
    public void unlock() {
        System.out.println("Телефон разблакирован безПароля");
    }
}
