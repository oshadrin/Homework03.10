package drivers;

import transport.Bus;

public class CategoryD extends Driver<Bus>{

    public CategoryD(String fullName, String license, int experience, Bus car) {
        super(fullName, license, experience, car);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void fillUp() {
        super.fillUp();
    }
}
